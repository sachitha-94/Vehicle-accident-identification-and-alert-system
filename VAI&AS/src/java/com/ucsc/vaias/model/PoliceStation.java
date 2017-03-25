/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.vaias.model;

/**
 *
 * @author sajja
 */
public class PoliceStation {
    
    private String PID;
    private String PROVINCE;
    private String DIVITION;
    private String CITY;
    private String LAT;
    private String LON;
    private String TP;

    public PoliceStation() {
    }

    public PoliceStation(String PID, String PROVINCE, String DIVITION, String CITY, String LAT, String LON, String TP) {
        this.PID = PID;
        this.PROVINCE = PROVINCE;
        this.DIVITION = DIVITION;
        this.CITY = CITY;
        this.LAT = LAT;
        this.LON = LON;
        this.TP = TP;
    }

    public String getPID() {
        return PID;
    }

    public void setPID(String PID) {
        this.PID = PID;
    }

    public String getPROVINCE() {
        return PROVINCE;
    }

    public void setPROVINCE(String PROVINCE) {
        this.PROVINCE = PROVINCE;
    }

    public String getDIVITION() {
        return DIVITION;
    }

    public void setDIVITION(String DIVITION) {
        this.DIVITION = DIVITION;
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public String getLAT() {
        return LAT;
    }

    public void setLAT(String LAT) {
        this.LAT = LAT;
    }

    public String getLON() {
        return LON;
    }

    public void setLON(String LON) {
        this.LON = LON;
    }

    public String getTP() {
        return TP;
    }

    public void setTP(String TP) {
        this.TP = TP;
    }
    
    
    
    
}
