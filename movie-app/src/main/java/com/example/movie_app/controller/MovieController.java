package com.example.movie_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {

    @GetMapping("/")
    public String moveToTop() {
        return "redirect:/top";
    }

    @GetMapping("/top")
    public String showTopPage() {
        return "top";
    }

}
