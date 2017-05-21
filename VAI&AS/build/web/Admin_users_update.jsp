<%-- 
    Document   : Admin - users - update
    Created on : Apr 25, 2017, 1:52:02 AM
    Author     : Dilum
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP Page</title>
    </head>
    <body><%-- 
    Document   : Admin - users - register
    Created on : Apr 25, 2017, 1:51:14 AM
    Author     : Dilum
        --%>

        <!DOCTYPE html>
        <html xmlns="http://www.w3.org/1999/xhtml">
            <head>
                <meta charset="utf-8" />
                <meta name="viewport" content="width=device-width, initial-scale=1.0" />
                <title>Admin</title>

                <link href="assets/css/bootstrap.css" rel="stylesheet" />
                <!-- FONTAWESOME STYLES-->
                <link href="assets/css/font-awesome.css" rel="stylesheet" />
                <!-- MORRIS CHART STYLES-->
                <link href="assets/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
                <!-- CUSTOM STYLES-->
                <link href="assets/css/custom.css" rel="stylesheet" />

                <link rel="stylesheet" href="assets/css/style2.css">

                    <!-- CUSTOM STYLES-->

                    <!-- GOOGLE FONTS-->
                    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />

            </head>
            <body>
                <div id="wrapper">
                    <nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0">
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <a class="navbar-brand" href="index.html">Users</a> 
                        </div>
                        <div style="color: white;
                             padding: 15px 50px 5px 50px;
                             float: right;
                             font-size: 16px;"> Last access : 27 April 2016 &nbsp; <a style="color: white;" href="Admin_dashboard.jsp" class="btn btn-info square-btn-adjust">Admin Panel</a><a href="index.jsp" class="btn btn-info square-btn-adjust">Logout</a> </div>
                    </nav>   
                    <!-- /. NAV TOP  -->
                    <nav class="navbar-default navbar-side" role="navigation">
                        <div class="sidebar-collapse">
                            <ul class="nav" id="main-menu">
                                <li class="text-center">
                                    <img src="assets/img/administrator.png" class="user-image img-responsive"/>
                                </li>


                                <li>
                                    <a   href="Admin_users.jsp"><i class="fa fa-dashboard fa-3x"></i> Dashboard</a>
                                </li>
                                <li>
                                    <a  href="Admin_users_search.jsp"><i class="fa fa-desktop fa-3x"></i> Search</a>
                                </li>
                                <li>
                                    <a  href="Admin_users_register.jsp"><i class="fa fa-qrcode fa-3x"></i> Registration</a>
                                </li>
                                <li  >
                                    <a  class="active-menu" href="Admin_users_update.jsp"><i class="fa fa-bar-chart-o fa-3x"></i> Update</a>
                                </li>	

                            </ul>

                        </div>

                    </nav>  
                    <!-- /. NAV SIDE  -->
                    <div id="page-wrapper" >
                        <div id="page-inner">


                            <div class="container">

                                <div class="row">



                                    <div class="panel-heading">
                                        <strong>  Update user </strong>  
                                    </div>

                                   

                                    <div class="col-md-8 col-sm-8 scrollpoint sp-effect1">
                                        <form  style="margin-left: 15%; width: 90%;"class="form-horizontal" action="UserController?regidter" method="post" role="form">
                                            <div class="form-group ">
                                                <label class="control-label col-sm-2" for="user_id">User ID:</label>
                                                <div class="col-sm-8">
                                                    <input type="text" class="form-control" name="UID" placeholder="Enter User ID">
                                                       
                                                </div>
                                                 <button class="btn btn-primary"><i class="fa fa-edit " ></i> Search</button>
                                            </div>

                                            <div class="form-group">
                                                <label class="control-label col-sm-2" for="nic">NIC Number:</label>
                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control" name="NIC" placeholder="Enter NIC Munber">
                                                </div>
                                            </div>

                                            <div class="form-group">
                                                <label class="control-label col-sm-2" for="fname">Gender:</label>
                                                <div class="col-sm-10">
                                                    <input type="radio" class="" value="Male" name="Gender" placeholder="Enter  Gender">  <span>Male</span>
                                                    <input type="radio" class=""  value="Female" name="Name" placeholder="Enter  Gender">  <span>Female</span>
                                                </div>
                                            </div>

                                            <div class="form-group">
                                                <label class="control-label col-sm-2" for="fname">First Name:</label>
                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control" name="FIRST_NAME" placeholder="Enter First Name">
                                                </div>
                                            </div>

                                            <div class="form-group">
                                                <label class="control-label col-sm-2" for="lname">Last Name:</label>
                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control"  name="LAST_NAME" placeholder="Enter Last Name">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="control-label col-sm-2" for="lname">TP Home:</label>
                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control" name="TP_HOME" placeholder="Enter Home Telephone No">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="control-label col-sm-2" for="lname">TP Mobile:</label>
                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control"  name="TP_MOBILE" placeholder="Enter Mobile No">
                                                </div>
                                            </div>

                                            <div class="form-group">
                                                <label class="control-label col-sm-2" for="address">Address:</label>
                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control" name="ADDRESS" placeholder="Enter Address">
                                                </div>
                                            </div>


                                            <div class="form-group">
                                                <label class="control-label col-sm-2" for="email">Email:</label>
                                                <div class="col-sm-10">
                                                    <input type="email" class="form-control"  name="EMAIL" placeholder="Enter email">
                                                </div>
                                            </div>

                                            <div class="form-group">
                                                <label class="control-label col-sm-2" >License No:</label>
                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control" name="LICENSE_NO" placeholder="Enter License No">
                                                </div>
                                            </div>


                                            <div class="form-group">
                                                <label class="control-label col-sm-2"  for="blood_group">Blood Group:</label>
                                                <div class="col-sm-10">
                                                    <select class="form-control" name="BLOOD_GROUP">
                                                        <option value="O+" class="form-group">O+</option>
                                                        <option value="O-" class="form-group">O-</option>
                                                        <option value="A+" class="form-group">A+</option>
                                                        <option value="A-" class="form-group">A-</option>
                                                        <option value="B+" class="form-group">B+</option>
                                                        <option value="B-" class="form-group">B-</option>
                                                       
                                                    </select>
                                                    
                                                </div>
                                            </div>

                                            <div class="form-group">
                                                <label class="control-label col-sm-2" for="pwd">Birth Date</label>
                                                <div class="col-sm-10"> 
                                                    <input type="date" class="form-control" name="BIRTH_DAY" placeholder="Enter BirthDay">
                                                </div>
                                            </div>


                                            <div class="form-group">
                                                <label class="control-label col-sm-2" for="dl_no">Other:</label>
                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control" name="OTHER" placeholder="Other">
                                                </div>
                                            </div>

                                            <div class="form-group"> 
                                                <div class="col-sm-offset-2 col-sm-10">
                                                    <button type="submit" class="btn btn-default">Update User</button>
                                                    <button type="submit" class="btn btn-default">Remove</button>
                                                </div>
                                            </div>
                                        </form>
                                    </div>






                                </div>
                            </div>




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

     
    </body>
</html>
