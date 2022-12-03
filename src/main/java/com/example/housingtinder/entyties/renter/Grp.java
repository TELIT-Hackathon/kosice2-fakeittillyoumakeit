package com.example.housingtinder.entyties.renter;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Grp {

    @Id
    @GeneratedValue
    private int id;


    @ManyToMany(targetEntity = Renter.class, cascade = { CascadeType.ALL })
    @JoinTable(
            name = "renter_group",
            joinColumns = {@JoinColumn(name = "group_id")},
            inverseJoinColumns = {@JoinColumn(name = "renter_id")}
    )
    private List<Renter> renters = new ArrayList<>();

}
