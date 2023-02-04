package com.example.demo.repository;

import java.util.Optional;

import com.example.demo.model.Fighter;

public interface FighterRepository{
    Iterable<Fighter> findAll();
    Optional<Fighter> findById(long id);
    int save(Fighter fighter);
    
}