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
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
            
            //request.getParameter("")
            User user=new User();
            user.setUID("1");
            user.setNIC("122323");
            user.setFIRST_NAME("sad");
            user.setLAST_NAME("lklk");
            user.setGENDER("male");
            user.setTP_HOME(1212);
            user.setTP_MOBILE(34242);
            user.setADDRESS("kjsdjashdhad");
            user.setLICENSE_NO("32982hasdh");
            user.setBLOOD_GROUP("o+");
            user.setEMAIL("asjhh");
          
            user.setOTHER("lsjdaskjd");
            
           /* SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
            Date d=new Date();
            d
            String date = dateFormat.format(d);
            
              user.setBIRTH_DAY(2015/34/4);*/
            
            
            DBResourceFactory bResourceFactory=new DBResourceFactory();
            Connection connection = null;
          
            
            UserServiceImpl userServiceImpl=new UserServiceImpl();
            try {
                 connection = bResourceFactory.getFactoryConnection().getConnection();
                boolean addUser = userServiceImpl.addUser(user, connection);
                if(addUser){
                    System.out.println("sadsad kkkkkkkkkkkkkkkkkkkkkkkkk");
                }else{
                    System.out.println("wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLDataException ex) {
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
