package com.example.lolapibackend.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SummonerController {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(SummonerController.class);

    String applicationKey = "${application.properties.LOL_KEY}";

    @GetMapping("${application.properties.LOL_URL}/lol/summoner/v4/summoners/by-name/${summonerName}")
	public void getSummonerInfo(@RequestHeader(value = "X-Riot-Token" ) String applicationKey) {
        logger.info("Informações do Summoner: {}", applicationKey);
    }
}
