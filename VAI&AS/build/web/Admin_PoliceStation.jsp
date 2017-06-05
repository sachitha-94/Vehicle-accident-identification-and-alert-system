<%-- 
    Document   : Admin - PoliceStation - 1.jsp
    Created on : Apr 25, 2017, 11:20:49 PM
    Author     : Shaii99
--%>

<%@page import="com.ucsc.vaias.model.PoliceStation"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
      <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Admin</title>
	<!-- BOOTSTRAP STYLES-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
     <!-- FONTAWESOME STYLES-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
     <!-- MORRIS CHART STYLES-->
    <link href="assets/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
        <!-- CUSTOM STYLES-->
    <link href="assets/css/custom.css" rel="stylesheet" />
     <!-- GOOGLE FONTS-->
   <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>
<body>
    
    <jsp:include page="//PoliceStationController?type=sel" flush="true"/>
    <div id="wrapper">
        <nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">Police Stations</a> 
            </div>
  <div style="color: white;
padding: 15px 50px 5px 50px;
float: right;
font-size: 16px;">  26 April 2017 &nbsp; <a style="color: white;" href="Admin_dashboard.jsp" class="btn btn-info square-btn-adjust">Admin Panel</a><a href="index.jsp" class="btn btn-info square-btn-adjust">Logout</a> </div>
        </nav>   
           <!-- /. NAV TOP  -->
                <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
				<li class="text-center">
                    <img src="assets/img/police.jpeg" class="user-image img-responsive"/>
					</li>
				
					
                    <li>
                        <a class="active-menu"  href="Admin_PoliceStation.jsp"><i class="fa fa-dashboard fa-3x"></i> Dashboard</a>
                    </li>
                     <li>
                         <a  href="Admin_PoliceStation_search.jsp"><i class="fa fa-desktop fa-3x"></i> Search</a>
                    </li>
                    <li>
                        <a  href="Admin_PoliceStation_register.jsp"><i class="fa fa-qrcode fa-3x"></i> Registration</a>
                    </li>
                    <li>
                            <a   href="Admin_PoliceStation_update.jsp"><i class="fa fa-bar-chart-o fa-3x"></i> Update</a>
                    </li>
                    
                      	
                </ul>
               
            </div>
            
        </nav>  
        <!-- /. NAV SIDE  -->
        <div id="page-wrapper" >
            <div id="page-inner">
                <div class="row">
                    <div class="col-md-12">
                     <h2>Admin Dashboard</h2>   
                       
                    </div>
                </div>              
                 <!-- /. ROW  -->
                  <hr />
                
                 <!-- /. ROW  -->
                <hr />                
                
                 <!-- /. ROW  -->
                
                 <!-- /. ROW  -->
                <div class="row" >
                   
                    <div class="col-md-9 col-sm-12 col-xs-12">
               
                    <div class="panel panel-default">
                        <div class="panel-heading">
                           police stations details
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover">
                                    <thead>
                                        <tr>
                                            <th>PID</th>
                                            <th>Province</th>
                                            <th>Divition</th>
                                            <th>City</th>
                                             <th>Contact No</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <%
                                                        ArrayList<PoliceStation> list = (ArrayList<PoliceStation>) request.getAttribute("list");
                                                        for (PoliceStation category : list) {
                                                    %>
                                                        <tr>
                                                                     <td><% out.println(category.getPID()); %></td>
                                                                     <td><% out.println(category.getPROVINCE()); %></td>
                                                                     <td><% out.println(category.getDIVITION()); %></td>
                                                                     <td><% out.println(category.getCITY()); %></td>
                                                                     <td style="text-align: center"><% out.println(category.getTP()); %></td>
                                                        </tr>
                                                                    
                                                    <%     }
                                                            
                                                                    %>
                                        
                                         
                                        
                                        

                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    
                    </div>
                </div>
                 <!-- /. ROW  -->
                           
    </div>
             <!-- /. PAGE INNER  -->
            </div>
         <!-- /. PAGE WRAPPER  -->
        </div>
     <!-- /. WRAPPER  -->
    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
    <!-- JQUERY SCRIPTS -->
    <script src="assets/js/jquery-1.10.2.js"></script>
      <!-- BOOTSTRAP SCRIPTS -->
    <script src="assets/js/bootstrap.min.js"></script>
    <!-- METISMENU SCRIPTS -->
    <script src="assets/js/jquery.metisMenu.js"></script>
     <!-- MORRIS CHART SCRIPTS -->
     <script src="assets/js/morris/raphael-2.1.0.min.js"></script>
    <script src="assets/js/morris/morris.js"></script>
      <!-- CUSTOM SCRIPTS -->
    <script src="assets/js/custom.js"></script>
    
   
</body>
</html>
