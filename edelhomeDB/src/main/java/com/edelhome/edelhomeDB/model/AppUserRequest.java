package com.edelhome.edelhomeDB.model;

import lombok.Data;

@Data
public class AppUserRequest {
    String login;
    String pass;
    boolean is_admin;
}
