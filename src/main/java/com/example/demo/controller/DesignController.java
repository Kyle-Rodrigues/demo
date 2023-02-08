package com.example.demo.controller;

import java.util.EnumSet;
import java.util.stream.Collectors;

import org.apache.tomcat.jni.Pool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Jdbc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.thymeleaf.engine.AttributeName;

import com.example.demo.model.Fighter;
import com.example.demo.model.Fighter.Anime;
import com.example.demo.repository.impl.JdbcFighterRepository;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/design")
public class DesignController {

    @Autowired
    private JdbcFighterRepository fighterRepository;

    @GetMapping
    public String design() {
        return "design";
    } 

    @ModelAttribute
    public void animes(Model model){
        var animes = EnumSet.allOf(Anime.class);
        model.addAttribute("animes", animes);
        log.info("animes converted to string. {}", animes);
    }


    @ModelAttribute
    public Fighter fighter() {
        return Fighter.builder()
                .build();
    }
    @PostMapping
    public String processFighterAddition(@Valid Fighter fighter, Errors errors){
        if(errors.hasErrors()){
            return "design";
        }
        var id = fighterRepository.save(fighter);
        log.info("Saved fighter with {}", id);
        return "redirect:/design";
    }
}
