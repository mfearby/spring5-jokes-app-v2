package com.marcfearby.spring5jokesapp.services;

import com.marcfearby.spring5jokesapp.interfaces.JokesService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokesService implements JokesService {

    public ChuckNorrisQuotes quotes;

    public ChuckNorrisJokesService(ChuckNorrisQuotes quotes) {
        // Could have done this instead of following @Bean config example from Chuck Norris repo:
        // this.quotes = new ChuckNorrisQuotes();
        this.quotes = quotes;
    }

    @Override
    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
