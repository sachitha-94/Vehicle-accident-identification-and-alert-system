/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.vaias.dao;

import com.ucsc.vaias.model.Vehicle;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author sajja
 */
public interface VehicleDAO {
    
    public boolean addVehicle(Vehicle vehicle,Connection connection)throws ClassNotFoundException,SQLException;
    
}
