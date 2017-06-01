package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class viewlocation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\r\n");
      out.write("        <meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\">\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <title>Simple markers</title>\r\n");
      out.write("        <style>\r\n");
      out.write("            /* Always set the map height explicitly to define the size of the div\r\n");
      out.write("             * element that contains the map. */\r\n");
      out.write("            #map {\r\n");
      out.write("                height: 100%;\r\n");
      out.write("            }\r\n");
      out.write("            /* Optional: Makes the sample page fill the window. */\r\n");
      out.write("            html, body {\r\n");
      out.write("                height: 100%;\r\n");
      out.write("                margin: 0;\r\n");
      out.write("                padding: 0;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"map\"></div>\r\n");
      out.write("        <script>\r\n");
      out.write("\r\n");
      out.write("            setInterval(\"loadMap();\", 1000);\r\n");
      out.write("            \r\n");
      out.write("            var map;\r\n");
      out.write("            var marker;\r\n");
      out.write("            \r\n");
      out.write("            var prelat = 0;\r\n");
      out.write("            var prelon = 0;\r\n");
      out.write("            \r\n");
      out.write("            function loadMap() {\r\n");
      out.write("                \r\n");
      out.write("                jQuery.ajax({\r\n");
      out.write("                    type: 'POST',\r\n");
      out.write("                    url: \"LoadMapController\",\r\n");
      out.write("                    dataType: 'json',\r\n");
      out.write("                    success: function (data) {\r\n");
      out.write("                        var lat = data.lat;\r\n");
      out.write("                        var lon = data.lon;\r\n");
      out.write("                        if((prelat!=lat)&&(prelon!=lon)){\r\n");
      out.write("                            marker.setPosition( new google.maps.LatLng( lat, lon ) );\r\n");
      out.write("                            map.panTo( new google.maps.LatLng( lat, lon ) );\r\n");
      out.write("                            prelat = lat;\r\n");
      out.write("                            prelon = lon;\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                });\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            function initMap() {\r\n");
      out.write("                var myLatLng = {lat: 0, lng: 0};\r\n");
      out.write("\r\n");
      out.write("                map = new google.maps.Map(document.getElementById('map'), {\r\n");
      out.write("                    zoom: 6,\r\n");
      out.write("                    center: myLatLng\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                marker = new google.maps.Marker({\r\n");
      out.write("                    position: myLatLng,\r\n");
      out.write("                    map: map,\r\n");
      out.write("                   // title: 'Hello World!'\r\n");
      out.write("                });\r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("        <script async defer\r\n");
      out.write("                src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBQNxuARLxgAq6oGgjEiHcMGCwRG7Eye2A&callback=initMap\">\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
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
