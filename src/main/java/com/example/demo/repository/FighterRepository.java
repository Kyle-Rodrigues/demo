package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Fighter;
import com.example.demo.model.Fighter.Anime;

public interface FighterRepository extends CrudRepository<Fighter, Long>{
    List<Fighter> findByAnimeFrom(Anime anime);

    List<Fighter> findByNameStartsWithAndCreatedAtBetween(String name, LocalDate startDate, LocalDate endDate);
}