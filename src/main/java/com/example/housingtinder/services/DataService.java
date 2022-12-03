package com.example.housingtinder.services;

import org.springframework.ui.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

@Transactional
public class DataService {

    @PersistenceContext
    private EntityManager entityManager;


}
