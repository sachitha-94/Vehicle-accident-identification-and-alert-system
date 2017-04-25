<%-- 
    Document   : Add_Family
    Created on : Apr 25, 2017, 11:29:53 AM
    Author     : Shaii99
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Add_Family</title>
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
        </style>
        
    </head>
    <body>
        
        <button type="button">Add Family</button>
        <button type="button">Update</button>
        <button type="button">Remove</button>
        
        <br><br><hr>
        
        <form class="form-horizontal">
            
            <div class="form-group">
                <label class="control-label col-sm-2" for="user_id">User ID:</label>
                    <div class="col-sm-10">
                        <input type="varchar" class="form-control" id="user_id" placeholder="Enter User ID">
                    </div>
            </div>
            
            <div class="form-group">
                <label class="control-label col-sm-2" for="driver_id">Driver ID:</label>
                    <div class="col-sm-10">
                        <input type="varchar" class="form-control" id="driver_id" placeholder="Enter Driver ID">
                    </div>
            </div>
            
            <div class="form-group">
                <label class="control-label col-sm-2" for="family_id">Family ID:</label>
                    <div class="col-sm-10">
                        <input type="varchar" class="form-control" id="family_id" placeholder="Enter Family ID">
                    </div>
            </div>
        
            <div class="form-group">
                <label class="control-label col-sm-2" for="address">Address:</label>
                    <div class="col-sm-10">
                        <input type="varchar" class="form-control" id="address" placeholder="Enter Address">
                    </div>
            </div>
            
            <div class="form-group">
                <label class="control-label col-sm-2" for="tp">Telephone Number:</label>
                    <div class="col-sm-10">
                        <input type="varchar" class="form-control" id="tp" placeholder="Enter Telephone Number">
                    </div>
            </div>
            
            <div class="form-group">
                <label class="control-label col-sm-2" for="mobile">Mobile Number:</label>
                    <div class="col-sm-10">
                        <input type="varchar" class="form-control" id="mobile" placeholder="Enter Mobile Number">
                    </div>
            </div>
                      
            <div class="form-group"> 
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default">Add Family Member</button>
                </div>
            </div>
            
        </form>
        
    </body>
</html>
