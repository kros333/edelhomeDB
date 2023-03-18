package com.edelhome.edelhomeDB.model;

import lombok.*;

@Value
public class AppUser 
{
    Long userid;
    String login;
    String pass;
    boolean isadmin;
}