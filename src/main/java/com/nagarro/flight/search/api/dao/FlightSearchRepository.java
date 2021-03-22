/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nagarro.flight.search.api.dao;

import com.nagarro.flight.search.api.entity.FlightInfo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Laura.Barragan
 */
@Repository
public interface FlightSearchRepository extends JpaRepository<FlightInfo, String> {

//    @Query(value="SELECT FLIGHT_NO, DEP_LOC, ARR_LOC, VALID_TILL, FLIGHT_TIME, FLIGHT_DUR, "
//            + "FARE, SEAT_AVAILABILITY, CLASS FROM FLIGHT_INFO "
//            + "WHERE (DEP_LOC = :departureLocation OR 1=1) AND (ARR_LOC = :arrivalLocation OR 1=1)",
//            nativeQuery=true)
//    public List<FlightInfo> findByFlightInfo(String departureLocation, String arrivalLocation, 
//            String flightDate, String flightClass, String outputPreference 
//);

    /**
     *
     * @return
     */
    @Override
    public List<FlightInfo> findAll();
}
