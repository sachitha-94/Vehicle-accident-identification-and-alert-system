<%-- 
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
    <div id="wrapper">
        <nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="Admin_users.jsp">Users</a> 
            </div>
  <div style="color: white;
padding: 15px 50px 5px 50px;
float: right;
font-size: 16px;"> Last access : 27 April 2016 &nbsp; <a style="color: white;" href="Admin_dashboard.jsp" class="btn btn-info square-btn-adjust">Admin Panel</a><a href="index.jsp" class="btn btn-info square-btn-adjust">Logout</a></div>
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
                        <a class="active-menu" href="Admin_users_register.jsp"><i class="fa fa-qrcode fa-3x"></i> Registration</a>
                    </li>
		    <li  >
                        <a   href="Admin_users_update.jsp"><i class="fa fa-bar-chart-o fa-3x"></i> Update</a>
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
                        <strong>  Register user </strong>  
                            </div>
                            
                                <div class="col-md-8 col-sm-8 scrollpoint sp-effect1">
                                    <form  name="register" style="margin-left: 15%; width: 90%;"class="form-horizontal" action="UserController?type=reg" onsubmit="return validateForm()" method="post" role="form">
                                        <div class="form-group ">
                                            <label class="control-label col-sm-2" for="user_id">User ID:</label>
                                            <div class="col-sm-10">
                                                <input type="text"  class="form-control" id="user_id" placeholder="Enter User ID" name="UID" required>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="nic">NIC Number:</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" placeholder="Enter NIC Munber" name="NIC" required onkeypress="return isNumberKey(event)">
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
                                                <input type="text" class="form-control"  placeholder="Enter First Name" name="FIRST_NAME" required>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="lname">Last Name:</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control"  placeholder="Enter Last Name" name="LAST_NAME" required>
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
                                                <input type="email" class="form-control"  placeholder="Enter email" name="EMAIL" required>
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
                                                        <option value="AB+" class="form-group">AB+</option>
                                                        <option value="AB-" class="form-group">AB-</option>
                                                    </select>
                                                    
                                                </div>
                                            </div>

                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="pwd">Birth Date:</label>
                                            <div class="col-sm-10"> 
                                                <input type="date" class="form-control"  placeholder="Enter BirthDay" name="BIRTH_DAY" required>
                                            </div>
                                        </div>
                                      
                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="dl_no">Other:</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control"  placeholder="Other" name="OTHER" required>
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
