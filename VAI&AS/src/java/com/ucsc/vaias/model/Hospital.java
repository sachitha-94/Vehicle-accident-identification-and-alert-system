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
public class Hospital {
    
    private String HID;
    private String HOSPITAL_NAME;
    private String PROVINCE;
    private String DISTRICT;
    private String CITY;
    private float LAT;
    private float LON;
    private int TP;

    public Hospital() {
    }

    public Hospital(String HID, String HOSPITAL_NAME, String PROVINCE, String DISTRICT, String CITY, float LAT, float LON, int TP) {
        this.HID = HID;
        this.HOSPITAL_NAME = HOSPITAL_NAME;
        this.PROVINCE = PROVINCE;
        this.DISTRICT = DISTRICT;
        this.CITY = CITY;
        this.LAT = LAT;
        this.LON = LON;
        this.TP = TP;
    }

    public String getHID() {
        return HID;
    }

    public void setHID(String HID) {
        this.HID = HID;
    }

    public String getHOSPITAL_NAME() {
        return HOSPITAL_NAME;
    }

    public void setHOSPITAL_NAME(String HOSPITAL_NAME) {
        this.HOSPITAL_NAME = HOSPITAL_NAME;
    }

    public String getPROVINCE() {
        return PROVINCE;
    }

    public void setPROVINCE(String PROVINCE) {
        this.PROVINCE = PROVINCE;
    }

    public String getDISTRICT() {
        return DISTRICT;
    }

    public void setDISTRICT(String DISTRICT) {
        this.DISTRICT = DISTRICT;
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

    public int getTP() {
        return TP;
    }

    public void setTP(int TP) {
        this.TP = TP;
    }
    
           
        
           
    
}
