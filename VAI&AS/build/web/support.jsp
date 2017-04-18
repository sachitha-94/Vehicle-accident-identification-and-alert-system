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
    <title>Oleose App Landing Page | Bootstrap Theme</title>
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

</head>
<body>



<div class="wrapper">
	
	<section id="support" class="doublediagonal">
            <div class="container">
                <div class="section-heading scrollpoint sp-effect3">
                    <h1>Support</h1>
                    <div class="divider"></div>
                    <p>For more info and support, contact us!</p>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <div class="row">
                            <div class="col-md-8 col-sm-8 scrollpoint sp-effect1">
                                <form action="UserController" method="post" role="form">
                                    <div class="form-group">
                                        
                                        <input type="text" class="form-control" placeholder="User ID" name="UID">
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="NIC" name="NIC">
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="Gender" name="GENDER">
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="First Name" name="FIRST_NAME">
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="Last Name" name="LAST_NAME">
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="TP Home" name="TP_HOME">
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="TP Mobile" name="TP_MOBILE">
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="TP Home" name="TP_HOME">
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="Address" name="ADDRESS">
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="License No" name="LICENSE_NO">
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="Blood Group" name="BLOOD_GROUP">
                                    </div>
                                    <div class="form-group">
                                        <input type="email" class="form-control" placeholder="Email" name="EMAIL">
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="Birth Day" name="BIRTH_DAY">
                                    </div>
                                    <div class="form-group">
                                        <textarea cols="30" rows="10" class="form-control" placeholder="OTHER"></textarea>
                                    </div>
                                    <button type="submit" class="btn btn-primary btn-lg">Submit</button>
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
        $(document).ready(function() {
            appMaster.preLoader();
        });
    </script>

</body>
</html>