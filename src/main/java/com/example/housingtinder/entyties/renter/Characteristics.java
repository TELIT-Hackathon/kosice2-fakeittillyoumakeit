package com.example.housingtinder.entyties.renter;


import jakarta.persistence.*;
import jakarta.persistence.Id;


@Entity
public class Characteristics {

    @Id
    @GeneratedValue
    private int Id;

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

    @ManyToOne
    @JoinColumn(name="renter_id")
    private Renter renter;


}
