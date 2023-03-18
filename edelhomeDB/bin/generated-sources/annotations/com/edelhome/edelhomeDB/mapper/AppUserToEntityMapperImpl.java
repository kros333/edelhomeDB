package com.edelhome.edelhomeDB.mapper;

import com.edelhome.edelhomeDB.dao.AppUserEntity;
import com.edelhome.edelhomeDB.model.AppUser;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-12T13:55:27+0300",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230213-1046, environment: Java 17.0.6 (Eclipse Adoptium)"
)
@Component
public class AppUserToEntityMapperImpl implements AppUserToEntityMapper {

    @Override
    public AppUserEntity appUserToAppUserEntity(AppUser appUser) {
        if ( appUser == null ) {
            return null;
        }

        AppUserEntity appUserEntity = new AppUserEntity();

        appUserEntity.setIsadmin( appUser.isIsadmin() );
        appUserEntity.setLogin( appUser.getLogin() );
        appUserEntity.setPass( appUser.getPass() );
        appUserEntity.setUserid( appUser.getUserid() );

        return appUserEntity;
    }

    @Override
    public AppUser appUserEntityToAppUser(AppUserEntity appUserEntity) {
        if ( appUserEntity == null ) {
            return null;
        }

        Long userid = null;
        String login = null;
        String pass = null;
        boolean isadmin = false;

        userid = appUserEntity.getUserid();
        login = appUserEntity.getLogin();
        pass = appUserEntity.getPass();
        isadmin = appUserEntity.isIsadmin();

        AppUser appUser = new AppUser( userid, login, pass, isadmin );

        return appUser;
    }
}
