/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.vaias.service.impl;

import com.ucsc.vaias.dao.HospitalDAO;
import com.ucsc.vaias.dao.impl.HospitalDAOImpl;
import com.ucsc.vaias.model.Hospital;
import com.ucsc.vaias.service.HospitalService;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author sajja
 */
public class HospitalServiceImpl implements HospitalService {

    @Override
    public boolean addHospital(Hospital hospital, Connection connection) throws ClassNotFoundException, SQLException {
        HospitalDAO hdao = new HospitalDAOImpl();
        return hdao.addHospital(hospital, connection);
    }

    @Override
    public boolean removeHospitalByHID(Hospital hospital, Connection connection) throws ClassNotFoundException, SQLException {
        HospitalDAO hdao = new HospitalDAOImpl();
        return hdao.removeHospitalByHID(hospital, connection);
    }

    @Override
    public boolean updateHospitalByHID(Hospital hospital, Connection connection) throws ClassNotFoundException, SQLException {
        HospitalDAO hdao = new HospitalDAOImpl();
        return hdao.updateHospitalByHID(hospital, connection);
    }

    @Override
    public Hospital searchHospitalByHID(Hospital hospital, Connection connection) throws ClassNotFoundException, SQLException {
        HospitalDAO hdao = new HospitalDAOImpl();
        return hdao.searchHospitalByHID(hospital, connection);
    }

}
