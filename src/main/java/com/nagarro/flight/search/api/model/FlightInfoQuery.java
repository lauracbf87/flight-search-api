/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nagarro.flight.search.api.model;

import java.io.Serializable;

/**
 *
 * @author Laura.Barragan
 */
public class FlightInfoQuery implements Serializable {

    private String departureLocation;
    private String arrivalLocation;
    private String flightDate;
    private String flightClass;
    private String outputPreference;

    /**
     * @return the departureLocation
     */
    public String getDepartureLocation() {
        return departureLocation;
    }

    /**
     * @param departureLocation the departureLocation to set
     */
    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    /**
     * @return the arrivalLocation
     */
    public String getArrivalLocation() {
        return arrivalLocation;
    }

    /**
     * @param arrivalLocation the arrivalLocation to set
     */
    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    /**
     * @return the flightDate
     */
    public String getFlightDate() {
        return flightDate;
    }

    /**
     * @param flightDate the flightDate to set
     */
    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    /**
     * @return the flightClass
     */
    public String getFlightClass() {
        return flightClass;
    }

    /**
     * @param flightClass the flightClass to set
     */
    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
    }

    /**
     * @return the outputPreference
     */
    public String getOutputPreference() {
        return outputPreference;
    }

    /**
     * @param outputPreference the outputPreference to set
     */
    public void setOutputPreference(String outputPreference) {
        this.outputPreference = outputPreference;
    }

    @Override
    public String toString() {
        return "FlightInfoQuery{" + "departureLocation=" + departureLocation + ", arrivalLocation=" + arrivalLocation + ", flightDate=" + flightDate + ", flightClass=" + flightClass + ", outputPreference=" + outputPreference + '}';
    }

    
}
