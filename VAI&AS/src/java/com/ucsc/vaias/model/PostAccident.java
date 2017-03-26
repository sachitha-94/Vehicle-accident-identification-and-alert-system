/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.vaias.model;

import java.sql.Date;
import java.sql.Time;


/**
 *
 * @author sajja
 */
public class PostAccident {
    
    private String AID;
    private String VID;
    private String UID;
    private float LAT;
    private float LON;
    private Date DATE;
    private Time TIME;
    private String HID;
    private String PID;

    public PostAccident() {
    }

    public PostAccident(String AID, String VID, String UID, float LAT, float LON, Date DATE, Time TIME, String HID, String PID) {
        this.AID = AID;
        this.VID = VID;
        this.UID = UID;
        this.LAT = LAT;
        this.LON = LON;
        this.DATE = DATE;
        this.TIME = TIME;
        this.HID = HID;
        this.PID = PID;
    }

    public String getAID() {
        return AID;
    }

    public void setAID(String AID) {
        this.AID = AID;
    }

    public String getVID() {
        return VID;
    }

    public void setVID(String VID) {
        this.VID = VID;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
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

    public Date getDATE() {
        return DATE;
    }

    public void setDATE(Date DATE) {
        this.DATE = DATE;
    }

    public Time getTIME() {
        return TIME;
    }

    public void setTIME(Time TIME) {
        this.TIME = TIME;
    }

    public String getHID() {
        return HID;
    }

    public void setHID(String HID) {
        this.HID = HID;
    }

    public String getPID() {
        return PID;
    }

    public void setPID(String PID) {
        this.PID = PID;
    }
    
    
    
    
}
