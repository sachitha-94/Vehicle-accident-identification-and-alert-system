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

    private VehicleDAO vdao = new VehicleDAOImpl();

    @Override
    public boolean addVehicle(Vehicle vehicle, Connection connection) throws ClassNotFoundException, SQLException {

        return vdao.addVehicle(vehicle, connection);

    }

    @Override
    public boolean removeVehicleByVID(Vehicle vehicle, Connection connection) throws ClassNotFoundException, SQLException {

        return vdao.removeVehicleByVID(vehicle, connection);
    }

    @Override
    public boolean updateVehicleByVID(Vehicle vehicle, Connection connection) throws ClassNotFoundException, SQLException {

        return vdao.updateVehicleByVID(vehicle, connection);

    }

    @Override
    public Vehicle searchVehicleByVID(Vehicle vehicle, Connection connection) throws ClassNotFoundException, SQLException {

        return vdao.searchVehicleByVID(vehicle, connection);
    }

    @Override
    public Vehicle searchVehicleByREGISTER_NO(Vehicle vehicle, Connection connection) throws ClassNotFoundException, SQLException {

        return vdao.searchVehicleByREGISTER_NO(vehicle, connection);
    }

}
