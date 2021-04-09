package com.nagarro.flight.search.api.controllers;

import com.nagarro.flight.search.api.entity.FlightInfo;
import com.nagarro.flight.search.api.model.FlightInfoQuery;
import com.nagarro.flight.search.api.service.FlightSearchService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * A sample greetings controller to return greeting text
 */
@RestController
public class FlightSearchController {
    
    @Autowired
    FlightSearchService service;
    
    /**
     *
     * @param name the name to greet
     * @return greeting text
     */
    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String greetingText(@PathVariable String name) {
        return "Hello " + name + "!";
    }
    
    @CrossOrigin(origins="*")
    @RequestMapping(value="/flightSearch", method = RequestMethod.POST)
    public ResponseEntity<List<FlightInfo>> flightSearch(@RequestBody FlightInfoQuery query) {
        List<FlightInfo> results = service.flightSearch(query);
        
        ResponseEntity<List<FlightInfo>> response = ResponseEntity.ok(results);
        return response;
    }
    
    
    
}
