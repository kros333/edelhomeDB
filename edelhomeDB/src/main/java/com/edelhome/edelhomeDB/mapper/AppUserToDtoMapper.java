package com.edelhome.edelhomeDB.mapper;

import org.mapstruct.Mapper;
import com.edelhome.edelhomeDB.model.AppUser;
import com.edelhome.edelhomeDB.model.AppUserRequest;

@Mapper(componentModel = "spring")
public interface AppUserToDtoMapper {
    AppUser AddAppUserRequestToAppUser(AppUserRequest appuserRequest);
    AppUser EditAppUserRequestToAppUser(Long userid, AppUserRequest appuserRequest);
}
