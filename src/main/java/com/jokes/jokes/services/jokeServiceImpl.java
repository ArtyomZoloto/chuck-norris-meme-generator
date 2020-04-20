package com.jokes.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class jokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes quotes;

    public jokeServiceImpl(ChuckNorrisQuotes quotes) {
        this.quotes = quotes;
    }

    public String getRandomQuote(){
        return quotes.getRandomQuote();
    }

}
