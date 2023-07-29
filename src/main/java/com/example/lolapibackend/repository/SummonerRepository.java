package com.example.lolapibackend.repository;

import com.example.lolapibackend.model.SummonerModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class SummonerRepository implements CrudRepository<SummonerModel,Object> {
}
