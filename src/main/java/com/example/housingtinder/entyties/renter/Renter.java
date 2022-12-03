package com.example.housingtinder.entyties.renter;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class Renter {

    public Renter(){

    }

    @Id
    @GeneratedValue
    private int Id;

    private String photo;
    private String description;
    private String name;
    private String email;
    @OneToMany(mappedBy = "Id")
    private List<Characteristics> characteristic_id;

    @OneToMany(mappedBy = "Id")
    private List<Match> matches_id;

    @ManyToMany(mappedBy = "renters")
    private List<Group> groups = new ArrayList<>();

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
