package com.example.lolapibackend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController("/summoner")
public class SummonerController {

    @GetMapping
    public void getSummoner(String id, String summonerName){

    }
}
