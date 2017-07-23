<%-- 
    Document   : Admin_Reports_customized
    Created on : Jul 19, 2017, 12:12:39 PM
    Author     : Shaii99
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Customized Reports</title>
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
                    <a class="navbar-brand" href="Admin_Reports.jsp">Reports</a> 
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
                            <img src="assets/img/custom.png" class="user-image img-responsive"/>
                        </li>


                        <li>
                            <a href="Admin_Reoprts.jsp"><i class="fa fa-dashboard fa-3x"></i> Dashboard</a>
                        </li>
                        <li>
                            <a href="Admin_Reports_accidents.jsp"><i class="fa fa-desktop fa-3x"></i> Accidents</a>
                        </li>
                        <li>
                            <a  href="Admin_Reports_areas.jsp"><i class="fa fa-qrcode fa-3x"></i> Areas</a>
                        </li>
                        <li  >
                            <a  class="active-menu" href="Admin_Reports_customized.jsp"><i class="fa fa-bar-chart-o fa-3x"></i> Customized Reports</a>
                        </li>	

                    </ul>

                </div>

            </nav>
            
            <!-- /. NAV SIDE  -->
            <div id="page-wrapper" >
                <div id="page-inner">
                    <div class="row">
                        <div class="col-md-12">
                            <h2>Customized Reports</h2>   
                            
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
                                  
                                </div>
                                
                                <div class="panel-body" style="width: 100%">
                                    <div class="table-responsive" >
                                        
                                        <div class="form-group">
                                            <label class="control-label col-sm-2" >Province:</label>
                                            <div class="col-sm-10">
                                                <select class="form-control" name="PROVINCE" id="province" onchange="populate(this.id,'district')" required>
                                                    <option value="" class="form-group"></option>
                                                    <option value="Western" class="form-group">Western</option>
                                                    <option value="Southern" class="form-group">Southern</option>
                                                    <option value="Uva" class="form-group">Uva</option>
                                                    <option value="Central" class="form-group">Central</option>
                                                    <option value="Northern" class="form-group">North</option>
                                                    <option value="North Western" class="form-group">North Western</option>
                                                    <option value="North Central" class="form-group">North Central</option>
                                                    <option value="Sabaragamuwa" class="form-group">Sabaragamuwa</option>
                                                    <option value="Eastern" class="form-group">Eastern</option>

                                                </select>
                                    </div>
                                </div>
                                        <br><br>
                                        
                                        <div class="form-group">
                                            <label class="control-label col-sm-2" >Time Frame:</label>
                                            <div class="col-sm-10">
                                                <select class="form-control" name="PROVINCE" id="province" onchange="populate(this.id,'district')" required>
                                                    <option value="" class="form-group"></option>
                                                    <option value="Western" class="form-group">2017.07 - 2017.09</option>
                                                    <option value="Southern" class="form-group">2017.04 - 2017.06</option>
                                                    <option value="Uva" class="form-group">2017.01 - 2017.03</option>
                                                    <option value="Central" class="form-group">2016.10 - 2016.12</option>
                                                    <option value="Northern" class="form-group">2016.07 - 2016.09</option>
                                                    <option value="North Western" class="form-group">2016.04 - 2017.06</option>
                                                    <option value="North Central" class="form-group">2016.01 - 2016.03</option>
                                                </select>
                                            </div>
                                        </div>
                                
                                        <br><br>
                                        
                                        <div class="form-group">
                                            <label class="control-label col-sm-2" >Time of the Day:</label>
                                            <div class="col-sm-10">
                                                <select class="form-control" name="PROVINCE" id="province" onchange="populate(this.id,'district')" required>
                                                    <option value="" class="form-group"></option>
                                                    <option value="Western" class="form-group">0000h-0300h</option>
                                                    <option value="Southern" class="form-group">0300h-0600h</option>
                                                    <option value="Uva" class="form-group">0600h-0900h</option>
                                                    <option value="Central" class="form-group">0900-1200</option>
                                                    <option value="Northern" class="form-group">1200h-1500h</option>
                                                    <option value="North Western" class="form-group">1500h-1800h</option>
                                                    <option value="North Central" class="form-group">1800h-2100h</option>
                                                    <option value="North Central" class="form-group">2100h-2400h</option>
                                                </select>
                                            </div>
                                        </div>
                                
                                        <br><br>
                                        
                                <div class="form-group"> 
                                        <div class="col-sm-offset-2 col-sm-10">
                                            <button type="button" class="btn btn-primary" id="mapAdd" >MAP</button>
                                            <button type="submit" class="btn btn-default">Generate Report</button>
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
        
        <script>
            $('#mapAdd').click(function () {
                $('#mapcontainer').toggle("slow");
                document.getElementById("wrapper").style.opacity = "0.5";

            });

            $('#ok').click(function () {
                $('#mapcontainer').toggle("slow");
                document.getElementById("wrapper").style.opacity = "1";

            });

            $('#cancel').click(function () {
                $('#mapcontainer').toggle("slow");
                document.getElementById("wrapper").style.opacity = "1";
            });
        </script>


    </body>
</html>
