package com.example.housingtinder.entyties.renter;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Renter {

    public Renter(){

    }

    @Id
    @GeneratedValue
    private int renter_id;
    private String photo;
    private String description;
    private String name;
    private String email;
    private int age;
    private int childCount;
    private int AdultCount;

/*
    @OneToMany(mappedBy = "Characteristics_Id")
    private List<Characteristics> characteristic_id;
*/

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getChildCount() {
        return childCount;
    }

    public void setChildCount(int childCount) {
        this.childCount = childCount;
    }

    public int getAdultCount() {
        return AdultCount;
    }

    public void setAdultCount(int adultCount) {
        AdultCount = adultCount;
    }

    @ManyToMany(mappedBy = "renters")
    private List<Characteristics> characteristics = new ArrayList<>();

    @OneToMany(mappedBy = "Id")
    private List<Match> matches_id;

    @ManyToMany(mappedBy = "renters")
    private List<Grp> groups = new ArrayList<>();

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
