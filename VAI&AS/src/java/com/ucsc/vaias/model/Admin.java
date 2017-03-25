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
public class Admin {
    
    private String USER_NAME;
    private String PASSWORD;

    public Admin() {
    }

    public Admin(String USER_NAME, String PASSWORD) {
        this.USER_NAME = USER_NAME;
        this.PASSWORD = PASSWORD;
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }

    public void setUSER_NAME(String USER_NAME) {
        this.USER_NAME = USER_NAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }
    
    
}
