package com.edelhome.edelhomeDB.dao;

import jakarta.persistence.*;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "app_user")
public class AppUserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String login;

    private String pass;

    private boolean is_admin;
}
