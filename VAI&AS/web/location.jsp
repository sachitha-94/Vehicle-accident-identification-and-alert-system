<%-- 
    Document   : location
    Created on : May 7, 2017, 4:57:32 PM
    Author     : Ganusha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            #map_canvas {
                width: 675px;
                height: 375px;
            }
            #current {
                padding-top: 25px;
            }
        </style>

        <script>
            map.setCenter(myMarker.position);
            myMarker.setMap(map);

            function initMap() {
                var map = new google.maps.Map(document.getElementById('map_canvas'), {
                    zoom: 10,
                    center: new google.maps.LatLng(6.0535, 80.2210),
                    mapTypeId: google.maps.MapTypeId.ROADMAP
                });
                var myMarker = new google.maps.Marker({
                    position: new google.maps.LatLng(6.0535, 80.2210),
                    map: map,
                    draggable: true
                });
                google.maps.event.addListener(myMarker, 'dragend', function (evt) {
                    document.getElementById('current').innerHTML = '<p>Current Lat: ' + evt.latLng.lat().toFixed(3) + ' Current Lng: ' + evt.latLng.lng().toFixed(3) + '</p>';
                    document.getElementById("lat").value =  evt.latLng.lat().toFixed(3);
                    document.getElementById("lon").value =  evt.latLng.lng().toFixed(3);
                });
                google.maps.event.addListener(myMarker, 'dragstart', function (evt) {
                    document.getElementById('current').innerHTML = '<p>Dragging marker...</p>';
                });
            }
        </script>
        <script async defer
                src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDFEVWcqOnh3kAsD96wEaLKqL2EeQq6AOo&callback=initMap">
        </script>
       

    </head>
    <body >
        <div id="mapcontainer" style="position: absolute; z-index: 20; display: none; border-style: solid; margin-left: 32%; margin-top: 10%; border-radius: 8px;">
            <section >
                <div id='map_canvas'></div>
                <div style="background: wheat;"  id="current">
                    Drag pointer
                </div>
                <div style="float:right;background: wheat; ">
                    <button id="ok" class="btn-info">OK</button>
                    <button id="cancel" class="btn-info">CANCEL</button>
                </div>
            </section>
        </div>
        
       
    </body>
</html>