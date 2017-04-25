<%-- 
    Document   : D-Update_User.jsp
    Created on : Apr 23, 2017, 4:43:17 PM
    Author     : Shaii99
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Update_User</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <link rel="shortcut icon" href="favicon.png">
        
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/animate.css">
        <link rel="stylesheet" href="assets/css/font-awesome.min.css">
        <link rel="stylesheet" href="assets/css/slick.css">
        <link rel="stylesheet" href="assets/js/rs-plugin/css/settings.css">
        <link rel="stylesheet" href="assets/css/styles.css">


        <script type="text/javascript" src="assets/js/modernizr.custom.32033.js"></script>
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
        
        <style>
            button {
                float: left;
                border: 1px solid green;
                width: 150px;
                border: 2px solid #00A8FF;
                border-radius: 12px;
                padding: 16px;
}

            button:hover {
                background-color: #00A8FF; 
                color: white;
                box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
}

            input{
                width: 130px;
                -webkit-transition: width 0.4s ease-in-out;
                transition: width 0.4s ease-in-out;
}

/* When the input field gets focus, change its width to 100% */
            input[type=text]:focus {
                width: 100%;
}


        </style>
        
    </head>
    
    
    <body>
        
        <button type="button">Add User</button>
        <button type="button">Update</button>
        <button type="button">Remove</button>
        <button type="button">Block</button>
        
        <br><br><hr>
        
        <form class="form-horizontal">
            
            <input type="text" name="search" placeholder="Search"><br><hr>
            
            <div class="form-group">
                <label class="control-label col-sm-2" for="user_id">User ID:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="user_id" placeholder="Enter User ID">
                    </div>
            </div>
            
            <div class="form-group">
                <label class="control-label col-sm-2" for="name">Name:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="name" placeholder="Enter Name">
                    </div>
            </div>
            
            <div class="form-group">
                <label class="control-label col-sm-2" for="nic">NIC Number:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="address" placeholder="Enter NIC Munber">
                    </div>
            </div>
            
            <div class="form-group">
                <label class="control-label col-sm-2" for="address">Address:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="address" placeholder="Enter Address">
                    </div>
            </div>
            
            <div class="form-group">
                <label class="control-label col-sm-2" for="tp_no">Telephone Number:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="tp_no" placeholder="Enter Telephone Number">
                    </div>
            </div>
            
            <div class="form-group">
                <label class="control-label col-sm-2" for="mob_no">Mobile Number:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="mob_no" placeholder="Enter Mobile Number">
                    </div>
            </div>
            
            <div class="form-group">
                <label class="control-label col-sm-2" for="email">Email:</label>
                    <div class="col-sm-10">
                        <input type="email" class="form-control" id="email" placeholder="Enter email">
                    </div>
            </div>
            
            <div class="form-group">
                <label class="control-label col-sm-2" for="dl_no">Driving License Number:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="dl_no" placeholder="Enter Driving License Number">
                    </div>
            </div>
            
            <div class="form-group">
                <label class="control-label col-sm-2" for="blood_group">Blood Group:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="blood_group" placeholder="Enter Blood Group">
                    </div>
            </div>
            
            <div class="form-group">
                <label class="control-label col-sm-2" for="pwd">Password:</label>
                    <div class="col-sm-10"> 
                        <input type="password" class="form-control" id="pwd" placeholder="Enter password">
                    </div>
            </div>
            
            <div class="form-group"> 
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default">Save Changes</button>
                </div>
            </div>
            
        </form>
        
    </body>
</html>
