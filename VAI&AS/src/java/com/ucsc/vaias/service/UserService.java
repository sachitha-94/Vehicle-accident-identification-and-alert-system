/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.vaias.service;

import com.ucsc.vaias.model.User;
import java.sql.Connection;
import java.sql.SQLDataException;

/**
 *
 * @author sajja
 */
public interface UserService {
    
    public boolean addUser(User user,Connection connection)throws ClassNotFoundException,SQLDataException;
    
}
