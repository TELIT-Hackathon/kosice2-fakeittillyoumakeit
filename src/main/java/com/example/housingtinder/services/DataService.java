package com.example.housingtinder.services;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
public class DataService {

    @PersistenceContext
    private EntityManager entityManager;

}
