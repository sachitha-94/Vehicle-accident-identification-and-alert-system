<%-- 
    Document   : Police_index
    Created on : Jul 19, 2017, 7:15:09 AM
    Author     : Ganusha
--%>

<%@page import="java.util.List"%>
<%@page import="org.codehaus.jackson.map.ObjectMapper"%>
<%@page import="com.ucsc.vaias.model.Hospital"%>
<%@page import="java.util.ArrayList"%>
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







        <div id="floating-panel">

            <select style="visibility: hidden;"  id="mode">
                <option value="DRIVING">Driving</option>
                <option value="WALKING">Walking</option>
                <option value="BICYCLING">Bicycling</option>
                <option value="TRANSIT">Transit</option>
            </select>
        </div>


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
            <div id="viewprofile" style="display: none"><jsp:include page="Hospital_profileview.jsp" /></div>
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
                                <li><a class="" href="AdminIndex.jsp">Home</a></li>
                                <li><a class="getApp" href="#getApp" id="view">View Details</a>
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
                                var id = data.aid;
                                
                                if ((prelat != lat) && (prelon != lon)) {
                                    //marker.setPosition(new google.maps.LatLng(lat, lon));
                                    // map.panTo(new google.maps.LatLng(lat, lon));

                                   
                                    prelat = lat;
                                    prelon = lon;
                                    passLatLon(lat, lon);
                                    document.getElementById("AID").value = id;
                                    
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
                        //calculateAndDisplayRoute(directionsService, directionsDisplay);

                        document.getElementById('mode').addEventListener('change', function () {

                            //calculateAndDisplayRoute(directionsService, directionsDisplay);

                        });




                    }




                    function calculateAndDisplayRoute(directionsService, directionsDisplay, minlat, minlon, lat, lon) {
                        var selectedMode = document.getElementById('mode').value;
                        directionsService.route({
                            origin: {lat: minlat, lng: minlon}, // Haight.
                            destination: {lat: lat, lng: lon}, // Ocean Beach.
                            // Note that Javascript allows us to access the constant
                            // using square brackets and a string value as its
                            // "property."
                            travelMode: google.maps.TravelMode[selectedMode]
                        }, function (response, status) {
                            if (status == 'OK') {
                                directionsDisplay.setDirections(response);
                            } else {
                                window.alert('Directions request failed due to ' + status);
                            }
                        });
                    }

                </script>
                <script async defer
                        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCIAiFOVdsKt6f2RK-lyvrQNy4D3QdAQd8&callback=initMap">
                </script>


            </header>

            <script>
                function getDistanceFromLatLonInKm(lat1, lon1, lat2, lon2) {
                    var R = 6371; // Radius of the earth in km
                    var dLat = deg2rad(lat2 - lat1);  // deg2rad below
                    var dLon = deg2rad(lon2 - lon1);
                    var a =
                            Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                            Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) *
                            Math.sin(dLon / 2) * Math.sin(dLon / 2)
                            ;
                    var c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
                    var d = R * c; // Distance in 

                    return d;
                }

                function deg2rad(deg) {
                    return deg * (Math.PI / 180)
                }


                function passLatLon(lat, lon) {

                    jQuery.ajax({
                        type: 'POST',
                        url: "PoliceStationController",
                        dataType: 'json',
                        success: function (data) {
                            var mindistance = 10000;
                            var minlat = 0;
                            var minlon = 0;
                            var minid = 0;

                            for (var i = 0; i <40; i++) {

                                if (data[i] != undefined) {
                                    var distance = getDistanceFromLatLonInKm(lat, lon, data[i], data[i + 1]);

                                    if (mindistance > distance) {
                                        mindistance = distance;
                                        minlat = data[i];
                                        minlon = data[++i];
                                        minid = data[++i];
                                    } else {
                                        i = i + 2;
                                    }



                                }
                            }
                            alert(minid);
                            document.getElementById("PID").value = minid;
                            //document.form[0].submit();
                            //minlat = 6.8625;
                            //minlon = 79.8855;
                            //lat=6.8817;
                            //lon=79.8787;
                            var directionsDisplay = new google.maps.DirectionsRenderer;
                            var directionsService = new google.maps.DirectionsService;
                            directionsDisplay.setMap(map);
                            calculateAndDisplayRoute(directionsService, directionsDisplay, minlat, minlon, lat, lon);

                            document.getElementById('mode').addEventListener('change', function () {

                                calculateAndDisplayRoute(directionsService, directionsDisplay, minlat, minlon, lat, lon);

                            });


                        }
                    });




                }


            </script>

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

                    $('#view').click(function () {
                        $("#viewprofile").toggle("slow");
                        loadData();
                        document.getElementById("map").style.opacity = "0.5";
                    });

                </script>
            </div>
        </div>

        <form class="getApp" style="float: right; " name="someForm" action="PostAccidentController" method="POST">
            <input type="hidden" name="PID" id="PID" />
            <input type="hidden" name="AID" id="AID" />
            <input type="submit"  value="SEND REQUEST" name="Submit" />
        </form>
    </body>

</html>
