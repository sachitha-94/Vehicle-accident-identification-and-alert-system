package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class location_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
<<<<<<< HEAD
      out.write("  <head>\r\n");
      out.write("    <meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\">\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>Simple markers</title>\r\n");
      out.write("    <style>\r\n");
      out.write("      /* Always set the map height explicitly to define the size of the div\r\n");
      out.write("       * element that contains the map. */\r\n");
      out.write("      #map {\r\n");
      out.write("        height: 100%;\r\n");
      out.write("      }\r\n");
      out.write("      /* Optional: Makes the sample page fill the window. */\r\n");
      out.write("      html, body {\r\n");
      out.write("        height: 100%;\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        padding: 0;\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <div id=\"map\"></div>\r\n");
      out.write("    <script>\r\n");
=======
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <style>\r\n");
      out.write("            #map_canvas {\r\n");
      out.write("                width: 675px;\r\n");
      out.write("                height: 375px;\r\n");
      out.write("            }\r\n");
      out.write("            #current {\r\n");
      out.write("                padding-top: 25px;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
>>>>>>> origin/master
      out.write("\r\n");
      out.write("      function initMap() {\r\n");
      out.write("        var myLatLng = {lat: -25.363, lng: 131.044};\r\n");
      out.write("     \r\n");
      out.write("\r\n");
<<<<<<< HEAD
      out.write("        var map = new google.maps.Map(document.getElementById('map'), {\r\n");
      out.write("          zoom: 4,\r\n");
      out.write("          center: myLatLng\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        var marker = new google.maps.Marker({\r\n");
      out.write("          position: myLatLng1,\r\n");
      out.write("          map: map,\r\n");
      out.write("          title: 'Hello World!'\r\n");
      out.write("        });\r\n");
      out.write("      }\r\n");
      out.write("    </script>\r\n");
      out.write("    <script async defer\r\n");
      out.write("    src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBQNxuARLxgAq6oGgjEiHcMGCwRG7Eye2A&callback=initMap\">\r\n");
      out.write("    </script>\r\n");
      out.write("  </body>\r\n");
=======
      out.write("            function initMap() {\r\n");
      out.write("                var map = new google.maps.Map(document.getElementById('map_canvas'), {\r\n");
      out.write("                    zoom: 10,\r\n");
      out.write("                    center: new google.maps.LatLng(6.0535, 80.2210),\r\n");
      out.write("                    mapTypeId: google.maps.MapTypeId.ROADMAP\r\n");
      out.write("                });\r\n");
      out.write("                var myMarker = new google.maps.Marker({\r\n");
      out.write("                    position: new google.maps.LatLng(6.0535, 80.2210),\r\n");
      out.write("                    map: map,\r\n");
      out.write("                    draggable: true\r\n");
      out.write("                });\r\n");
      out.write("                google.maps.event.addListener(myMarker, 'dragend', function (evt) {\r\n");
      out.write("                    document.getElementById('current').innerHTML = '<p>Current Lat: ' + evt.latLng.lat().toFixed(3) + ' Current Lng: ' + evt.latLng.lng().toFixed(3) + '</p>';\r\n");
      out.write("                    document.getElementById(\"lat\").value =  evt.latLng.lat().toFixed(3);\r\n");
      out.write("                    document.getElementById(\"lon\").value =  evt.latLng.lng().toFixed(3);\r\n");
      out.write("                });\r\n");
      out.write("                google.maps.event.addListener(myMarker, 'dragstart', function (evt) {\r\n");
      out.write("                    document.getElementById('current').innerHTML = '<p>Dragging marker...</p>';\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("        <script async defer\r\n");
      out.write("                src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyDFEVWcqOnh3kAsD96wEaLKqL2EeQq6AOo&callback=initMap\">\r\n");
      out.write("        </script>\r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body >\r\n");
      out.write("        <div id=\"mapcontainer\" style=\"position: absolute; z-index: 20; display: none; border-style: solid; margin-left: 32%; margin-top: 10%; border-radius: 8px;\">\r\n");
      out.write("            <section >\r\n");
      out.write("                <div id='map_canvas'></div>\r\n");
      out.write("                <div style=\"background: wheat;\"  id=\"current\">\r\n");
      out.write("                    Drag pointer\r\n");
      out.write("                </div>\r\n");
      out.write("                <div style=\"float:right;background: wheat; \">\r\n");
      out.write("                    <button id=\"ok\" class=\"btn-info\">OK</button>\r\n");
      out.write("                    <button id=\"cancel\" class=\"btn-info\">CANCEL</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("       \r\n");
      out.write("    </body>\r\n");
>>>>>>> origin/master
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
