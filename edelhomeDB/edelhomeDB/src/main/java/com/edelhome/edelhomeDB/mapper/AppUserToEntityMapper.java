package com.edelhome.edelhomeDB.mapper;
import org.mapstruct.Mapper;

import com.edelhome.edelhomeDB.dao.AppUserEntity;
import com.edelhome.edelhomeDB.model.AppUser;

@Mapper(componentModel = "spring")
public interface AppUserToEntityMapper {
    AppUserEntity appUserToAppUserEntity(AppUser appUser);
    AppUser appUserEntityToAppUser(AppUserEntity appUserEntity);
}
