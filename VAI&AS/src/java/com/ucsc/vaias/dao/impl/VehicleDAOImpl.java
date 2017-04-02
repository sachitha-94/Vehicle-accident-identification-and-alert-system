/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.vaias.dao.impl;

import com.ucsc.vaias.dao.VehicleDAO;
import com.ucsc.vaias.model.Vehicle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author sajja
 */
public class VehicleDAOImpl implements VehicleDAO {

    @Override
    public boolean addVehicle(Vehicle vehicle, Connection connection) throws ClassNotFoundException, SQLException {

        PreparedStatement stm = connection.prepareStatement("INSERT INTO vehicle VALUES(?,?,?,?,?)");
        stm.setObject(1, vehicle.getVID());
        stm.setObject(2, vehicle.getREGISTER_NO());
        stm.setObject(3, vehicle.getCHASSI_NO());
        stm.setObject(4, vehicle.getENGINE_NO());
        stm.setObject(5, vehicle.getVEHICLE_TYPE());

        int res = stm.executeUpdate();

        if (res > 0) {
            return true;

        }
        return false;
    }

}
