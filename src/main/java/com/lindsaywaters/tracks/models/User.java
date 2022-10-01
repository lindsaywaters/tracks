package com.lindsaywaters.tracks.models;

import javax.persistence.Entity;

@Entity
public class User extends AbstractEntity {

    private String userName;

    private String password;

    private String email;


}