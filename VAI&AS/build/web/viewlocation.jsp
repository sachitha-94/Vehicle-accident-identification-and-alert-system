<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="initial-scale=1.0, user-scalable=no">
        <meta charset="utf-8">
        <title>Simple markers</title>
        <style>
            /* Always set the map height explicitly to define the size of the div
             * element that contains the map. */
            #map {
                height: 100%;
            }
            /* Optional: Makes the sample page fill the window. */
            html, body {
                height: 100%;
                margin: 0;
                padding: 0;
            }
        </style>
    </head>
    <body>
        <div id="map"></div>
        <script>


            setInterval("loadMap();", 1000);

            function loadMap() {
                
                jQuery.ajax({
                    type: 'POST',
                    url: "LoadMapController",
                    dataType: 'json',
                    success: function (data) {
                        var receivedData = [];
                        $.each(data.jsonArray, function (index) {
                            $.each(data.jsonArray[index], function (key, value) {
                                var point = [];

                                point.push(key);
                                point.push(value);
                                receivedData.push(point);

                            });
                        });
                        
                        alert("success");

                    }
                });


            }


            function initMap() {
                var myLatLng = {lat: -25.363, lng: 131.044};

                var map = new google.maps.Map(document.getElementById('map'), {
                    zoom: 4,
                    center: myLatLng
                });

                var marker = new google.maps.Marker({
                    position: myLatLng,
                    map: map,
                    title: 'Hello World!'
                });
            }
        </script>
        <script async defer
                src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBQNxuARLxgAq6oGgjEiHcMGCwRG7Eye2A&callback=initMap">
        </script>
    </body>
</html>