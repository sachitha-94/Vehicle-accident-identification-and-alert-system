/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.vaias.connection.factory;

import com.ucsc.vaias.connection.dbconnection.DBResourceConnection;
import com.ucsc.vaias.connection.dbconnection.impl.DBResourceConnectionImpl;

/**
 *
 * @author sajja
 */
public class DBResourceFactory {

    public DBResourceConnection getFactoryConnection() {

        return new DBResourceConnectionImpl();
    }

}
