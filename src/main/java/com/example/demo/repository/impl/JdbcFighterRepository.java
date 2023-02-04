package com.example.demo.repository.impl;

import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Fighter;
import com.example.demo.repository.FighterRepository;

@Repository
public class JdbcFighterRepository implements FighterRepository {
    private JdbcTemplate jdbcTemplate;

    public JdbcFighterRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Iterable<Fighter> findAll() {
        return jdbcTemplate.query("SELECT * FROM fighter", (rs, rowNum) -> {
            return Fighter.builder()
                .id(rs.getLong("id"))
                .name(rs.getString("name"))
                .build();
        });
    }

    @Override
    public Optional<Fighter> findById(long id) {
        Fighter fighter = jdbcTemplate.queryForObject("SELECT * from fighter WHERE id = ?", (rs, rowNum) -> {
            return Fighter.builder()
                .id(rs.getLong("id"))
                .name(rs.getString("name"))
                .build();
        });
        return Optional.ofNullable(fighter);
        
    }
    @Override
    public int save(Fighter fighter) {
        var insertFighter = "INSERT INTO fighter (name) VALUES (?)";
        var keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            var ps = connection.prepareStatement(insertFighter);
            ps.setString(1, fighter.getName());
            return ps;
        }, keyHolder);
        return keyHolder.getKey().intValue();
    }
    
}
