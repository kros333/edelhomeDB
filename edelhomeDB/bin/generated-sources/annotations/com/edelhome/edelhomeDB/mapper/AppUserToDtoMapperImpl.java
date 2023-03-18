package com.edelhome.edelhomeDB.mapper;

import com.edelhome.edelhomeDB.model.AppUser;
import com.edelhome.edelhomeDB.model.AppUserRequest;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-12T13:55:27+0300",
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
        boolean isadmin = false;

        login = appuserRequest.getLogin();
        pass = appuserRequest.getPass();
        isadmin = appuserRequest.isIsadmin();

        Long userid = null;

        AppUser appUser = new AppUser( userid, login, pass, isadmin );

        return appUser;
    }

    @Override
    public AppUser EditAppUserRequestToAppUser(Long userid, AppUserRequest appuserRequest) {
        if ( userid == null && appuserRequest == null ) {
            return null;
        }

        Long userid1 = null;
        if ( userid != null ) {
            userid1 = userid;
        }
        String login = null;
        String pass = null;
        boolean isadmin = false;
        if ( appuserRequest != null ) {
            login = appuserRequest.getLogin();
            pass = appuserRequest.getPass();
            isadmin = appuserRequest.isIsadmin();
        }

        AppUser appUser = new AppUser( userid1, login, pass, isadmin );

        return appUser;
    }
}
