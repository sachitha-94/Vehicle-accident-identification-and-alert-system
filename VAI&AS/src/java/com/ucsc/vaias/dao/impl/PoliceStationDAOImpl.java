/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.vaias.dao.impl;

import com.ucsc.vaias.dao.PoliceStationDAO;
import com.ucsc.vaias.model.Hospital;
import com.ucsc.vaias.model.PoliceStation;
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
public class PoliceStationDAOImpl implements PoliceStationDAO {

    @Override
    public boolean addPoliceStation(PoliceStation policeStation, Connection connection) throws ClassNotFoundException, SQLException {
        PreparedStatement stm = connection.prepareStatement("INSERT INTO police_station VALUES(?,?,?,?,?,?,?)");
        stm.setObject(1, policeStation.getPID());
        stm.setObject(2, policeStation.getPROVINCE());
        stm.setObject(3, policeStation.getDIVITION());
        stm.setObject(4, policeStation.getCITY());
        stm.setObject(5, policeStation.getLAT());
        stm.setObject(6, policeStation.getLON());
        stm.setObject(7, policeStation.getTP());
        int res = stm.executeUpdate();
        if (res > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean removePoliceStationByPID(PoliceStation policeStation, Connection connection) throws ClassNotFoundException, SQLException {
        PreparedStatement stm = connection.prepareStatement("DELETE police_station WHERE PID=?");
        stm.setObject(1, policeStation.getPID());
        int res = stm.executeUpdate();
        if (res > 0) {
            return true;

        }
        return false;

    }

    @Override
    public boolean updatePoliceStationByPID(PoliceStation policeStation, Connection connection) throws ClassNotFoundException, SQLException {

        PreparedStatement stm = connection.prepareStatement("UPDATE police_station SET PROVINCE=?, DIVITION=?, CITY=?, LAT=?, LON=?, TP=? WHERE PID=?");
        stm.setObject(1, policeStation.getPROVINCE());
        stm.setObject(2, policeStation.getDIVITION());
        stm.setObject(3, policeStation.getCITY());
        stm.setObject(4, policeStation.getLAT());
        stm.setObject(5, policeStation.getLON());
        stm.setObject(6, policeStation.getTP());
        int res = stm.executeUpdate();
        if (res > 0) {
            return true;
        }
        return false;
    }

    @Override
    public PoliceStation searchPoliceStationByPID(PoliceStation policeStation, Connection connection) throws ClassNotFoundException, SQLException {
        String sql="SELECT * FROM police_station WHERE PID='"+policeStation.getPID()+"'";
        Statement stm = connection.createStatement();
        ResultSet res = stm.executeQuery(sql);
        PoliceStation psReturn=new PoliceStation();
        if (res.next()) {
            psReturn.setPID(res.getString("PID"));
            psReturn.setDIVITION(res.getString("DIVITION"));
            psReturn.setCITY(res.getString("CITY"));
            psReturn.setLAT(res.getFloat("LAT"));
            psReturn.setLON(res.getFloat("LON"));
            psReturn.setTP(res.getString("TP"));
            
        }
        return psReturn;
    }

    @Override
    public ArrayList<PoliceStation> selectAllPoliceStations(Connection connection) throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM police_station";
        Statement stm = connection.createStatement();
        ResultSet res = stm.executeQuery(sql);

        ArrayList<PoliceStation> policeStation = new ArrayList<PoliceStation>();
        while (res.next()) {

            PoliceStation pReturn = new PoliceStation();

            pReturn.setPID(res.getString("PID"));
            pReturn.setPROVINCE(res.getString("PROVINCE"));
            pReturn.setDIVITION(res.getString("DIVITION"));
            pReturn.setCITY(res.getString("CITY"));
            pReturn.setLAT(res.getFloat("LAT"));
            pReturn.setLON(res.getFloat("LON"));
            pReturn.setTP(res.getString("TP"));

            policeStation.add(pReturn);
        }
        return policeStation;
    }

}
