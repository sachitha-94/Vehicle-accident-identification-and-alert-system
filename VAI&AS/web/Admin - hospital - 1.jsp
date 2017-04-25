<%-- 
    Document   : Admin - hospital - 1
    Created on : Apr 25, 2017, 7:29:17 PM
    Author     : Dilum
--%>

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
    <div id="wrapper">
        <nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="Admin - hospital - 1.jsp">Hospital</a> 
            </div>
  <div style="color: white;
padding: 15px 50px 5px 50px;
float: right;
font-size: 16px;"> Last access : 26 April 2017 &nbsp; <a href="login.html" class="btn btn-danger square-btn-adjust">Logout</a> </div>
        </nav>   
           <!-- /. NAV TOP  -->
                <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
				<li class="text-center">
                    <img src="assets/img/hospital.png" class="user-image img-responsive"/>
					</li>
				
					
                    <li>
                        <a class="active-menu"  href="Admin - hospital - 1.jsp"><i class="fa fa-dashboard fa-3x"></i> Dashboard</a>
                    </li>
                     <li>
                         <a  href="Admin - hospital - search.jsp"><i class="fa fa-desktop fa-3x"></i> Search</a>
                    </li>
                    <li>
                        <a  href="Admin - hospital - register.jsp"><i class="fa fa-qrcode fa-3x"></i> Registration</a>
                    </li>
						   <li  >
                                                       <a   href="Admin - hospital - update.jsp"><i class="fa fa-bar-chart-o fa-3x"></i> Update</a>
                    </li>	
                      	
                </ul>
               
            </div>
            
        </nav>  
        <!-- /. NAV SIDE  -->
        <div id="page-wrapper" >
            <div id="page-inner">
                <div class="row">
                 
                <div class="row" >
                   
                    <div class="col-md-9 col-sm-12 col-xs-12">
               
                    <div class="panel panel-default">
                        <div class="panel-heading">
                           Hospital Details
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover">
                                    <thead>
                                        <tr>
                                            <th>ID</th>
                                            <th>Hospital name</th>
                                            <th>District</th>
                                            <th>City</th>
                                             <th>TP</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td>1</td>
                                            <td>Teaching Hospital Karapitiya</td>
                                            <td>Galle</td>
                                            <td>Karapitiya</td>
                                            <td>94 912 32176</td>
                                        </tr>
                                        <tr>
                                            <td>2</td>
                                            <td>Teaching Hospital Kurunegala</td>
                                            <td>Kurunegala</td>
                                            <td>Kurunegala</td>
                                            <td>94 372 22226</td>
                                        </tr>
                                        <tr>
                                            <td>3</td>
                                            <td>Teaching Hospital Batticaloa</td>
                                            <td>Batticaloa</td>
                                            <td>Batticaloa</td>
                                            <td>94 112 45612</td>
                                        </tr>
                                         <tr>
                                            <td>4</td>
                                            <td>Base Hospital Type B - Pottuvil</td>
                                            <td>Pottuvil</td>
                                            <td>Pottuvil</td>
                                            <td>94 561 45678</td>
                                        </tr>
                                        <tr>
                                            <td>5</td>
                                            <td>Base Hospital Type B - Nikaweratiya</td>
                                            <td>Nikaweratiya</td>
                                            <td>Nikaweratiya</td>
                                            <td>94 546 45678</td>
                                        </tr>
                                        

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

