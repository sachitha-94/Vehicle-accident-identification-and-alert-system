
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.vaias.service;

import com.ucsc.vaias.model.PoliceStation;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author sajja
 */
public interface PoliceStationService {

    public boolean addPoliceStation(PoliceStation policeStation, Connection connection) throws ClassNotFoundException, SQLException;

    public boolean removePoliceStationByPID(PoliceStation policeStation, Connection connection) throws ClassNotFoundException, SQLException;

    public boolean updatePoliceStationByPID(PoliceStation policeStation, Connection connection) throws ClassNotFoundException, SQLException;

    public PoliceStation searchPoliceStationByPID(PoliceStation policeStation, Connection connection) throws ClassNotFoundException, SQLException;

    public ArrayList<PoliceStation> selectAllPoliceStations(Connection connection) throws ClassNotFoundException, SQLException;
}
