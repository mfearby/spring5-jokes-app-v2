package com.marcfearby.spring5jokesapp.controllers;

import com.marcfearby.spring5jokesapp.interfaces.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisJokesController {

    private final JokesService jokesService;

    public ChuckNorrisJokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping("/")
    public String getQuote(Model model) {
        String joke = jokesService.getJoke();
        System.out.println("joke: " + joke);
        model.addAttribute("joke", joke);
        return "index";
    }

}
