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
                width: 980px;
                height: 500px;
            }
            #current {
                padding-top: 25px;
            }
        </style>

        <script>
           
            var map = new google.maps.Map(document.getElementById('map_canvas'), {

                zoom: 1,
                center: new google.maps.LatLng(35.137879, -82.836914),
                mapTypeId: google.maps.MapTypeId.ROADMAP
                
            });
            var myMarker = new google.maps.Marker({
                position: new google.maps.LatLng(47.651968, 9.478485),
                draggable: true
            });

            google.maps.event.addListener(myMarker, 'dragend', function (evt) {
                document.getElementById('current').innerHTML = '<p>Marker dropped: Current Lat: ' + evt.latLng.lat().toFixed(3) + ' Current Lng: ' + evt.latLng.lng().toFixed(3) + '</p>';
            });

            google.maps.event.addListener(myMarker, 'dragstart', function (evt) {
                document.getElementById('current').innerHTML = '<p>Currently dragging marker...</p>';
            });

            map.setCenter(myMarker.position);
            myMarker.setMap(map);
        </script>

    </head>
    <body onload="">
        <section>
            <div id='map_canvas'></div>
            <div id="current">Nothing yet...</div>
        </section>
    </body>
</html>
