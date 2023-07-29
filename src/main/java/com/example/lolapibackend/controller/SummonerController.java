package com.example.lolapibackend.controller;

import com.example.lolapibackend.model.SummonerModel;
import com.example.lolapibackend.service.impl.SummonerServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;



@RestController("/summoners")
public class SummonerController {

    String applicationKey = "${application.properties.LOL_KEY}";
    private SummonerServiceImpl summonerService;

    @GetMapping()
	public SummonerModel getSummonerInfo(@RequestHeader(value = "X-Riot-Token" ) String applicationKey, String summoner) {
        return summonerService.getSummoners(summoner);
    }
}
