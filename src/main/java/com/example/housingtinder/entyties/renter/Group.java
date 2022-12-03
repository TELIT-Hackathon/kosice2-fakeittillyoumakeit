package com.example.housingtinder.entyties.renter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Group {

    @Id
    @GeneratedValue
    private int id;

    @OneToMany(mappedBy = "Id")
    private List<Renter> renter_id;

}
