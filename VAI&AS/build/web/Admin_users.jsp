<%-- 
    Document   : Admin - users - 1
    Created on : Apr 25, 2017, 1:09:40 AM
    Author     : Dilum
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.ucsc.vaias.model.User"%>
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
        <jsp:include page="//UserController?type=sel" flush="true"/>
        <div id="wrapper">
            <nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="Admin_users.jsp">Users</a> 
                </div>
                <div style="color: white;
                     padding: 15px 50px 5px 50px;
                     float: right;
                     font-size: 16px;"> Last access : 26 April 2017 &nbsp; <a style="color: white;" href="Admin_dashboard.jsp" class="btn btn-info square-btn-adjust">Admin Panel</a><a href="index.jsp" class="btn btn-info square-btn-adjust">Logout</a> </div>
            </nav>   
            <!-- /. NAV TOP  -->
            <nav class="navbar-default navbar-side" role="navigation">
                <div class="sidebar-collapse">
                    <ul class="nav" id="main-menu">
                        <li class="text-center">
                            <img src="assets/img/administrator.png" class="user-image img-responsive"/>
                        </li>


                        <li>
                            <a class="active-menu"  href="Admin_users.jsp"><i class="fa fa-dashboard fa-3x"></i> Dashboard</a>
                        </li>
                        <li>
                            <a  href="Admin_users_search.jsp"><i class="fa fa-desktop fa-3x"></i> Search</a>
                        </li>
                        <li>
                            <a  href="Admin_users_register.jsp"><i class="fa fa-qrcode fa-3x"></i> Registration</a>
                        </li>
                        <li  >
                            <a   href="Admin_users_update.jsp"><i class="fa fa-bar-chart-o fa-3x"></i> Update</a>
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
                    <div class="row" style="width: 135%">

                        <div class="col-md-9 col-sm-12 col-xs-12" >

                            <div class="panel panel-default" >
                                <div class="panel-heading">
                                  User details
                                </div>
                                <div class="panel-body" style="width: 100%">
                                    <div class="table-responsive" >
                                        <table class="table table-striped table-bordered table-hover" >
                                            <thead>
                                                <tr>
                                                    <th >User ID</th>
                                                    <th>NIC</th>
                                                    <th>First Name</th>
                                                    <th>Last Name</th>
                                                    <th>Mobile no</th>
                                                    <th>Gender</th>
                                                    <th>Address</th>
                                                    <th>Home Tp</th>
                                                    <th>Blood type</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <%     
                                                        ArrayList<User> list = (ArrayList<User>) request.getAttribute("list");
                                                        for (User category : list) {
                                                    %>
                                                        <tr>
                                                                     <td><% out.println(category.getUID()); %></td>
                                                                     <td><% out.println(category.getNIC()); %></td>
                                                                     <td><% out.println(category.getFIRST_NAME()); %></td>
                                                                     <td><% out.println(category.getLAST_NAME()); %></td>
                                                                     <td><% out.println(category.getTP_MOBILE()); %></td>
                                                                     <td><% out.println(category.getGENDER()); %></td>
                                                                     <td><% out.println(category.getADDRESS()); %></td>
                                                                     <td><% out.println(category.getTP_HOME()); %></td>
                                                                     <td><% out.println(category.getBLOOD_GROUP()); %></td>
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
