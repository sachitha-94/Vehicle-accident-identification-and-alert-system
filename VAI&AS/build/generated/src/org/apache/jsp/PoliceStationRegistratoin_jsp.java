package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PoliceStationRegistratoin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <title>Register police station</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"favicon.png\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap 3.3.2 -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/animate.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/slick.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/js/rs-plugin/css/settings.css\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/modernizr.custom.32033.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("            <section id=\"support\" class=\"doublediagonal\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"section-heading scrollpoint sp-effect3\">\r\n");
      out.write("                        <h1>Register Police Station</h1>\r\n");
      out.write("                        <div class=\"divider\"></div>\r\n");
      out.write("                        <p></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-12\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-md-8 col-sm-8 scrollpoint sp-effect1\">\r\n");
      out.write("                                    <form action=\"PoliceController\" method=\"post\" role=\"form\">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Police Station ID\" name=\"PID\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Province\" name=\"PROVINCE\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Devision\" name=\"DEVISION\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"City\" name=\"CITY\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Latitude\" name=\"LAT\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Longitude\" name=\"LON\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Telephone No\" name=\"TP\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                             \r\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary btn-lg\">Submit</button>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("\r\n");
      out.write("        </div> \r\n");
      out.write("\r\n");
      out.write("        <script src=\"assets/js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/slick.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/placeholdem.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/rs-plugin/js/jquery.themepunch.plugins.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/rs-plugin/js/jquery.themepunch.revolution.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/waypoints.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/scripts.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("                appMaster.preLoader();\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
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
