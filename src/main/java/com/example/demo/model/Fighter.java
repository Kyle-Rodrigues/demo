package com.example.demo.model;
import java.util.Date;

import javax.swing.plaf.TreeUI;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class Fighter {
    private long id;
    @NotBlank
    private String name;
    @Max(100)
    private int damagePerHit;
    @Min(1000)
    private int health;
    @DecimalMin(value = "0.1", inclusive = true)
    @DecimalMax(value = "10", inclusive = true)
    private double resistance;
    private Anime animeFrom;
    private final Date createdAt = new Date();

    public enum Anime {
        NARUTO("Naruto"), BLEACH("Bleach"), ONE_PIECE("One Piece");

        private String title;
        private Anime(String title){
            this.title = title;
        }
        public String getName(){
            return title;
        }
    }

}
