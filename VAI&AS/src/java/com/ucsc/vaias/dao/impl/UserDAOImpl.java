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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author sajja
 */
public class UserDAOImpl implements UserDAO {

    @Override
    public boolean addUser(User user, Connection connection) throws ClassNotFoundException, SQLException {

        PreparedStatement stm = connection.prepareStatement("INSERT INTO user VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
        stm.setObject(1, user.getUID());
        stm.setObject(2, user.getNIC());
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
        if (res > 0) {
            return true;

        }
        return false;
    }

    @Override
    public boolean removeUserByUID(User user, Connection connection) throws ClassNotFoundException, SQLException {
        PreparedStatement stm = connection.prepareStatement("DELETE FROM user WHERE UID=?");
        stm.setObject(1, user.getUID());
        int res = stm.executeUpdate();
        if (res > 0) {
            return true;

        }
        return false;
    }

    @Override
    public boolean upDateUserByUID(User user, Connection connection) throws ClassNotFoundException, SQLException {
        PreparedStatement stm = connection.prepareStatement("UPDATE user set NIC=?, FIRST_NAME=?, LAST_NAME=?, GENDER=?, TP_HOME=?, TP_MOBILE=?, ADDRESS=?, LICENSE_NO=?, BLOOD_GROUP=?, EMAIL=?, BIRTH_DAY=?, OTHER=? WHERE UID=?,");

        stm.setObject(1, user.getNIC());
        stm.setObject(2, user.getFIRST_NAME());
        stm.setObject(3, user.getLAST_NAME());
        stm.setObject(4, user.getGENDER());
        stm.setObject(5, user.getTP_HOME());
        stm.setObject(6, user.getTP_MOBILE());
        stm.setObject(7, user.getADDRESS());
        stm.setObject(8, user.getLICENSE_NO());
        stm.setObject(9, user.getBLOOD_GROUP());
        stm.setObject(10, user.getEMAIL());
        stm.setObject(11, user.getBIRTH_DAY());
        stm.setObject(12, user.getOTHER());
        stm.setObject(13, user.getUID());

        int res = stm.executeUpdate();
        if (res > 0) {
            return true;

        }
        return false;
    }

    @Override
    public User searchUserByUID(User user, Connection connection) throws ClassNotFoundException, SQLException {
        String sql="SELECT * FROM user WHERE UID='"+user.getUID()+"'";
        Statement stm = connection.createStatement();
        ResultSet res = stm.executeQuery(sql);
        User uReturn=new User();
        if (res.next()) {
            uReturn.setUID(res.getString("UID"));
            uReturn.setNIC(res.getString("NIC"));
            uReturn.setFIRST_NAME(res.getString("FIRST_NAME"));
            uReturn.setLAST_NAME(res.getString("LAST_NAME"));
            uReturn.setGENDER(res.getString("GENDER"));
            uReturn.setTP_HOME(res.getInt("TP_HOME"));
            uReturn.setTP_MOBILE(res.getInt("TP_MOBILE"));
            uReturn.setADDRESS(res.getString("ADDRESS"));
            uReturn.setLICENSE_NO(res.getString("LICENSE_NO"));
            uReturn.setBLOOD_GROUP(res.getString("BLOOD_GROUP"));
            uReturn.setEMAIL(res.getString("EMAIL"));
            uReturn.setBIRTH_DAY(res.getDate("BIRTH_DAY"));
            uReturn.setOTHER(res.getString("OTHER"));
            
        }
        return uReturn;
    }

}
