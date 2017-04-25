package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_0020_002d_0020dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Admin Panel</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"favicon.png\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- Bootstrap 3.3.2 -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\r\n");
      out.write("    \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/animate.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/slick.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/js/rs-plugin/css/settings.css\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\" src=\"assets/js/modernizr.custom.32033.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("\t\r\n");
      out.write("\t<section id=\"about\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"section-heading scrollpoint sp-effect3\">\r\n");
      out.write("                    <h1>A D M I N </h1> <h1> P A N E L</h1>\r\n");
      out.write("                    <div class=\"divider\"></div>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-3 col-sm-3 col-xs-6\">\r\n");
      out.write("                        <div class=\"about-item scrollpoint sp-effect2\">\r\n");
      out.write("                            <a href=\"Admin - users - 1.jsp\">\r\n");
      out.write("                            <i class=\"fa fa-users fa-2x \"></i></a>\r\n");
      out.write("                            <h3>Users</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-3 col-sm-3 col-xs-6\" >\r\n");
      out.write("                        <div class=\"about-item scrollpoint sp-effect5\">\r\n");
      out.write("                            <i class=\"fa fa-hospital-o fa-2x\"></i>\r\n");
      out.write("                            <h3>Hospital</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-3 col-sm-3 col-xs-6\" >\r\n");
      out.write("                        <div class=\"about-item scrollpoint sp-effect5\">\r\n");
      out.write("                            <i class=\"fa fa-car fa-2x\"></i>\r\n");
      out.write("                            <h3>Police Stations</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-3 col-sm-3 col-xs-6\" >\r\n");
      out.write("                        <div class=\"about-item scrollpoint sp-effect1\">\r\n");
      out.write("                            <i class=\"fa fa-sliders fa-2x\"></i>\r\n");
      out.write("                            <h3>Reports and Analize</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("</div> \r\n");
      out.write("\r\n");
      out.write("<script src=\"assets/js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/slick.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/placeholdem.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/rs-plugin/js/jquery.themepunch.plugins.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/rs-plugin/js/jquery.themepunch.revolution.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/waypoints.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/scripts.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        $(document).ready(function() {\r\n");
      out.write("            appMaster.preLoader();\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
