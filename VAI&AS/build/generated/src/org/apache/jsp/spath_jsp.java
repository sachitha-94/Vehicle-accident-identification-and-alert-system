package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class spath_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\">\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Travel modes in directions</title>\n");
      out.write("    <style>\n");
      out.write("      /* Always set the map height explicitly to define the size of the div\n");
      out.write("       * element that contains the map. */\n");
      out.write("      #map {\n");
      out.write("        height: 100%;\n");
      out.write("      }\n");
      out.write("      /* Optional: Makes the sample page fill the window. */\n");
      out.write("      html, body {\n");
      out.write("        height: 100%;\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 0;\n");
      out.write("      }\n");
      out.write("      #floating-panel {\n");
      out.write("        position: absolute;\n");
      out.write("        top: 10px;\n");
      out.write("        left: 25%;\n");
      out.write("        z-index: 5;\n");
      out.write("        background-color: #fff;\n");
      out.write("        padding: 5px;\n");
      out.write("        border: 1px solid #999;\n");
      out.write("        text-align: center;\n");
      out.write("        font-family: 'Roboto','sans-serif';\n");
      out.write("        line-height: 30px;\n");
      out.write("        padding-left: 10px;\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div id=\"floating-panel\">\n");
      out.write("    <b>Mode of Travel: </b>\n");
      out.write("    <select id=\"mode\">\n");
      out.write("      <option value=\"DRIVING\">Driving</option>\n");
      out.write("      <option value=\"WALKING\">Walking</option>\n");
      out.write("      <option value=\"BICYCLING\">Bicycling</option>\n");
      out.write("      <option value=\"TRANSIT\">Transit</option>\n");
      out.write("    </select>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"map\"></div>\n");
      out.write("    <script>\n");
      out.write("      function initMap() {\n");
      out.write("        var directionsDisplay = new google.maps.DirectionsRenderer;\n");
      out.write("        var directionsService = new google.maps.DirectionsService;\n");
      out.write("        var map = new google.maps.Map(document.getElementById('map'), {\n");
      out.write("          zoom: 14,\n");
      out.write("          center: {lat: 37.77, lng: -122.447}\n");
      out.write("        });\n");
      out.write("        directionsDisplay.setMap(map);\n");
      out.write("        var   origin={lat: 37.77, lng: -122.447};\n");
      out.write("    var   destination= {lat: 37.768, lng: -122.511};\n");
      out.write("\n");
      out.write("        calculateAndDisplayRoute(directionsService, directionsDisplay);\n");
      out.write("        document.getElementById('mode').addEventListener('change', function() {\n");
      out.write("          calculateAndDisplayRoute(directionsService, directionsDisplay,origin,destination);\n");
      out.write("        });\n");
      out.write("      }\n");
      out.write("\n");
      out.write("    \n");
      out.write("      \n");
      out.write("      function calculateAndDisplayRoute(directionsService, directionsDisplay,origin,destination) {\n");
      out.write("        var selectedMode = document.getElementById('mode').value;\n");
      out.write("        directionsService.route({\n");
      out.write("          origin: origin,// Haight.\n");
      out.write("          destination: destination,  // Ocean Beach.\n");
      out.write("          // Note that Javascript allows us to access the constant\n");
      out.write("          // using square brackets and a string value as its\n");
      out.write("          // \"property.\"\n");
      out.write("          travelMode: google.maps.TravelMode[selectedMode]\n");
      out.write("        }, function(response, status) {\n");
      out.write("          if (status == 'OK') {\n");
      out.write("            directionsDisplay.setDirections(response);\n");
      out.write("          } else {\n");
      out.write("            window.alert('Directions request failed due to ' + status);\n");
      out.write("          }\n");
      out.write("        });\n");
      out.write("      }\n");
      out.write("    </script>\n");
      out.write("    <script async defer\n");
      out.write("    src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyCIAiFOVdsKt6f2RK-lyvrQNy4D3QdAQd8&callback=initMap\">\n");
      out.write("    </script>\n");
      out.write("  </body>\n");
      out.write("</html>");
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
