/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.vaias.controller;

import com.ucsc.vaias.connection.factory.DBResourceFactory;
import com.ucsc.vaias.model.User;
import com.ucsc.vaias.service.impl.UserServiceImpl;
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
public class UserController extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String UID = request.getParameter("UID");
            String NIC = request.getParameter("NIC");
            String FIRST_NAME = request.getParameter("FIRST_NAME");
            String LAST_NAME = request.getParameter("LAST_NAME");
            String GENDER = request.getParameter("GENDER");
            int TP_HOME = Integer.valueOf(request.getParameter("TP_HOME"));
            int TP_MOBILE = Integer.valueOf(request.getParameter("TP_MOBILE"));
            String ADDRESS = request.getParameter("ADDRESS");
            String LICENSE_NO = request.getParameter("LICENSE_NO");
            String BLOOD_GROUP = request.getParameter("BLOOD_GROUP");
            String EMAIL = request.getParameter("EMAIL");
            String date = request.getParameter("BIRTH_DAY");
            Date BIRTH_DAY = Date.valueOf(date);
           
            String OTHER = request.getParameter("OTHER");
          
            User user=new User(UID, NIC, FIRST_NAME, LAST_NAME, GENDER, TP_HOME, TP_MOBILE, ADDRESS, LICENSE_NO, BLOOD_GROUP, EMAIL, BIRTH_DAY, OTHER);
         
            DBResourceFactory bResourceFactory = new DBResourceFactory();
            Connection connection = null;

            UserServiceImpl userServiceImpl = new UserServiceImpl();
            try {
                connection = bResourceFactory.getFactoryConnection().getConnection();
                boolean addUser = userServiceImpl.addUser(user, connection);
                if (addUser) {
                    response.sendRedirect(request.getHeader("referer"));
                    out.println("<script>alert('added');</script>");
                } else {
                     response.sendRedirect(request.getHeader("referer"));
                }
            } catch (ClassNotFoundException | SQLDataException ex) {
                Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
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

