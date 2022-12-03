package com.example.housingtinder.entyties.renter;

import jakarta.persistence.*;

@Entity
public class Match {

    @Id
    @GeneratedValue
    private int Id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "first_id")
    private Renter first_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "second_id")
    private Renter second_id;

    public Match() {
    }
}
