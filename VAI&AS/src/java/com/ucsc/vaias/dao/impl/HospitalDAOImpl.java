/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.vaias.dao.impl;

import com.ucsc.vaias.dao.HospitalDAO;
import com.ucsc.vaias.model.Hospital;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author sajja
 */
public class HospitalDAOImpl implements HospitalDAO {

    @Override
    public boolean addHospital(Hospital hospital, Connection connection) throws ClassNotFoundException, SQLException {
        PreparedStatement stm = connection.prepareStatement("INSERT INTO hospital VALUES(?,?,?,?,?,?,?,?)");
        stm.setObject(1, hospital.getHID());
        stm.setObject(2, hospital.getHOSPITAL_NAME());
        stm.setObject(3, hospital.getPROVINCE());
        stm.setObject(4, hospital.getDISTRICT());
        stm.setObject(5, hospital.getCITY());
        stm.setObject(6, hospital.getLAT());
        stm.setObject(7, hospital.getLON());
        stm.setObject(8, hospital.getTP());
        int res = stm.executeUpdate();
        if (res > 0) {
            return true;

        }
        return false;
    }

    @Override
    public boolean removeHospitalByHID(Hospital hospital, Connection connection) throws ClassNotFoundException, SQLException {
        PreparedStatement stm = connection.prepareStatement("DELETE FROM hospital WHERE HID=?");
        stm.setObject(1, hospital.getHID());
        int res = stm.executeUpdate();
        if (res > 0) {
            return true;

        }
        return false;

    }

    @Override
    public boolean updateHospitalByHID(Hospital hospital, Connection connection) throws ClassNotFoundException, SQLException {
        PreparedStatement stm = connection.prepareStatement("UPDATE hospital SET HOSPITAL_NAME=?, PROVINCE=?, DISTRICT=?, CITY=?, LAT=?, LON=?, TP=?");
        stm.setObject(1, hospital.getHOSPITAL_NAME());
        stm.setObject(2, hospital.getPROVINCE());
        stm.setObject(3, hospital.getDISTRICT());
        stm.setObject(4, hospital.getCITY());
        stm.setObject(5, hospital.getLAT());
        stm.setObject(6, hospital.getLON());
        stm.setObject(7, hospital.getTP());
        int res = stm.executeUpdate();
        if (res > 0) {
            return true;

        }
        return false;
    }

    @Override
    public Hospital searchHospitalByHID(Hospital hospital, Connection connection) throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM hospital WHERE HID='" + hospital.getHID() + "'";
        Statement stm = connection.createStatement();
        ResultSet res = stm.executeQuery(sql);
        Hospital hReturn = new Hospital();
        if (res.next()) {
            hReturn.setHID(res.getString("HID"));
            hReturn.setHOSPITAL_NAME(res.getString("HOSPITAL_NAME"));
            hReturn.setPROVINCE(res.getString("PROVINCE"));
            hReturn.setDISTRICT(res.getString("DISTRICT"));
            hReturn.setCITY(res.getString("CITY"));
            hReturn.setLAT(res.getFloat("LAT"));
            hReturn.setLON(res.getFloat("LON"));
            hReturn.setTP(res.getInt("TP"));

        }
        return hReturn;

    }

    @Override
    public ArrayList<Hospital> selectAllHospital(Connection connection) throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM hospital";
        Statement stm = connection.createStatement();
        ResultSet res = stm.executeQuery(sql);

        ArrayList<Hospital> hospitals = new ArrayList<Hospital>();
        while (res.next()) {

            Hospital hReturn = new Hospital();

            hReturn.setHID(res.getString("HID"));
            hReturn.setHOSPITAL_NAME(res.getString("HOSPITAL_NAME"));
            hReturn.setPROVINCE(res.getString("PROVINCE"));
            hReturn.setDISTRICT(res.getString("DISTRICT"));
            hReturn.setCITY(res.getString("CITY"));
            hReturn.setLAT(res.getFloat("LAT"));
            hReturn.setLON(res.getFloat("LON"));
            hReturn.setTP(res.getInt("TP"));

            hospitals.add(hReturn);
        }
        return hospitals;

    }

    @Override
    public ArrayList getHospitalLocation(Connection connection) throws ClassNotFoundException, SQLException {
        String sql = "SELECT LON FROM hospital";
        Statement stm = connection.createStatement();
        ResultSet res = stm.executeQuery(sql);

        ArrayList<Hospital> hospitals = new ArrayList<Hospital>();
        while (res.next()) {

            Hospital hReturn = new Hospital();

            hReturn.setHID(res.getString("HID"));
            hReturn.setHOSPITAL_NAME(res.getString("HOSPITAL_NAME"));
            hReturn.setPROVINCE(res.getString("PROVINCE"));
            hReturn.setDISTRICT(res.getString("DISTRICT"));
            hReturn.setCITY(res.getString("CITY"));
            hReturn.setLAT(res.getFloat("LAT"));
            hReturn.setLON(res.getFloat("LON"));
            hReturn.setTP(res.getInt("TP"));

            hospitals.add(hReturn);
        }
        return hospitals;

    }
    
  

}
