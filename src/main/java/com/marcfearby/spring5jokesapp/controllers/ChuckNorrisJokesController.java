package com.marcfearby.spring5jokesapp.controllers;

import com.marcfearby.spring5jokesapp.interfaces.JokesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// todo convert to @Controller when I setup thymeleaf
@RestController
public class ChuckNorrisJokesController {

    private final JokesService jokesService;

    public ChuckNorrisJokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @GetMapping("/")
    public String getQuote() {
        return jokesService.getJoke();
    }

}
