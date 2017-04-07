/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.vaias.connection.dbconnection.impl;

import com.ucsc.vaias.connection.dbconnection.DBResourceConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sajja
 */
public class DBResourceConnectionImpl implements DBResourceConnection {

    private final String url = "jdbc:mysql://localhost/vaias";
    private final String user = "root";
    private final String password = "";

    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, user, password);

        return connection;
    }

}
