package com.example.housingtinder.services;

import com.example.housingtinder.entyties.renter.Characteristics;
import com.example.housingtinder.entyties.renter.Renter;

import java.util.ArrayList;
import java.util.List;

public interface IRenterService {
    public List<Renter> getRenters();

    public List<Renter> getRenters(List<Characteristics> characteristics);
}
