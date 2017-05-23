/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.vaias.controller;


import com.ucsc.vaias.connection.factory.DBResourceFactory;
import com.ucsc.vaias.model.PoliceStation;

import com.ucsc.vaias.service.PoliceStationService;

import com.ucsc.vaias.service.impl.PoliceStationServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sajja
 */
public class PoliceStationController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String PID = request.getParameter("PID");
            String PROVINCE = request.getParameter("PROVINCE");
            String DIVISION = request.getParameter("DEVISION");
            String CITY = request.getParameter("CITY");
            
            float LAT = Float.valueOf(request.getParameter("LAT"));
            float LON = Float.valueOf(request.getParameter("LON"));
            int TP = Integer.valueOf(request.getParameter("TP"));
            
            PoliceStation police =  new PoliceStation(PID, PROVINCE, DIVISION, CITY, LAT, LON, TP);
            
            DBResourceFactory dBResourceFactory = new DBResourceFactory();
            Connection connection = null;
            
            try {
                connection = dBResourceFactory.getFactoryConnection().getConnection();

                PoliceStationService policestationService = new PoliceStationServiceImpl();
                boolean res_Add = policestationService.addPoliceStation(police, connection);

                if (res_Add) {
                    response.sendRedirect(request.getHeader("referer"));
                    out.println("<script>alert('added');</script>");
                } else {

                    response.sendRedirect(request.getHeader("referer"));
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(HospitalController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>


}
