<%-- 
    Document   : login
    Created on : Apr 25, 2017, 9:01:02 AM
    Author     : Ishan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
    <title>Oleose App Landing Page | Bootstrap Theme</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <link rel="shortcut icon" href="favicon.png">
            
    <!-- Bootstrap 3.3.2 -->
    <link rel="stylesheet" href="assets/css/bootstrap.min.css">
    
    <link rel="stylesheet" href="assets/css/animate.css">
    <link rel="stylesheet" href="assets/css/login.css">
    <link rel="stylesheet" href="assets/css/font-awesome.min.css">
    <link rel="stylesheet" href="assets/css/slick.css">
    <link rel="stylesheet" href="assets/js/rs-plugin/css/settings.css">

    <link rel="stylesheet" href="assets/css/styles.css">


    <script type="text/javascript" src="assets/js/modernizr.custom.32033.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="wrapper" id="wrapper" style="position: absolute; z-index: 10; margin-top: 15%; margin-left: 5%;  display: none;">
	
	<section id="support" class="doublediagonal">
            <div class="container">
                
                <div class="row">
                    <div class="container">
	<section id="content">
		<form action="AdminController">
			<h1>Login</h1>
			<div class="form-group">
                            <input type="text" placeholder="Username" required="" id="username"  class="form-control"  name="EMAIL"/>
			</div>
			<div>
                            <input type="password" placeholder="Password" required="" id="password" class="form-control" name="PASSWORD" />
			</div>
			<div>
                             
				<input type="submit" value="Log in" class="btn btn-primary btn-lg"/>
				<a href="#">Lost your password?</a>
				<a href="#">Register</a>
			</div>
		</form><!-- form -->
		
	</section><!-- content -->
</div><!-- container -->
                    <div class="col-md-12">
                        <div class="row">
                            
                            
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
    <script src="assets/js/index.js"></script>
    <script>
        $(document).ready(function() {
            appMaster.preLoader();
            
        });
    </script>

    </body>
</html>
