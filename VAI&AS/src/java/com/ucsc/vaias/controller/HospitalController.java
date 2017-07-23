/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.vaias.controller;

import com.ucsc.vaias.connection.factory.DBResourceFactory;
import com.ucsc.vaias.model.Hospital;
import com.ucsc.vaias.service.HospitalService;
import com.ucsc.vaias.service.impl.HospitalServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import netscape.javascript.JSObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author sajja
 */
public class HospitalController extends HttpServlet {

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
        String type = request.getParameter("type");
        DBResourceFactory dBResourceFactory = new DBResourceFactory();
        Connection connection = null;
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        //out.flush();
        try {

            //TODO output your page here. You may use following sample code. 
            try {
                connection = dBResourceFactory.getFactoryConnection().getConnection();
                if (type.equals("reg")) {
                    String HID = request.getParameter("HID");
                    String HOSPITAL_NAME = request.getParameter("HOSPITAL_NAME");
                    String PROVINCE = request.getParameter("PROVINCE");
                    String DISTRICT = request.getParameter("DISTRICT");
                    String CITY = request.getParameter("CITY");
                    float LAT = Float.valueOf(request.getParameter("LAT"));
                    float LON = Float.valueOf(request.getParameter("LON"));
                    int TP = Integer.valueOf(request.getParameter("TP"));

                    System.out.println(type);

                    Hospital hospital = new Hospital(HID, HOSPITAL_NAME, PROVINCE, DISTRICT, CITY, LAT, LON, TP);

                    HospitalService hospitalService = new HospitalServiceImpl();
                    boolean res_Add = hospitalService.addHospital(hospital, connection);

                    if (res_Add) {
                        response.sendRedirect("Admin_hospital_register.jsp");
                    } else {

                        response.sendRedirect("Admin_hospital_register.jsp");
                    }
                }

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(HospitalController.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (type.equals("sel")) {
                try {

                    //request.getRequestDispatcher("/Admin_hospital.jsp").forward(request, response);
                    connection = dBResourceFactory.getFactoryConnection().getConnection();
                    HospitalService hospitalService = new HospitalServiceImpl();
                    ArrayList<Hospital> res_Select = hospitalService.selectAllHospital(connection);

                    if (!res_Select.isEmpty()) {
                        request.setAttribute("list", res_Select);
                        getServletContext().getRequestDispatcher("/Admin_hospital.jsp").forward(request, response);

                        out.flush();
                        out.close();
                        return;
                    }

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(HospitalController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(HospitalController.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        } catch (Exception e) {

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
        try {
            DBResourceFactory dBResourceFactory = new DBResourceFactory();
            Connection connection = null;
            connection = dBResourceFactory.getFactoryConnection().getConnection();
            HospitalService hospitalService = new HospitalServiceImpl();
            ArrayList<Hospital> res_Select = hospitalService.selectAllHospital(connection);
            JSONArray jsono = new JSONArray();
            PrintWriter out = response.getWriter();

            if (!res_Select.isEmpty()) {
                int i = 0;
                for (Hospital h : res_Select) {
                    jsono.put(i, h.getLAT());
                    ++i;
                    jsono.put(i, h.getLON());
                    ++i;
                    jsono.put(i, h.getHID());
                    i++;
                    
                    
                }
                response.setContentType("json");
                out.print(jsono);

                out.flush();
                out.close();
                return;
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HospitalController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HospitalController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            Logger.getLogger(HospitalController.class.getName()).log(Level.SEVERE, null, ex);
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
