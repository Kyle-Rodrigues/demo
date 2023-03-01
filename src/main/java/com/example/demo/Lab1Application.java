package com.example.demo;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Fighter;
import com.example.demo.model.Fighter.Anime;
import com.example.demo.repository.FighterRepository;

@SpringBootApplication
public class Lab1Application {
	public static void main(String[] args) {
		SpringApplication.run(Lab1Application.class, args);
	}

	@Bean
	public CommandLineRunner dataLoader(FighterRepository repository){
		return args -> {
			repository.save(Fighter.builder()
				.name("Captain Falcon")
				.animeFrom(Anime.SMASH)
				.damagePerHit(89)
				.health(2000)
				.resistance(new BigDecimal(0.5)).build());
				repository.save(Fighter.builder()
				.name("Sub-Zero")
				.animeFrom(Anime.MORTAL_COMBAT)
				.damagePerHit(77)
				.health(1432)
				.resistance(new BigDecimal(2.9)).build());
				repository.save(Fighter.builder()
				.name("Link")
				.animeFrom(Anime.SMASH)
				.damagePerHit(61)
				.health(2121)
				.resistance(new BigDecimal(4.3)).build());
				repository.save(Fighter.builder()
				.name("Kratos")
				.animeFrom(Anime.GODOFWAR)
				.damagePerHit(43)
				.health(1890)
				.resistance(new BigDecimal(5.5)).build());
				repository.save(Fighter.builder()
				.name("Solid Snake")
				.animeFrom(Anime.SMASH)
				.damagePerHit(94)
				.health(1555)
				.resistance(new BigDecimal(1.8)).build());
				repository.save(Fighter.builder()
				.name("Sonic the Hedgehog")
				.animeFrom(Anime.SMASH)
				.damagePerHit(23)
				.health(2255)
				.resistance(new BigDecimal(3.7)).build());
				repository.save(Fighter.builder()
				.name("Master Chief")
				.animeFrom(Anime.HALO)
				.damagePerHit(82)
				.health(1788)
				.resistance(new BigDecimal(6.1)).build());
				repository.save(Fighter.builder()
				.name("Cloud Strife")
				.animeFrom(Anime.SMASH)
				.damagePerHit(57)
				.health(1313)
				.resistance(new BigDecimal(8.3)).build());
				repository.save(Fighter.builder()
				.name("Donkey Kong")
				.animeFrom(Anime.SMASH)
				.damagePerHit(35)
				.health(2122)
				.resistance(new BigDecimal(2.1)).build());
				repository.save(Fighter.builder()
				.name("Mega Man")
				.animeFrom(Anime.SMASH)
				.damagePerHit(46)
				.health(1999)
				.resistance(new BigDecimal(1.2)).build());
				repository.save(Fighter.builder()
				.name("Bayonetta")
				.animeFrom(Anime.SMASH)
				.damagePerHit(65)
				.health(1699)
				.resistance(new BigDecimal(7.2)).build());
				repository.save(Fighter.builder()
				.name("Luffy")
				.animeFrom(Anime.ONE_PIECE)
				.damagePerHit(70)
				.health(1750)
				.resistance(new BigDecimal(7.4)).build());
		};
	}

}
