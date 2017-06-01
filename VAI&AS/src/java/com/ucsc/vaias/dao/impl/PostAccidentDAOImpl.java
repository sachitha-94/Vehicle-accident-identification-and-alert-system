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

/**
 *
 * @author sajja
 */
public class PostAccidentDAOImpl implements PostAccidentDAO{

    @Override
    public PostAccident SearchLastRow(Connection connection) throws ClassNotFoundException,SQLException{
        PreparedStatement stm = connection.prepareStatement("SELECT LAT,LON,UID FROM post_accident order by AID DESC limit 1");
        ResultSet rst = stm.executeQuery();
        PostAccident postAccident=new PostAccident();
        if (rst.next()) {  
            
           
            System.out.println(rst.getString("UID"));
            System.out.println(rst.getFloat("LAT"));
            System.out.println(rst.getFloat("LON"));
            
            postAccident.setUID(rst.getString("UID"));
            postAccident.setLAT(rst.getFloat("LAT"));
            postAccident.setLON(rst.getFloat("LON"));
            
        }
        return postAccident;
    }
    
}
