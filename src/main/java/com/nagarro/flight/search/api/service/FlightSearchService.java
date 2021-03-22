/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nagarro.flight.search.api.service;

import com.nagarro.flight.search.api.dao.FlightSearchRepository;
import com.nagarro.flight.search.api.entity.FlightInfo;
import com.nagarro.flight.search.api.model.FlightInfoQuery;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Laura.Barragan
 */
@Service
public class FlightSearchService {

    @Autowired
    FlightSearchRepository repository;
    
    public List<FlightInfo> flightSearch(FlightInfoQuery query) {
        return repository.findAll();
    }
    
}
