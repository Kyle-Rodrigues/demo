package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class FighterPool {
    private List<Fighter> fighters;

    public FighterPool() {
        this.fighters = new ArrayList<>();
    }
    public void add(Fighter fighter){
        this.fighters.add(fighter);
    }
}
