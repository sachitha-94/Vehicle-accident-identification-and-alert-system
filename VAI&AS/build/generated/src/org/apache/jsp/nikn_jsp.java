package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class nikn_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        <script>\n");
      out.write("            function getDistanceFromLatLonInKm(lat1, lon1, lat2, lon2) {\n");
      out.write("                var R = 6371; // Radius of the earth in km\n");
      out.write("                var dLat = deg2rad(lat2 - lat1);  // deg2rad below\n");
      out.write("                var dLon = deg2rad(lon2 - lon1);\n");
      out.write("                var a =\n");
      out.write("                        Math.sin(dLat / 2) * Math.sin(dLat / 2) +\n");
      out.write("                        Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) *\n");
      out.write("                        Math.sin(dLon / 2) * Math.sin(dLon / 2)\n");
      out.write("                        ;\n");
      out.write("                var c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));\n");
      out.write("                var d = R * c; // Distance in km\n");
      out.write("                return d;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function deg2rad(deg) {\n");
      out.write("                return deg * (Math.PI / 180)\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            alert(getDistanceFromLatLonInKm(10,12,13,15));\n");
      out.write("        </script>\n");
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
