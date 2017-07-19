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
    private float LAT;
    private float LON;
    private String TP;

    public PoliceStation() {
    }

    public PoliceStation(String PID, String PROVINCE, String DIVITION, String CITY, float LAT, float LON, String TP) {
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

    public float getLAT() {
        return LAT;
    }

    public void setLAT(float LAT) {
        this.LAT = LAT;
    }

    public float getLON() {
        return LON;
    }

    public void setLON(float LON) {
        this.LON = LON;
    }

    public String getTP() {
        return TP;
    }

    public void setTP(String TP) {
        this.TP = TP;
    }

   

 
    
    
    
    
}
