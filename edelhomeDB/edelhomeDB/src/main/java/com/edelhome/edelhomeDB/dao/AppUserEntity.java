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
    private Long userid;
    @Column(unique=true)
    private String login;

    private String pass;

    private boolean isadmin;
}
