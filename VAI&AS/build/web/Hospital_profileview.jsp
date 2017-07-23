<%-- 
    Document   : profileview
    Created on : Mar 26, 2017, 3:44:24 PM
    Author     : Ganusha
--%>

<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    </head>

    <body>
        <div class="container " id="container" style="position: absolute; z-index: 12; margin-left: 5%; margin-top: 5%; ">
            <div class="row">
                <div class="col-md-5  toppad  pull-right col-md-offset-3 ">

                    <p class=" text-info">May 05,2016,03:00 pm </p>
                </div>
                <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad" >


                    <div class="panel panel-info">
                        <div class="panel-heading">
                            <h3 class="panel-title"></h3>
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-md-3 col-lg-3 " align="center"> <img alt="User Pic" src="http://babyinfoforyou.com/wp-content/uploads/2014/10/avatar-300x300.png" class="img-circle img-responsive"> </div>
                                <script>
                                    load();
                                    function load(){  
                                       
                                        jQuery.ajax({
                                            type: 'POST',
                                            url: "PostAccidentController",
                                            dataType: 'json',
                                            success: function(data) {
                                                
                                               
                                                //alert(JSON.stringify(data));
                                                document.getElementById("bloodgroup").innerHTML = data.BLOOD_GROUP;
                                                document.getElementById("licenno").innerHTML = data.LICENSE_NO;
                                                document.getElementById("bdate").innerHTML = data.BIRTH_DAY;
                                                document.getElementById("gender").innerHTML = data.GENDER;
                                                document.getElementById("haddress").innerHTML = data.ADDRESS;
                                                document.getElementById("email").innerHTML = data.EMAIL;
                                                document.getElementById("land").innerHTML = data.TP_HOME;
                                                document.getElementById("mobile").innerHTML = data.TP_MOBILE;

                                            }
                                        });
                                       
                                        //document.getElementById("bloodgroup").innerHTML = res.;
                                    }
                                    
                                </script>

                                <div class=" col-md-9 col-lg-9 "> 
                                    <table class="table table-user-information">
                                        <tbody>
                                            <tr>
                                                <td>Blood Group:</td>
                                                <td  id="bloodgroup"></td>
                                            </tr>
                                            <tr>
                                                <td>License No:</td>
                                                <td id="licenno">${user.LICENSE_NO}</td>
                                            </tr>
                                            <tr>
                                                <td>Date of Birth</td>
                                                <td id="bdate">${user.BIRTH_DAY}</td>
                                            </tr>

                                            <tr>
                                            <tr>
                                                <td>Gender</td>
                                                <td id="gender">${user.GENDER}</td>
                                            </tr>
                                            <tr>
                                                <td>Home Address</td>
                                                <td id="haddress">${user.ADDRESS}</td>
                                            </tr>
                                            <tr>
                                                <td>Email</td>
                                                <td id="email"><a href="mailto:info@support.com">${user.EMAIL}</a></td>
                                            </tr>
                                        <td>Phone Number</td>
                                        <td id="land">${user.TP_HOME}(Landline)<br><br id="mobile">(Mobile)
                                        </td>

                                        </tr>

                                        </tbody>
                                    </table>

                                   
                                </div>
                            </div>
                        </div>
                        <div class="panel-footer">
                            <a data-original-title="Broadcast Message" data-toggle="tooltip" type="button" class="btn btn-sm btn-primary"><i class="glyphicon glyphicon-envelope"></i></a>
                            <span class="pull-right">
                                <a href="edit.html" data-original-title="Edit this user" data-toggle="tooltip" type="button" class="btn btn-sm btn-warning"><i class="glyphicon glyphicon-edit"></i></a>
                                <a data-original-title="Remove this user" id=close data-toggle="tooltip" type="button" class="btn btn-sm btn-danger"><i class="glyphicon glyphicon-remove"></i></a>
                            </span>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </body>
</html>