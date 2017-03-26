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
public class Vehicle {
    
    private String VID;
    private String REGISTER_NO;
    private String CHASSI_NO;
    private String ENGINE_NO;
    private String VEHICLE_TYPE;

    public Vehicle() {
    }

    public Vehicle(String VID, String REGISTER_NO, String CHASSI_NO, String ENGINE_NO, String VEHICLE_TYPE) {
        this.VID = VID;
        this.REGISTER_NO = REGISTER_NO;
        this.CHASSI_NO = CHASSI_NO;
        this.ENGINE_NO = ENGINE_NO;
        this.VEHICLE_TYPE = VEHICLE_TYPE;
    }

    public String getVID() {
        return VID;
    }

    public void setVID(String VID) {
        this.VID = VID;
    }

    public String getREGISTER_NO() {
        return REGISTER_NO;
    }

    public void setREGISTER_NO(String REGISTER_NO) {
        this.REGISTER_NO = REGISTER_NO;
    }

    public String getCHASSI_NO() {
        return CHASSI_NO;
    }

    public void setCHASSI_NO(String CHASSI_NO) {
        this.CHASSI_NO = CHASSI_NO;
    }

    public String getENGINE_NO() {
        return ENGINE_NO;
    }

    public void setENGINE_NO(String ENGINE_NO) {
        this.ENGINE_NO = ENGINE_NO;
    }

    public String getVEHICLE_TYPE() {
        return VEHICLE_TYPE;
    }

    public void setVEHICLE_TYPE(String VEHICLE_TYPE) {
        this.VEHICLE_TYPE = VEHICLE_TYPE;
    }
    
    
    
}
