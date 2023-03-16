package com.example.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Fighter;

@Repository
public interface FighterRepositoryPaginated extends PagingAndSortingRepository<Fighter, Long> {
}