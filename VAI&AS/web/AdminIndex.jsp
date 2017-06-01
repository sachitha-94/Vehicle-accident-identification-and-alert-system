<%-- 
    Document   : index
    Created on : Mar 22, 2017, 9:08:51 AM
    Author     : Ganusha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en" class="no-js">

    <head>
        <meta charset="UTF-8">
        <title>VAIAS</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <link rel="shortcut icon" href="favicon.png">

        <!-- style sheets -->
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



    </head>

    <body>


        <div class="container" style="width: 100%">
            <div class="pre-loader">
                <div class="load-con">
                    <img src="assets/img/freeze/logo.png" class="animated fadeInDown" alt="">
                    <div class="spinner">
                        <div class="bounce1"></div>
                        <div class="bounce2"></div>
                        <div class="bounce3"></div>
                    </div>
                </div>
            </div>
            <div id="viewprofile" style="display: none"><jsp:include page="profileview.jsp" /></div>
            <header>

                <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
                    <div class="container">
                        <!-- Brand and toggle get grouped for better mobile display -->
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                                <span class="fa fa-bars fa-lg"></span>
                            </button>
                            <a class="navbar-brand" href="index.html">
                                <img src="assets/img/freeze/logo.png" alt="" class="logo">
                            </a>
                        </div>

                        <!-- Collect the nav links, forms, and other content for toggling -->
                        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

                            <ul class="nav navbar-nav navbar-right">
                                <li><a class="getApp" href="Admin_dashboard.jsp">Admin Panel</a>
                                </li>

                                <li><a href="index.jsp">Log Out</a>
                                </li>
                            </ul>
                        </div>
                        <!-- /.navbar-collapse -->
                    </div>
                    <!-- /.container-->
                </nav>


                <!--RevSlider-->
                <div id="banner"  style="height: 150px;">
                </div>



                <div id="map" style="height: 700px;width: 100%;"></div>

                <script>

                    setInterval("loadMap();", 1000);

                    var map;
                    var marker;

                    var prelat = 0;
                    var prelon = 0;

                    function loadMap() {

                        jQuery.ajax({
                            type: 'POST',
                            url: "LoadMapController",
                            dataType: 'json',
                            success: function (data) {
                                var lat = data.lat;
                                var lon = data.lon;
                                if ((prelat != lat) && (prelon != lon)) {
                                    marker.setPosition(new google.maps.LatLng(lat, lon));
                                    map.panTo(new google.maps.LatLng(lat, lon));
                                    

                                    marker.addListener('click', function () {
                                        $("#viewprofile").toggle("slow");
                                        loadData();
                                        document.getElementById("map").style.opacity = "0.5";
                                    });

                                    prelat = lat;
                                    prelon = lon;
                                    
                                   

                                    
                                    
                                }

                            }

                               
                        });



                    }




                    function initMap() {
                        var myLatLng = {lat: 0, lng: 0};
                        var directionsDisplay = new google.maps.DirectionsRenderer;
                        var directionsService = new google.maps.DirectionsService;

                        map = new google.maps.Map(document.getElementById('map'), {
                            zoom: 8,
                            center: myLatLng
                        });
                        directionsDisplay.setMap(map);

                        marker = new google.maps.Marker({
                            position: myLatLng,
                            map: map,
                            title: 'Hello World!'

                        });
                        directionsDisplay.setMap(map);





                    }






                </script>
                <script async defer
                        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCIAiFOVdsKt6f2RK-lyvrQNy4D3QdAQd8&callback=initMap">
                </script>


            </header>

            




            <div class="wrapper">
                <footer>
                    <div class="container">
                        <a href="#" class="scrollpoint sp-effect3">
                            <img src="assets/img/freeze/logo.png" alt="" class="logo">
                        </a>
                        <div class="social">
                            <a href="#" class="scrollpoint sp-effect3"><i class="fa fa-twitter fa-lg"></i></a>
                            <a href="#" class="scrollpoint sp-effect3"><i class="fa fa-google-plus fa-lg"></i></a>
                            <a href="#" class="scrollpoint sp-effect3"><i class="fa fa-facebook fa-lg"></i></a>
                        </div>
                        <div class="rights">
                            <p>Copyright &copy; 2014</p>
                            <p>Template by <a href="http://www.scoopthemes.com" target="_blank">ScoopThemes</a></p>
                        </div>
                    </div>
                </footer>
                <script>
                    $('#banner').css('background-image', 'url(assets/img/freeze/bk-freeze.jpg)');
                    $('#banner').css('height', '140px');
                </script>


                <script>

                    $('#close').click(function () {
                        $('#viewprofile').hide("slow");
                        document.getElementById("map").style.opacity = "1";

                    });



                </script>
            </div>
        </div>
    </body>

</html>
