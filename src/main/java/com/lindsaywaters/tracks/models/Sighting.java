package com.lindsaywaters.tracks.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.sql.Time;
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

    public Sighting() {
    }

    public Sighting(String sightingDate, String sightingTime, String description) {
        this.sightingDate = sightingDate;
        this.sightingTime = sightingTime;
        this.description = description;
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
}

