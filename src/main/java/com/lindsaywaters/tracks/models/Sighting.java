package com.lindsaywaters.tracks.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.sql.Time;
import java.text.DateFormat;
import java.util.Date;

import java.util.List;
import java.util.Optional;

@Entity
public class Sighting extends AbstractEntity{
    @ManyToOne
    private User user;

    private String sightingDate;

    private String sightingTime;

    private String description;


    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipcode;

    private String location;

    public Sighting() {
    }

    public Sighting(String sightingDate, String sightingTime, String description, String address1, String address2, String city, String state, String zipcode, String location) {

        this.sightingDate = sightingDate;
        this.sightingTime = sightingTime;
        this.description = description;

        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.location = location;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getSightingDate() {
        return sightingDate;
    }

    public void setSightingDate(String sightingDate) {
        this.sightingDate = sightingDate;
    }

    public String getSightingTime() {
        return sightingTime;
    }

    public void setSightingTime(String sightingTime) {
        this.sightingTime = sightingTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }



    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

