/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.vaias.dao;

import com.ucsc.vaias.model.User;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author sajja
 */
public interface UserDAO {

    public boolean addUser(User user, Connection connection) throws ClassNotFoundException, SQLException;

    public boolean removeUserByUID(User user, Connection connection) throws ClassNotFoundException, SQLException;

    public boolean upDateUserByUID(User user, Connection connection) throws ClassNotFoundException, SQLException;

    public User searchUserByUID(User user, Connection connection) throws ClassNotFoundException, SQLException;

}
