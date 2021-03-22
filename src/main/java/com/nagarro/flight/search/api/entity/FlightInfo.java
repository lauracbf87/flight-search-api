/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nagarro.flight.search.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Laura.Barragan
 */
@Entity
@Table(name = "FLIGHT_INFO")
public class FlightInfo {

    @Id
    @Column(name = "FLIGHT_NO")
    private String flightNo;
    @Column(name = "DEP_LOC")
    private String depLoc;
    @Column(name = "ARR_LOC")
    private String arrLoc;
    @Column(name = "VALID_TILL")
    private String validTill;
    @Column(name = "FLIGHT_TIME")
    private String flightTime;
    @Column(name = "FLIGHT_DUR")
    private String flightDur;
    @Column(name = "FARE")
    private String fare;
    @Column(name = "SEAT_AVAILABILITY")
    private String seatAvailability;
    @Column(name = "CLASS")
    private String clasz;

    /**
     * @return the flightNo
     */
    public String getFlightNo() {
        return flightNo;
    }

    /**
     * @param flightNo the flightNo to set
     */
    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    /**
     * @return the depLoc
     */
    public String getDepLoc() {
        return depLoc;
    }

    /**
     * @param depLoc the depLoc to set
     */
    public void setDepLoc(String depLoc) {
        this.depLoc = depLoc;
    }

    /**
     * @return the arrLoc
     */
    public String getArrLoc() {
        return arrLoc;
    }

    /**
     * @param arrLoc the arrLoc to set
     */
    public void setArrLoc(String arrLoc) {
        this.arrLoc = arrLoc;
    }

    /**
     * @return the validTill
     */
    public String getValidTill() {
        return validTill;
    }

    /**
     * @param validTill the validTill to set
     */
    public void setValidTill(String validTill) {
        this.validTill = validTill;
    }

    /**
     * @return the flightTime
     */
    public String getFlightTime() {
        return flightTime;
    }

    /**
     * @param flightTime the flightTime to set
     */
    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }

    /**
     * @return the flightDur
     */
    public String getFlightDur() {
        return flightDur;
    }

    /**
     * @param flightDur the flightDur to set
     */
    public void setFlightDur(String flightDur) {
        this.flightDur = flightDur;
    }

    /**
     * @return the fare
     */
    public String getFare() {
        return fare;
    }

    /**
     * @param fare the fare to set
     */
    public void setFare(String fare) {
        this.fare = fare;
    }

    /**
     * @return the seatAvailability
     */
    public String getSeatAvailability() {
        return seatAvailability;
    }

    /**
     * @param seatAvailability the seatAvailability to set
     */
    public void setSeatAvailability(String seatAvailability) {
        this.seatAvailability = seatAvailability;
    }

    /**
     * @return the clasz
     */
    public String getClasz() {
        return clasz;
    }

    /**
     * @param clasz the clasz to set
     */
    public void setClasz(String clasz) {
        this.clasz = clasz;
    }

    @Override
    public String toString() {
        return "FlightInfo{" + "flightNo=" + flightNo + ", depLoc=" + depLoc + ", arrLoc=" + arrLoc + ", validTill=" + validTill + ", flightTime=" + flightTime + ", flightDur=" + flightDur + ", fare=" + fare + ", seatAvailability=" + seatAvailability + ", clasz=" + clasz + '}';
    }

}
