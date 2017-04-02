/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.vaias.service.impl;

import com.ucsc.vaias.dao.VehicleDAO;
import com.ucsc.vaias.dao.impl.VehicleDAOImpl;
import com.ucsc.vaias.model.Vehicle;
import com.ucsc.vaias.service.VehicleService;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author sajja
 */
public class VehicleServiceImpl implements VehicleService {

    @Override
    public boolean addVehicle(Vehicle vehicle, Connection connection) throws ClassNotFoundException, SQLException {
        VehicleDAO vdao = new VehicleDAOImpl();
        try {
            return vdao.addVehicle(vehicle, connection);
        } catch (ClassNotFoundException|SQLException e) {
        }

        return false;
    }

}
