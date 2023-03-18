package com.edelhome.edelhomeDB.service;

import java.util.List;

import com.edelhome.edelhomeDB.model.AppUser;
import com.edelhome.edelhomeDB.dao.AppUserRepository;
public interface AppUserService {
    AppUser getAppUserByUserid(Long userid);// получить пользователя по id
    AppUser getAppUserByLogin(String login);
    List<AppUser> getAllAppUsers();// получить список всех пользователей
    List<AppUser> findAllByIsadmin(Boolean isadmin);
    void addAppUser(AppUser appUser);// добавить пользователя
    void editAppUser(AppUser appUser);
}
