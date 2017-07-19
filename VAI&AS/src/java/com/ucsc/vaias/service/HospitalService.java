/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.vaias.service;

import com.ucsc.vaias.model.Hospital;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author sajja
 */
public interface HospitalService {
    
     public boolean addHospital(Hospital hospital, Connection connection) throws ClassNotFoundException, SQLException;

    public boolean removeHospitalByHID(Hospital hospital, Connection connection) throws ClassNotFoundException, SQLException;

    public boolean updateHospitalByHID(Hospital hospital, Connection connection) throws ClassNotFoundException, SQLException;

    public Hospital searchHospitalByHID(Hospital hospital, Connection connection) throws ClassNotFoundException, SQLException;
    
    public ArrayList<Hospital> selectAllHospital(Connection connection) throws ClassNotFoundException, SQLException;
    
    public ArrayList getHospitalLocation(Connection connection) throws ClassNotFoundException,SQLException;
    
}
