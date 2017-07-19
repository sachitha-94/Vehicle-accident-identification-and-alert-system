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
import java.sql.SQLException;

/**
 *
 * @author sajja
 */
public class UserServiceImpl implements UserService {

    private UserDAO udao = new UserDAOImpl();

    @Override
    public boolean addUser(User user, Connection connection) throws ClassNotFoundException, SQLException {

        return udao.addUser(user, connection);
    }

    @Override
    public boolean removeUserByUID(User user, Connection connection) throws ClassNotFoundException, SQLException {

        return udao.removeUserByUID(user, connection);
    }

    @Override
    public boolean upDateUserByUID(User user, Connection connection) throws ClassNotFoundException, SQLException {

        return udao.upDateUserByUID(user, connection);
    }

    @Override
    public User searchUserByUID(User user, Connection connection) throws ClassNotFoundException, SQLException {

        return udao.searchUserByUID(user, connection);
    }

}
