package com.example.housingtinder.services;

import com.example.housingtinder.entyties.renter.Characteristics;
import com.example.housingtinder.entyties.renter.Renter;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RenterService implements IRenterService{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Renter> getRenters() {
        return entityManager.createQuery("select r from Renter r").getResultList();
    }

    @Override
    public List<Renter> getRenters(List<Characteristics> characteristics) {
        Set<Renter> result = new HashSet<>();

        for (var characteristic:characteristics) {
            var k =( entityManager.createQuery("SELECT r from Renter r JOIN renter_characteristic rc on" +
                    " r.renter_id = rc.renter_id where rc.characteristic_id =: characteristic ")
                    .setParameter("characteristic", characteristic)
                    .getResultList());
            for (var inK: k) {
                result.add((Renter) inK);
            }
        }

        return result.stream().toList();
        /*List<Integer> characteristic_id = new ArrayList<>();
        for (int i=0; i<characteristics.size(); i++){
            characteristic_id.add(characteristics.get(i).getCharacteristics_Id());
        }

        List<Integer> people_id = new ArrayList<>();

        for(int i=0; i<characteristic_id.size(); i++){
            var people = entityManager.createQuery("select r.renter_id from renter_characteristic r where r.characteristic_id =: characteristic")
                    .setParameter("characteristic",characteristic_id.get(i)).getResultList();
            for(int j=0; j<people.size(); j++) {
                people_id.add((Integer) people.get(j));
            }
        }

        Set<Integer> dontRepeat = new HashSet<>();
        for (int i=0; i< people_id.size(); i++){
            dontRepeat.add(people_id.get(i));
        }

        var k = dontRepeat.toArray();

        List<Integer> result = new ArrayList<>();
        for (int i=0; i<k.length; i++){
            int counter =0;
            for (int j=0; j< people_id.size(); j++){
                if(people_id.get(j) == k[i]){
                    counter++;
                }
            }
            if (counter>=characteristics.size()/2){
                result.add((Integer) k[i]);
            }
        }

        List<Renter> finish= new ArrayList<>();

        for (int i=0; i< result.size(); i++){
            finish.add((Renter) entityManager.createQuery("select r from Renter r where r.renter_id =: renter_id")
                            .setParameter("renter_id", result.get(i))
                    .getResultList().get(0));
        }

        return finish;
        */

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
