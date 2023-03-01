package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "redirect:/fighterlist";
    }
    @GetMapping("/about")
    public String about(){
        return "about";
    }
}
