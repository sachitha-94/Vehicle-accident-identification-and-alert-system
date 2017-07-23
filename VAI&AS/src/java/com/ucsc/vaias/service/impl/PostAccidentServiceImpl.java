/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.vaias.service.impl;

import com.ucsc.vaias.dao.PostAccidentDAO;
import com.ucsc.vaias.dao.impl.PostAccidentDAOImpl;
import com.ucsc.vaias.model.PostAccident;
import com.ucsc.vaias.service.PostAccidentService;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author sajja
 */
public class PostAccidentServiceImpl implements PostAccidentService{
    
    private PostAccidentDAO postAccidentDAO=new PostAccidentDAOImpl();

    @Override
    public PostAccident SearchLastRow(Connection connection) throws ClassNotFoundException, SQLException {
        return postAccidentDAO.SearchLastRow(connection);
    }

    @Override
    public boolean updatePID(Connection connection, PostAccident postAccident) throws ClassNotFoundException, SQLException {
        return postAccidentDAO.UpdatePID(connection, postAccident);
    }

    @Override
    public boolean updateHID(Connection connection, PostAccident postAccident) throws ClassNotFoundException, SQLException {
        return postAccidentDAO.UpdateHID(connection, postAccident);
    }
    
}
