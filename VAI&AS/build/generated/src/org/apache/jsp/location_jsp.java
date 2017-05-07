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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            #map_canvas {\n");
      out.write("                width: 980px;\n");
      out.write("                height: 500px;\n");
      out.write("            }\n");
      out.write("            #current {\n");
      out.write("                padding-top: 25px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            var map;\n");
      out.write("            function initialize() {\n");
      out.write("                var myLatlng = new google.maps.LatLng(40.713956, -74.006653);\n");
      out.write("\n");
      out.write("                var myOptions = {\n");
      out.write("                    zoom: 8,\n");
      out.write("                    center: myLatlng,\n");
      out.write("                    mapTypeId: google.maps.MapTypeId.ROADMAP\n");
      out.write("                }\n");
      out.write("                map = new google.maps.Map(document.getElementById(\"map_canvas\"), myOptions);\n");
      out.write("\n");
      out.write("                var marker = new google.maps.Marker({\n");
      out.write("                    draggable: true,\n");
      out.write("                    position: myLatlng,\n");
      out.write("                    map: map,\n");
      out.write("                    title: \"Your location\"\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                google.maps.event.addListener(marker, 'click', function (overlay, point) {\n");
      out.write("                    document.getElementById(\"latbox\").value = lat();\n");
      out.write("                    document.getElementById(\"lngbox\").value = lng();\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"initialize()\">\n");
      out.write("        <div id=\"map_canvas\" style=\"width:50%; height:50%\"></div>\n");
      out.write("\n");
      out.write("        <div id=\"latlong\">\n");
      out.write("            <p>Latitude: <input size=\"20\" type=\"text\" id=\"latbox\" name=\"lat\" ></p>\n");
      out.write("            <p>Longitude: <input size=\"20\" type=\"text\" id=\"lngbox\" name=\"lng\" ></p>\n");
      out.write("        </div>\n");
      out.write("\n");
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
