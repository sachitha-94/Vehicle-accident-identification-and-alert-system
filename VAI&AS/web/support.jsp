<%-- 
    Document   : support
    Created on : Mar 22, 2017, 9:49:29 AM
    Author     : Ganusha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>VIA&AS</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <link rel="shortcut icon" href="favicon.png">

        <!-- Bootstrap 3.3.2 -->
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">

        <link rel="stylesheet" href="assets/css/animate.css">
        <link rel="stylesheet" href="assets/css/font-awesome.min.css">
        <link rel="stylesheet" href="assets/css/slick.css">
        <link rel="stylesheet" href="assets/js/rs-plugin/css/settings.css">

        <link rel="stylesheet" href="assets/css/styles.css">


        <script type="text/javascript" src="assets/js/modernizr.custom.32033.js"></script>
        <style>
          
        </style>

        
    </head>
    <body>



        <div class="wrapper">

            <section id="support" class="doublediagonal">
                <div class="container">
                    <div class="section-heading scrollpoint sp-effect3">
                        <h1>Register User</h1>
                        <div class="divider"></div>
                        <p>For more info and support, contact us!</p>
                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <div class="row">
                                <div class="col-md-8 col-sm-8 scrollpoint sp-effect1">
                                    <form  style="margin-left: 15%; width: 90%;"class="form-horizontal" action="UserController" method="post" role="form">
                                        <div class="form-group ">
                                            <label class="control-label col-sm-2" for="user_id">User ID:</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" id="user_id" placeholder="Enter User ID">
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="nic">NIC Number:</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" id="address" placeholder="Enter NIC Munber">
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="fname">Gender:</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" id="fname" placeholder="Enter  Gender">
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="fname">First Name:</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" id="fname" placeholder="Enter First Name">
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="lname">Last Name:</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" id="lname" placeholder="Enter Last Name">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="lname">TP Home:</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" id="lname" placeholder="Enter Home Telephone No">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="lname">TP Mobile:</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" id="lname" placeholder="Enter Mobile No">
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="address">Address:</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" id="address" placeholder="Enter Address">
                                            </div>
                                        </div>


                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="email">Email:</label>
                                            <div class="col-sm-10">
                                                <input type="email" class="form-control" id="email" placeholder="Enter email">
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="address">License No:</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" id="address" placeholder="Enter License No">
                                            </div>
                                        </div>


                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="blood_group">Blood Group:</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" id="blood_group" placeholder="Enter Blood Group">
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="pwd">Birth Date</label>
                                            <div class="col-sm-10"> 
                                                <input type="date" class="form-control" id="pwd" placeholder="Enter BirthDay">
                                            </div>
                                        </div>


                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="dl_no">Other:</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" id="dl_no" placeholder="Other">
                                            </div>
                                        </div>
                                        
                                         <div class="form-group"> 
                                            <div class="col-sm-offset-2 col-sm-10">
                                                <button type="submit" class="btn btn-default">Add User</button>
                                            </div>
                                        </div>
                                    </form>
                                </div>

                            </div>
                        </div>
                    </div>
                </div>
            </section>

        </div> 

        <script src="assets/js/jquery-1.11.1.min.js"></script>
        <script src="assets/js/bootstrap.min.js"></script>
        <script src="assets/js/slick.min.js"></script>
        <script src="assets/js/placeholdem.min.js"></script>
        <script src="assets/js/rs-plugin/js/jquery.themepunch.plugins.min.js"></script>
        <script src="assets/js/rs-plugin/js/jquery.themepunch.revolution.min.js"></script>
        <script src="assets/js/waypoints.min.js"></script>
        <script src="assets/js/scripts.js"></script>
        <script>
            $(document).ready(function () {
                appMaster.preLoader();
            });
        </script>

    </body>
</html>