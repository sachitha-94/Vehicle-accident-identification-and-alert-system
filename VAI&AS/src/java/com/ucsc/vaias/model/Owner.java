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
public class Owner {
    private String UID;
    private String FID;

    public Owner() {
    }

    public Owner(String UID, String FID) {
        this.UID = UID;
        this.FID = FID;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getFID() {
        return FID;
    }

    public void setFID(String FID) {
        this.FID = FID;
    }
    
    
    
}
