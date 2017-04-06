/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.vaias.connection.dbconnection;

import com.ucsc.vaias.connection.ResourceConnection;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author sajja
 */
public interface DBResourceConnection extends ResourceConnection {

    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException;

}
