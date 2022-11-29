package com.lindsaywaters.tracks.models;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import javax.persistence.Entity;

@Entity
public class User extends AbstractEntity {

    private String username;



    private String hashcode;
    private String email;

    private String zipcode;

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    public User() {
    }

    public User(String username, String password, String email, String zipcode) {
        this.username = username;
        this.hashcode = encoder.encode(password);
        this.email = email;
        this.zipcode = zipcode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public void setHashcode(String password) {
        this.hashcode = encoder.encode(password);
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