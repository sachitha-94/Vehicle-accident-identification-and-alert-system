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

        <script>
function validateForm() {
    var RegExp=/^[0-9]{9}[vV]$/
    var nic = document.forms["register"]["NIC"].value;
    if(!RegExp.test(nic)) {
        alert("Invalid NIC");
        return false;
    }
    var userid = document.forms["register"]["UID"].value;
    var Reg2=/^[0-9]+$/
    if(!Reg2.test(userid)) {
        alert("Invalid user ID");
        return false;
    }
    var firstname = document.forms["register"]["FIRST_NAME"].value;
    var Reg3=/^[A-Za-z]+$/
    if(!Reg3.test(firstname)) {
        alert("Enter only alphabets for First name");
        return false;
    }
    var lastname = document.forms["register"]["LAST_NAME"].value;
   
    if(!Reg3.test(lastname)) {
        alert("Enter only alphabets for last name");
        return false;
    }
    var landline = document.forms["register"]["TP_HOME"].value;
    var Reg4=/^[0-9]{10}$/
    if(!Reg4.test(landline)) {
        alert("Invalid user telephone number");
        return false;
    }
    var mobile = document.forms["register"]["TP_MOBILE"].value;
    
    if(!Reg4.test(mobile)) {
        alert("Invalid user mobile number");
        return false;
    }
    
}
</script>
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
                                    <form  name="register" style="margin-left: 15%; width: 90%;"class="form-horizontal" action="UserController" onsubmit="return validateForm()" method="post" role="form">
                                        <div class="form-group ">
                                            <label class="control-label col-sm-2" for="user_id">User ID:</label>
                                            <div class="col-sm-10">
                                                <input type="text"  class="form-control" id="user_id" placeholder="Enter User ID" name="UID" required=""/>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="nic">NIC Number:</label>
                                            <div class="col-sm-10">
                                                <input type="text"  class="form-control" placeholder="Enter NIC Munber" name="NIC" required="">
                                            </div>
                                        </div>

                                        <div class="form-group">
                                                <label class="control-label col-sm-2" >Gender:</label>
                                                <div class="col-sm-10">
                                                    <input type="radio" class="" value="Male" name="GENDER" placeholder="Enter  Gender" checked="">  <span>Male</span>
                                                    <input type="radio" class=""  value="Female" name="GENDER" placeholder="Enter  Gender">  <span>Female</span>
                                                </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="fname">First Name:</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control"  placeholder="Enter First Name" name="FIRST_NAME" required="">
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="lname">Last Name:</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control"  placeholder="Enter Last Name" name="LAST_NAME" required="">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="lname">TP Home:</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control"  placeholder="Enter Home Telephone No" name="TP_HOME" required>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="lname">TP Mobile:</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control"  placeholder="Enter Mobile No" name="TP_MOBILE" required>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="address">Address:</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control"  placeholder="Enter Address" name="ADDRESS" required>
                                            </div>
                                        </div>


                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="email">Email:</label>
                                            <div class="col-sm-10">
                                                <input type="email" class="form-control"  placeholder="Enter email" name="EMAIL" required="">
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="address">License No:</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control"  placeholder="Enter License No" name="LICENSE_NO" required>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                                <label class="control-label col-sm-2" for="blood_group">Blood Group:</label>
                                                <div class="col-sm-10">
                                                    <select class="form-control" name="BLOOD_GROUP" required>
                                                        <option value="" class="form-group"></option>
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
                                            <label class="control-label col-sm-2" for="pwd">Birth Date:</label>
                                            <div class="col-sm-10"> 
                                                <input type="date" class="form-control"  placeholder="Enter BirthDay" name="BIRTH_DAY" required="">
                                            </div>
                                        </div>
                                      
                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="dl_no">Other:</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control"  placeholder="Other" name="OTHER" required="">
                                            </div>
                                        </div>
                                        
                                         <div class="form-group"> 
                                            <div class="col-sm-offset-2 col-sm-10">
                                                <button type="submit" class="btn btn-default" value="submit">Add User</button>
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