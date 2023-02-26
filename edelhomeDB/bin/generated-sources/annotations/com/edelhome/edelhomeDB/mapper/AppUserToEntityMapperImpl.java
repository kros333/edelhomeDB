package com.edelhome.edelhomeDB.mapper;

import com.edelhome.edelhomeDB.dao.AppUserEntity;
import com.edelhome.edelhomeDB.model.AppUser;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-26T19:10:58+0300",
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

        appUserEntity.setId( appUser.getId() );
        appUserEntity.setLogin( appUser.getLogin() );
        appUserEntity.setPass( appUser.getPass() );
        appUserEntity.set_admin( appUser.is_admin() );

        return appUserEntity;
    }

    @Override
    public AppUser appUserEntityToAppUser(AppUserEntity appUserEntity) {
        if ( appUserEntity == null ) {
            return null;
        }

        Long id = null;
        String login = null;
        String pass = null;

        id = appUserEntity.getId();
        login = appUserEntity.getLogin();
        pass = appUserEntity.getPass();

        boolean is_admin = false;

        AppUser appUser = new AppUser( id, login, pass, is_admin );

        return appUser;
    }
}
