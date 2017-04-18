/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.vaias.controller;

import com.ucsc.vaias.connection.factory.DBResourceFactory;
import com.ucsc.vaias.model.Vehicle;
import com.ucsc.vaias.service.VehicleService;
import com.ucsc.vaias.service.impl.VehicleServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
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
public class VehicleController extends HttpServlet {

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
            
            Vehicle vehicle=new  Vehicle();
            vehicle.setVID("122");
            vehicle.setREGISTER_NO("kjshd");
            vehicle.setCHASSI_NO("kjs");
            vehicle.setENGINE_NO("ajkshd");
            vehicle.setVEHICLE_TYPE("ajsdh");
            
            DBResourceFactory resourceFactory =new DBResourceFactory();
            Connection connection = resourceFactory.getFactoryConnection().getConnection();
            
            VehicleService vehicleService=new VehicleServiceImpl();
            boolean addVehicle = vehicleService.addVehicle(vehicle, connection);
            
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet VehicleController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet VehicleController at " + request.getContextPath() + "</h1>");
            if (addVehicle) {
                out.println("add");
            } else {
                  out.println("fale");
            }
            out.println("</body>");
            out.println("</html>");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VehicleController.class.getName()).log(Level.SEVERE, null, ex);
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
