package com.example.lolapibackend.service;

import com.example.lolapibackend.model.SummonerModel;
import org.springframework.stereotype.Service;

@Service
public interface SummonerService {
    public SummonerModel getSummoners(String summonerName);
}
