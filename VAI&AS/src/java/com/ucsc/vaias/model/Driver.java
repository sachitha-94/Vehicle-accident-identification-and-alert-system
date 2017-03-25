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
public class Driver {
    
    private String VID;
    private String UID;

    public Driver() {
    }

    public Driver(String VID, String UID) {
        this.VID = VID;
        this.UID = UID;
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
    
    
    
}
