<%-- 
    Document   : Admin - police - register.jsp
    Created on : Apr 25, 2017, 11:42:45 PM
    Author     : Shaii99
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Register Police Stations</title>

        <link href="assets/css/bootstrap.css" rel="stylesheet" />
        <!-- FONTAWESOME STYLES-->
        <link href="assets/css/font-awesome.css" rel="stylesheet" />
        <!-- MORRIS CHART STYLES-->
        <link href="assets/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
        <!-- CUSTOM STYLES-->
        <link href="assets/css/custom.css" rel="stylesheet" />

        <link rel="stylesheet" href="assets/css/style2.css">

            <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
<script type="text/javascript">                                      
                function populate(s1,s2){
                    var s1= document.getElementById(s1);
                    var s2= document.getElementById(s2);
                    s2.innerHTML = "";
                    if(s1.value == "Western"){
                        var optionArray =["|","Colombo|Colombo","Gampaha|Gampaha","Kalutara|Kalutara" ];
                    }else if(s1.value == "Southern"){
                        var optionArray =["|","Galle|Galle","Matara|Matara","Hambanthota|Hambanthota" ];
                    }else if(s1.value == "Uva"){
                        var optionArray =["|","Badulla|Badulla","Monaragala|Monaragala" ];
                    }else if(s1.value == "Central"){
                        var optionArray =["|","Kandy|Kandy","Nuwara Eliya|Nuwara Eliya","Matale|Matale" ];
                    }else if(s1.value == "Northern"){
                        var optionArray =["|","Mullaitivu|Mullaitivu","vavuniya|Vavuniya","Mannar|Mannar","Kilinochchi|Kilinochchi","Jaffna|Jaffna" ];
                    }else if(s1.value == "North Western"){
                        var optionArray =["|","Kurunegala|Kurunegala","Puttalam|Puttalam"];
                    }else if(s1.value == "North Central"){
                        var optionArray =["|","Polonnaruwa|Polonnaruwa","Anuradhapura|Anuradhapura"];
                    }else if(s1.value == "Sabaragamuwa"){
                        var optionArray =["|","Kegalle|Kegalle","Ratnapura|Ratnapura"];
                    }else if(s1.value == "Eastern"){
                        var optionArray =["|","Ampara|Ampara","Batticaloa|Batticaloa","Trincomalee|Trincomalee" ];
                    }
                    for(var option in optionArray){
                        var pair = optionArray[option].split("|");
                        var newOption = document.createElement("option");
                        newOption.value = pair[0];
                        newOption.innerHTML = pair[1];
                        s2.options.add(newOption);
                    }
                }
    
    </script>
    <script>
    function validateForm(){    
        var tp = document.forms["registerpolice"]["TP"].value;
        var Reg1=/^[0-9]{10}$/;
        if(!Reg1.test(tp)) {
            alert("Invalid user telephone number");
        return false;
    }
        var lat = document.forms["registerpolice"]["LAT"].value;
        var Reg2= /^-?([1-8]?[1-9]|[1-9]0)\.{1}\d{1,6}$/;
        if(!Reg2.test(lat)) {
            alert("Invalid latitude");
        return false;
    }
        var lon = document.forms["registerpolice"]["LON"].value;
        var Reg3= /^-?([1-8]?[1-9]|[1-9]0)\.{1}\d{1,6}$/;
        if(!Reg3.test(lon)) {
            alert("Invalid longitude");
        return false;
        
    }
}
    </script> 

    </head>
    <body>
        <div><jsp:include page="location.jsp"/> </div>
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
                     font-size: 16px;">  Last access : 27 April 2016 &nbsp; <a style="color: white;" href="Admin_dashboard.jsp" class="btn btn-info square-btn-adjust">Admin Panel</a><a href="index.jsp" class="btn btn-info square-btn-adjust">Logout</a> </div>
            </nav>   
            <!-- /. NAV TOP  -->
            <nav class="navbar-default navbar-side" role="navigation">
                <div class="sidebar-collapse">
                    <ul class="nav" id="main-menu">
                        <li class="text-center">
                            <img src="assets/img/Police-icon.png" class="user-image img-responsive"/>
                        </li>


                        <li>
                            <a   href="Admin_PoliceStation.jsp"><i class="fa fa-dashboard fa-3x"></i> Dashboard</a>
                        </li>
                        <li>
                            <a  href="Admin_PoliceStation_search.jsp"><i class="fa fa-desktop fa-3x"></i> Search</a>
                        </li>
                        <li>
                            <a class="active-menu" href="Admin_PoliceStation_register.jsp"><i class="fa fa-qrcode fa-3x"></i> Registration</a>
                        </li>
                        <li  >
                            <a   href="Admin_PoliceStation_update.jsp"><i class="fa fa-bar-chart-o fa-3x"></i> Update</a>
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
                                <strong>  Register Police Stations </strong>  
                            </div>

                            <div class="col-md-8 col-sm-8 scrollpoint sp-effect1">
                                <form name="registerpolice" style="margin-left: 15%; width: 90%;"class="form-horizontal" action="PoliceStationController?type=reg" onsubmit="return validateForm()" method="post" role="form">



                                    <div class="form-group"> 
                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="address">Police Station ID:</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" placeholder="Police Station ID" name="PID" required>
                                            </div>
                                        </div>

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

                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="address">Devision:</label>
                                            <div class="col-sm-10">
                                                <select class="form-control" name="DEVISION" id="district" required>
                                                   

                                                </select>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="address">City:</label>
                                            <div class="col-sm-10">
                                                <select class="form-control" name="CITY" required>
                                                    <option value="Yakkalamulla" class="form-group">Yakkalamulla</option>

                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="address">Telephone No:</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" placeholder="Telephone No" name="TP" required>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="address">Latitude:</label>
                                            <div class="col-sm-8">
                                                <input type="text" id="lat"class="form-control" placeholder="Latitude" name="LAT" required>
                                            </div>
                                            <button type="button" class="btn btn-primary" id="mapAdd" >MAP</button>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="address">Longitude:</label>
                                            <div class="col-sm-8">
                                                <input type="text" id="lon" class="form-control" placeholder="Longitude" name="LON" required>
                                            </div>


                                        </div>




                                        <div class="col-sm-offset-2 col-sm-10">
                                            <button type="submit" class="btn btn-default">Add Police Station</button>
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

    </body

</html>
