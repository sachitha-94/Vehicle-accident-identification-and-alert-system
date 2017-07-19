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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\">\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Simple markers</title>\n");
      out.write("        <style>\n");
      out.write("            /* Always set the map height explicitly to define the size of the div\n");
      out.write("             * element that contains the map. */\n");
      out.write("            #map {\n");
      out.write("                height: 100%;\n");
      out.write("            }\n");
      out.write("            /* Optional: Makes the sample page fill the window. */\n");
      out.write("            html, body {\n");
      out.write("                height: 100%;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"map\"></div>\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("\n");
      out.write("            setInterval(\"loadMap();\", 1000);\n");
      out.write("\n");
      out.write("            function loadMap() {\n");
      out.write("                \n");
      out.write("                jQuery.ajax({\n");
      out.write("                    type: 'POST',\n");
      out.write("                    url: \"LoadMapController\",\n");
      out.write("                    dataType: 'json',\n");
      out.write("                    success: function (data) {\n");
      out.write("                        var receivedData = [];\n");
      out.write("                        $.each(data.jsonArray, function (index) {\n");
      out.write("                            $.each(data.jsonArray[index], function (key, value) {\n");
      out.write("                                var point = [];\n");
      out.write("\n");
      out.write("                                point.push(key);\n");
      out.write("                                point.push(value);\n");
      out.write("                                receivedData.push(point);\n");
      out.write("\n");
      out.write("                            });\n");
      out.write("                        });\n");
      out.write("                        \n");
      out.write("                        alert(\"success\");\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            function initMap() {\n");
      out.write("                var myLatLng = {lat: -25.363, lng: 131.044};\n");
      out.write("\n");
      out.write("                var map = new google.maps.Map(document.getElementById('map'), {\n");
      out.write("                    zoom: 4,\n");
      out.write("                    center: myLatLng\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                var marker = new google.maps.Marker({\n");
      out.write("                    position: myLatLng,\n");
      out.write("                    map: map,\n");
      out.write("                    title: 'Hello World!'\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <script async defer\n");
      out.write("                src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBQNxuARLxgAq6oGgjEiHcMGCwRG7Eye2A&callback=initMap\">\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
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
