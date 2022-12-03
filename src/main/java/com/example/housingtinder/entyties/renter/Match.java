package com.example.housingtinder.entyties.renter;

import jakarta.persistence.*;

@Entity
public class Match {

    @Id
    @GeneratedValue
    private int Id;

    @ManyToOne
    @JoinColumn(name = "Id")
    private Renter first_id;

    @ManyToOne
    @JoinColumn(name = "Id")
    private Renter second_id;

    public Match() {
    }
}
