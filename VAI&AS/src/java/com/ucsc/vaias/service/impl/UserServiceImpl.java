/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.vaias.service.impl;

import com.ucsc.vaias.dao.UserDAO;
import com.ucsc.vaias.dao.impl.UserDAOImpl;
import com.ucsc.vaias.model.User;
import com.ucsc.vaias.service.UserService;
import java.sql.Connection;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sajja
 */
public class UserServiceImpl implements UserService {

    @Override
    public boolean addUser(User user, Connection connection) throws ClassNotFoundException, SQLDataException {
        UserDAO udao = new UserDAOImpl();
        boolean res = false;
        try {
            res = udao.addUser(user, connection);

        } catch (SQLException ex) {
            Logger.getLogger(UserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

}
