package com.example.housingtinder.services;

import com.example.housingtinder.entyties.renter.Renter;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

public class RenterService implements IRenterService{

    @PersistenceContext
    EntityManager entityManager;

    public void addRenter(Renter renter){
        entityManager.persist(renter);
    }

    public List<Renter> getRenters(){
        return entityManager.createQuery("select r from Renter r").getResultList();
    }
}
