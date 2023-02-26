package com.edelhome.edelhomeDB.mapper;

import com.edelhome.edelhomeDB.model.AppUser;
import com.edelhome.edelhomeDB.model.AppUserRequest;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-26T19:10:58+0300",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230213-1046, environment: Java 17.0.6 (Eclipse Adoptium)"
)
@Component
public class AppUserToDtoMapperImpl implements AppUserToDtoMapper {

    @Override
    public AppUser AddAppUserRequestToAppUser(AppUserRequest appuserRequest) {
        if ( appuserRequest == null ) {
            return null;
        }

        String login = null;
        String pass = null;

        login = appuserRequest.getLogin();
        pass = appuserRequest.getPass();

        Long id = null;
        boolean is_admin = false;

        AppUser appUser = new AppUser( id, login, pass, is_admin );

        return appUser;
    }

    @Override
    public AppUser EditAppUserRequestToAppUser(Long id, AppUserRequest appuserRequest) {
        if ( id == null && appuserRequest == null ) {
            return null;
        }

        Long id1 = null;
        if ( id != null ) {
            id1 = id;
        }
        String login = null;
        String pass = null;
        if ( appuserRequest != null ) {
            login = appuserRequest.getLogin();
            pass = appuserRequest.getPass();
        }

        boolean is_admin = false;

        AppUser appUser = new AppUser( id1, login, pass, is_admin );

        return appUser;
    }
}
