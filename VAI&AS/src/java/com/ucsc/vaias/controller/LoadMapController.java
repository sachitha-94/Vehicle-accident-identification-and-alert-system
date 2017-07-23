/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.vaias.controller;

import com.ucsc.vaias.connection.factory.DBResourceFactory;
import com.ucsc.vaias.model.PostAccident;
import com.ucsc.vaias.model.User;
import com.ucsc.vaias.service.PostAccidentService;
import com.ucsc.vaias.service.impl.PostAccidentServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Ganusha
 */
@WebServlet(name = "LoadMapController", urlPatterns = {"/LoadMapController"})
public class LoadMapController extends HttpServlet {

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

        //writing data to json
        response.setContentType("json;charset=utf-8");

        JSONObject json = new JSONObject();
        PostAccident location = new PostAccident();
        DBResourceFactory dBResourceFactory = new DBResourceFactory();

        Connection connection = null;

        try {
            connection = dBResourceFactory.getFactoryConnection().getConnection();
            PostAccidentService accidentService = new PostAccidentServiceImpl();
            PostAccident searchLastRow = accidentService.SearchLastRow(connection);
         
            
            if (searchLastRow!=null) {
                
                
             
            json.put("aid", searchLastRow.getAID());
            json.put("lat", searchLastRow.getLAT());
            json.put("lon", searchLastRow.getLON());
            json.put("pid",searchLastRow.getPID());
            json.put("hid", searchLastRow.getHID());
            
            }else{
            
                
            
            }
           
            //out.print(searchLastRow.getLON());
            
            //System.out.println(searchLastRow.getLAT());

            //json.put("lat", 7.8731);
            //json.put("lon", 80.7718);
        } catch (JSONException ex) {
            Logger.getLogger(LoadMapController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoadMapController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LoadMapController.class.getName()).log(Level.SEVERE, null, ex);
        }

        response.setContentType("json");
        PrintWriter out = response.getWriter();
        out.print(json);
        out.flush();
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
