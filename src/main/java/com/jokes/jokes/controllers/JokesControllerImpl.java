package com.jokes.jokes.controllers;

import com.jokes.jokes.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class JokesControllerImpl implements JokesController{

    private final JokeService jokeService;

    public JokesControllerImpl(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String getRandomQuote(Model model){
        String quote = jokeService.getRandomQuote();
        model.addAttribute("quote", quote);
        return "chucknorris";
    }

}
