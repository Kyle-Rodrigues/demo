package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Fighter;
import com.example.demo.model.Fighter.Anime;

@Repository
public interface FighterRepository extends CrudRepository<Fighter, Long>{
    List<Fighter> findByAnimeFrom(Anime anime);

    List<Fighter> findByNameStartsWithAndCreatedAtBetween(String name, LocalDate startDate, LocalDate endDate);
}