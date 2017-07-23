/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.vaias.dao.impl;

import com.ucsc.vaias.dao.PostAccidentDAO;
import com.ucsc.vaias.model.PostAccident;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author sajja
 */
public class PostAccidentDAOImpl implements PostAccidentDAO{

    @Override
    public PostAccident SearchLastRow(Connection connection) throws ClassNotFoundException,SQLException{
        PreparedStatement stm = connection.prepareStatement("SELECT UID,LAT,LON,PID,HID,AID FROM post_accident order by AID DESC limit 1");
        ResultSet rst = stm.executeQuery();
        PostAccident postAccident=new PostAccident();
        if (rst.next()) {  
            
           
            //System.out.println(rst.getString("UID"));
            //System.out.println(rst.getFloat("LAT"));
            //System.out.println(rst.getFloat("LON"));
            postAccident.setAID(rst.getString("AID"));
            postAccident.setUID(rst.getString("UID"));
            postAccident.setLAT(rst.getFloat("LAT"));
            postAccident.setLON(rst.getFloat("LON"));
            postAccident.setPID(rst.getString("PID"));
            postAccident.setHID(rst.getString("HID"));
        }
        return postAccident;
    }

    @Override
    public boolean UpdatePID(Connection connection, PostAccident postAccident) throws ClassNotFoundException, SQLException {
        PreparedStatement stm = connection.prepareStatement("UPDATE post_accident SET PID=? WHERE AID=?");
        stm.setObject(1, postAccident.getPID());
        stm.setObject(2, postAccident.getAID());
        
        int rst = stm.executeUpdate();
        if (rst>0) {
            return true;
        }
          return false;
        }

    @Override
    public boolean UpdateHID(Connection connection, PostAccident postAccident) throws ClassNotFoundException, SQLException {
        PreparedStatement stm = connection.prepareStatement("UPDATE post_accident SET HID=? WHERE AID=?");
        stm.setObject(1, postAccident.getHID());
        stm.setObject(2, postAccident.getAID());
        
        int rst = stm.executeUpdate();
        if (rst>0) {
            return true;
        }
          return false;
    }
        
    }
    

