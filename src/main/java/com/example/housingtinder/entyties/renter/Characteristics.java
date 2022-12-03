package com.example.housingtinder.entyties.renter;


import jakarta.persistence.*;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Characteristics {

    @Id
    @GeneratedValue
    private int Characteristics_Id;

    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCharacteristics_Id() {
        return Characteristics_Id;
    }

    public List<Renter> getRenters() {
        return renters;
    }

    public void setRenters(Renter renter) {
        this.renters.add(renter);
    }

    @ManyToMany(targetEntity = Renter.class, cascade = { CascadeType.ALL })
    @JoinTable(
            name = "renter_characteristic",
            joinColumns = {@JoinColumn(name = "characteristic_id")},
            inverseJoinColumns = {@JoinColumn(name = "renter_id")}
    )
    private List<Renter> renters = new ArrayList<>();



    /*
    @ManyToOne
    @JoinColumn(name="renter_id")
    private Renter renter;*/


}
