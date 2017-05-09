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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <style>\r\n");
      out.write("            #map_canvas {\r\n");
      out.write("                width: 500px;\r\n");
      out.write("                height: 250px;\r\n");
      out.write("            }\r\n");
      out.write("            #current {\r\n");
      out.write("                padding-top: 25px;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("            map.setCenter(myMarker.position);\r\n");
      out.write("            myMarker.setMap(map);\r\n");
      out.write("\r\n");
      out.write("\t      function initMap() {\r\n");
      out.write("\t        var map = new google.maps.Map(document.getElementById('map_canvas'), {\r\n");
      out.write("\t          zoom: 10,\r\n");
      out.write("\t          center: new google.maps.LatLng(6.0535, 80.2210),\r\n");
      out.write("              mapTypeId: google.maps.MapTypeId.ROADMAP\r\n");
      out.write("\t        });\r\n");
      out.write("\t        var myMarker = new google.maps.Marker({\r\n");
      out.write("                position: new google.maps.LatLng(6.0535, 80.2210),\r\n");
      out.write("                map: map,\r\n");
      out.write("                draggable: true\r\n");
      out.write("            });\r\n");
      out.write("            google.maps.event.addListener(myMarker, 'dragend', function (evt) {\r\n");
      out.write("            \tdocument.getElementById('current').innerHTML = '<p>Marker dropped: Current Lat: ' + evt.latLng.lat().toFixed(3) + ' Current Lng: ' + evt.latLng.lng().toFixed(3) + '</p>';\r\n");
      out.write("            });\r\n");
      out.write("            google.maps.event.addListener(myMarker, 'dragstart', function (evt) {\r\n");
      out.write("                document.getElementById('current').innerHTML = '<p>Currently dragging marker...</p>';\r\n");
      out.write("            });\r\n");
      out.write("\t      }\r\n");
      out.write("    </script>\r\n");
      out.write("    <script async defer\r\n");
      out.write("    src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBvCmJgjYVoD6SBxPeS6xs7HixXwKb1w1Q&callback=initMap\">\r\n");
      out.write("    </script>\r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body >\r\n");
      out.write("        <div id=\"mapcontainer\" style=\" position: absolute; z-index: 20; display: none; \">\r\n");
      out.write("            <section >\r\n");
      out.write("            <div id='map_canvas'></div>\r\n");
      out.write("            <div id=\"current\">Nothing yet...</div>\r\n");
      out.write("        </section>\r\n");
      out.write("        </div>\r\n");
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
