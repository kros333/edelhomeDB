package com.edelhome.edelhomeDB.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface AppUserRepository extends CrudRepository<AppUserEntity, Long>
{
    AppUserEntity findByLogin(String login);
    List<AppUserEntity> findAllByIsadmin(Boolean isadmin);
}
