package com.edelhome.edelhomeDB.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.*;

import com.edelhome.edelhomeDB.dao.AppUserEntity;
import com.edelhome.edelhomeDB.dao.AppUserRepository;
import com.edelhome.edelhomeDB.exception.NotFoundException;
import com.edelhome.edelhomeDB.mapper.AppUserToEntityMapper;
import com.edelhome.edelhomeDB.model.AppUser;

import lombok.*;

@Service
@RequiredArgsConstructor
public class DefaultAppUserService implements AppUserService{
    

    private final AppUserRepository appuserRepository;
    private final AppUserToEntityMapper mapper;


    @Override
    public AppUser getAppUserByUserid(Long userid) {
        AppUserEntity appuserEntity = appuserRepository
                .findById(userid)
                .orElseThrow(() -> new NotFoundException("AppUser not found: userid = " + userid));

        return mapper.appUserEntityToAppUser(appuserEntity);
    }

    @Override
    public AppUser getAppUserByLogin(String login) {
        AppUserEntity appuserEntity = appuserRepository.findByLogin(login);
        if (appuserEntity == null) {
            throw new NotFoundException("AppUser not found: login = " + login);
        }
        return mapper.appUserEntityToAppUser(appuserEntity);
    }

    @Override
    public List<AppUser> getAllAppUsers() {
        Iterable<AppUserEntity> iterable = appuserRepository.findAll();

        ArrayList<AppUser> appusers = new ArrayList<>();
        for (AppUserEntity appuserEntity : iterable) {
            appusers.add(mapper.appUserEntityToAppUser(appuserEntity));
        }

        return appusers;
    }

    @Override
    public List<AppUser> findAllByIsadmin(Boolean isadmin) {
        Iterable<AppUserEntity> iterable = appuserRepository.findAllByIsadmin(isadmin);

        ArrayList<AppUser> appusers = new ArrayList<>();
        for (AppUserEntity appuserEntity : iterable) {
            appusers.add(mapper.appUserEntityToAppUser(appuserEntity));
        }

        return appusers;
    }

    @Override
    public void addAppUser(AppUser appuser) {
        AppUserEntity appuserEntity = mapper.appUserToAppUserEntity(appuser);
        appuserRepository.save(appuserEntity);
    }

    @Override
    public void editAppUser(AppUser appuser) {
        if (!appuserRepository.existsById(appuser.getUserid()))
            throw new NotFoundException("AppUser not found: id = " + appuser.getUserid());

        AppUserEntity appuserEntity = mapper.appUserToAppUserEntity(appuser);
        appuserRepository.save(appuserEntity);

    }
}
