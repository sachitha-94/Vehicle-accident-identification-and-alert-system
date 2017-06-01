package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class shortestpath_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            html, body, #map-canvas {\n");
      out.write("                height: 100%;\n");
      out.write("                margin: 0px;\n");
      out.write("                padding: 0px\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #panel {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 5px;\n");
      out.write("                left: 50%;\n");
      out.write("                margin-left: -180px;\n");
      out.write("                z-index: 5;\n");
      out.write("                background-color: #fff;\n");
      out.write("                padding: 5px;\n");
      out.write("                border: 1px solid #999;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"map-canvas\"></div>\n");
      out.write("\n");
      out.write("        <script async defer\n");
      out.write("                src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyCIAiFOVdsKt6f2RK-lyvrQNy4D3QdAQd8&callback=initMap\">\n");
      out.write("        </script>   \n");
      out.write("        <script>\n");
      out.write("            var shortestDistance = function () {\n");
      out.write("\n");
      out.write("                var directionsDisplay;\n");
      out.write("                var directionsService = new google.maps.DirectionsService();\n");
      out.write("                var map;\n");
      out.write("                var size = 0;\n");
      out.write("                var currentPosition;\n");
      out.write("\n");
      out.write("                // An array of interesting places we want to potentially visit.\n");
      out.write("                var interestingPlaces = [\n");
      out.write("                    {'title': 'Regents Park', 'latLng': new google.maps.LatLng(51.530686, -0.154753)},\n");
      out.write("                ];\n");
      out.write("\n");
      out.write("                // An array to store results from Google routing API.\n");
      out.write("                var routeResults = [];\n");
      out.write("\n");
      out.write("\n");
      out.write("                // Call this upon page load to set everything in motion!\n");
      out.write("                function initialize(currentLat, currentLng) {\n");
      out.write("                    currentPosition = new google.maps.LatLng(currentLat, currentLng);\n");
      out.write("                    directionsDisplay = new google.maps.DirectionsRenderer();\n");
      out.write("                    var mapOptions = {\n");
      out.write("                        zoom: 13,\n");
      out.write("                        center: currentPosition\n");
      out.write("                    };\n");
      out.write("                    map = new google.maps.Map(document.getElementById('map-canvas'), mapOptions);\n");
      out.write("                    directionsDisplay.setMap(map);\n");
      out.write("\n");
      out.write("                    var marker = new google.maps.Marker({\n");
      out.write("                        position: currentPosition,\n");
      out.write("                        map: map,\n");
      out.write("                        title: 'Currrently location.'\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                    var i = interestingPlaces.length;\n");
      out.write("                    while (i--) {\n");
      out.write("                        interestingPlaces[i].marker = new google.maps.Marker({\n");
      out.write("                            position: interestingPlaces[i].latLng,\n");
      out.write("                            map: map,\n");
      out.write("                            title: interestingPlaces[i].title,\n");
      out.write("                            icon: 'https://maps.google.com/mapfiles/ms/icons/green.png'\n");
      out.write("                        });\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    findNearestPlace();\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("                // Loops through all inteesting places to calculate route between our current position\n");
      out.write("                // and that place.\n");
      out.write("                function findNearestPlace() {\n");
      out.write("                    var i = interestingPlaces.length;\n");
      out.write("                    size = interestingPlaces.length;\n");
      out.write("                    routeResults = [];\n");
      out.write("                    while (i--) {\n");
      out.write("                        calcRoute(interestingPlaces[i].latLng, storeResult);\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("                // A function to calculate the route between our current position and some desired end point.\n");
      out.write("                function calcRoute(end, callback) {\n");
      out.write("                    var request = {\n");
      out.write("                        origin: currentPosition,\n");
      out.write("                        destination: end,\n");
      out.write("                        travelMode: google.maps.TravelMode.DRIVING\n");
      out.write("                    };\n");
      out.write("                    directionsService.route(request, function (response, status) {\n");
      out.write("                        if (status == google.maps.DirectionsStatus.OK) {\n");
      out.write("                            callback(response);\n");
      out.write("                        } else {\n");
      out.write("                            size--;\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("                // Stores a routing result from the API in our global array for routes.\n");
      out.write("                function storeResult(data) {\n");
      out.write("                    routeResults.push(data);\n");
      out.write("                    if (routeResults.length === size) {\n");
      out.write("                        findShortest();\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("                // Goes through all routes stored and finds which one is the shortest. It then\n");
      out.write("                // sets the shortest route on the map for the user to see.\n");
      out.write("                function findShortest() {\n");
      out.write("                    var i = routeResults.length;\n");
      out.write("                    var shortestIndex = 0;\n");
      out.write("                    var shortestLength = routeResults[0].routes[0].legs[0].distance.value;\n");
      out.write("\n");
      out.write("                    while (i--) {\n");
      out.write("                        if (routeResults[i].routes[0].legs[0].distance.value < shortestLength) {\n");
      out.write("                            shortestIndex = i;\n");
      out.write("                            shortestLength = routeResults[i].routes[0].legs[0].distance.value;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                    directionsDisplay.setDirections(routeResults[shortestIndex]);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // Expose the initialize function publicly as \"init\".\n");
      out.write("                return {\n");
      out.write("                    init: initialize\n");
      out.write("                };\n");
      out.write("            }();\n");
      out.write("\n");
      out.write("// Upon page load, lets start the process!\n");
      out.write("            google.maps.event.addDomListener(window, 'load', shortestDistance.init(51.589554, -0.12969));\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
