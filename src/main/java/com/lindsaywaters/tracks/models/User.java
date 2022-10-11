package com.lindsaywaters.tracks.models;

import javax.persistence.Entity;

@Entity
public class User extends AbstractEntity {

    private String username;

    private String password;

    private String email;

    private String zipcode;


    public User() {
    }

    public User(String username, String password, String email, String zipcode) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.zipcode = zipcode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}