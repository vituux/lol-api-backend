package com.example.lolapibackend.model;

import lombok.Getter;

@Getter
public class SummonerModel {

    private final String summonerId;
    private final String summonerName;
    private final String summonerRanked;

    public SummonerModel(String summonerId, String summonerName, String summonerRanked) {
        this.summonerId = summonerId;
        this.summonerName = summonerName;
        this.summonerRanked = summonerRanked;
    }
}
