/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.vaias.dao.impl;

import com.ucsc.vaias.dao.UserDAO;
import com.ucsc.vaias.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author sajja
 */
public class UserDAOImpl implements UserDAO{

    @Override
    public boolean addUser(User user, Connection connection) throws ClassNotFoundException, SQLException {
       
       
        PreparedStatement stm = connection.prepareStatement("INSERT INTO user VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
        stm.setObject(1, user.getUID());
        stm.setObject(2,user.getNIC());
        stm.setObject(3, user.getFIRST_NAME());
        stm.setObject(4, user.getLAST_NAME());
        stm.setObject(5, user.getGENDER());
        stm.setObject(6, user.getTP_HOME());
        stm.setObject(7, user.getTP_MOBILE());
        stm.setObject(8, user.getADDRESS());
        stm.setObject(9, user.getLICENSE_NO());
        stm.setObject(10, user.getBLOOD_GROUP());
        stm.setObject(11, user.getEMAIL());
        stm.setObject(12, user.getBIRTH_DAY());
        stm.setObject(13, user.getOTHER());
        
        int res = stm.executeUpdate();
        if (res>0) {
            return true;
            
        }
        return false;
    }

    @Override
    public boolean removeUserByUID(User user, Connection connection) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean upDateUserByUID(User user, Connection connection) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean searchUserByUID(User user, Connection connection) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
