package com.example.housingtinder.services;

import com.example.housingtinder.entyties.renter.Characteristics;
import com.example.housingtinder.entyties.renter.Renter;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


import java.util.ArrayList;
import java.util.List;

public class RenterService implements IRenterService{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Renter> getRenters() {
        return entityManager.createQuery("select r from Renter r").getResultList();
    }


    public List<Renter> getRenters(ArrayList<Characteristics> characteristics) {
        List<Integer> characteristic_id = new ArrayList<>();
        for (int i=0; i<characteristics.size(); i++){
            characteristic_id.add(characteristics.get(i).getCharacteristics_Id());
        }
        return entityManager.createQuery("select r from Renter r").getResultList();
    }
/*
    @PersistenceContext
    EntityManager entityManager;

    public void addRenter(Renter renter){
        entityManager.persist(renter);
    }

    public List<Renter> getRenters(){
        return entityManager.createQuery("select r from Renter r").getResultList();
    }*/
}
