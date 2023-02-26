package com.edelhome.edelhomeDB.model;

import lombok.*;

@Value
public class AppUser 
{
    Long id;
    String login;
    String pass;
    boolean is_admin;
}