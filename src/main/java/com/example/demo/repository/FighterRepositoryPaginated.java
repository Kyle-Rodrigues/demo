package com.example.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.model.Fighter;


public interface FighterRepositoryPaginated extends PagingAndSortingRepository<Fighter, Long> {
}