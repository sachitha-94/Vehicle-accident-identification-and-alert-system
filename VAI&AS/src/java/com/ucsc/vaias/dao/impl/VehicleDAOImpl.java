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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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

    @Override
    public boolean removeVehicleByVID(Vehicle vehicle, Connection connection) throws ClassNotFoundException, SQLException {
        PreparedStatement stm = connection.prepareStatement("DELETE FROM vehicle WHERE VID=?");
        stm.setObject(1, vehicle.getVID());
        int res = stm.executeUpdate();
        if (res > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean updateVehicleByVID(Vehicle vehicle, Connection connection) throws ClassNotFoundException, SQLException {
        PreparedStatement stm = connection.prepareStatement("UPDATE vehicle SET REGISTER_NO=?,CHASSI_NO=?, ENGINE_NO=?, VEHICLE_TYPE=? WHERE VID=?");
        stm.setObject(1, vehicle.getREGISTER_NO());
        stm.setObject(1, vehicle.getCHASSI_NO());
        stm.setObject(3, vehicle.getENGINE_NO());
        stm.setObject(4, vehicle.getVEHICLE_TYPE());
        stm.setObject(5, vehicle.getVID());
        int res = stm.executeUpdate();
        if (res > 0) {
            return true;

        }
        return false;
    }

    @Override
    public Vehicle searchVehicleByVID(Vehicle vehicle, Connection connection) throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM vehicle WHERE VID='"+vehicle.getVID()+"'";
        Statement stm = connection.createStatement();
        ResultSet res = stm.executeQuery(sql);
        Vehicle vehicleReturn = new Vehicle();
        if (res.next()) {
            vehicleReturn.setVID(res.getString("VID"));
            vehicleReturn.setREGISTER_NO(res.getString("REGISTER_NO"));
            vehicleReturn.setCHASSI_NO(res.getString("CHASSI_NO"));
            vehicleReturn.setENGINE_NO(res.getString("ENGINE_NO"));
            vehicleReturn.setVEHICLE_TYPE(res.getString("VEHICLE_TYPE"));
        }
        return vehicleReturn;

    }

    @Override
    public Vehicle searchVehicleByREGISTER_NO(Vehicle vehicle, Connection connection) throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM vehicle WHERE REGISTER_NO=?";
        Statement stm = connection.createStatement();
        ResultSet res = stm.executeQuery(sql);
        Vehicle vehicleReturn = new Vehicle();
        if (res.next()) {
            vehicleReturn.setVID(res.getString("VID"));
            vehicleReturn.setREGISTER_NO(res.getString("REGISTER_NO"));
            vehicleReturn.setCHASSI_NO(res.getString("CHASSI_NO"));
            vehicleReturn.setENGINE_NO(res.getString("ENGINE_NO"));
            vehicleReturn.setVEHICLE_TYPE(res.getString("VEHICLE_TYPE"));

        }
        return vehicleReturn;
    }

}
