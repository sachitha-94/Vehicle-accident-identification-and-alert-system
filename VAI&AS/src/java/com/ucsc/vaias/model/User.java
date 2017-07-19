/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.vaias.model;

import java.util.Date;

/**
 *
 * @author sajja
 */
public class User {

    private String UID;
    private String NIC;
    private String FIRST_NAME;
    private String LAST_NAME;
    private String GENDER;
    private int TP_HOME;
    private int TP_MOBILE;
    private String ADDRESS;
    private String LICENSE_NO;
    private String BLOOD_GROUP;
    private String EMAIL;
    private Date BIRTH_DAY;
    private String OTHER;

    public User() {
    }

    public User(String UID, String NIC, String FIRST_NAME, String LAST_NAME, String GENDER, int TP_HOME, int TP_MOBILE, String ADDRESS, String LICENSE_NO, String BLOOD_GROUP, String EMAIL, Date BIRTH_DAY, String OTHER) {
        this.UID = UID;
        this.NIC = NIC;
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
        this.GENDER = GENDER;
        this.TP_HOME = TP_HOME;
        this.TP_MOBILE = TP_MOBILE;
        this.ADDRESS = ADDRESS;
        this.LICENSE_NO = LICENSE_NO;
        this.BLOOD_GROUP = BLOOD_GROUP;
        this.EMAIL = EMAIL;
        this.BIRTH_DAY = BIRTH_DAY;
        this.OTHER = OTHER;

    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    public String getGENDER() {
        return GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    public int getTP_HOME() {
        return TP_HOME;
    }

    public void setTP_HOME(int TP_HOME) {
        this.TP_HOME = TP_HOME;
    }

    public int getTP_MOBILE() {
        return TP_MOBILE;
    }

    public void setTP_MOBILE(int TP_MOBILE) {
        this.TP_MOBILE = TP_MOBILE;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getLICENSE_NO() {
        return LICENSE_NO;
    }

    public void setLICENSE_NO(String LICENSE_NO) {
        this.LICENSE_NO = LICENSE_NO;
    }

    public String getBLOOD_GROUP() {
        return BLOOD_GROUP;
    }

    public void setBLOOD_GROUP(String BLOOD_GROUP) {
        this.BLOOD_GROUP = BLOOD_GROUP;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public Date getBIRTH_DAY() {
        return BIRTH_DAY;
    }

    public void setBIRTH_DAY(Date BIRTH_DAY) {
        this.BIRTH_DAY = BIRTH_DAY;
    }

    public String getOTHER() {
        return OTHER;
    }

    public void setOTHER(String OTHER) {
        this.OTHER = OTHER;
    }

}
