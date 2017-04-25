package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class support_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>VIA&AS</title>\r\n");
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
      out.write("        <style>\r\n");
      out.write("          \r\n");
      out.write("        </style>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
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
      out.write("                        <h1>Register User</h1>\r\n");
      out.write("                        <div class=\"divider\"></div>\r\n");
      out.write("                        <p>For more info and support, contact us!</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-12\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-md-8 col-sm-8 scrollpoint sp-effect1\">\r\n");
      out.write("                                    <form  style=\"margin-left: 15%; width: 90%;\"class=\"form-horizontal\" action=\"UserController\" method=\"post\" role=\"form\">\r\n");
      out.write("                                        <div class=\"form-group \">\r\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"user_id\">User ID:</label>\r\n");
      out.write("                                            <div class=\"col-sm-10\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"user_id\" placeholder=\"Enter User ID\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"nic\">NIC Number:</label>\r\n");
      out.write("                                            <div class=\"col-sm-10\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"address\" placeholder=\"Enter NIC Munber\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"fname\">Gender:</label>\r\n");
      out.write("                                            <div class=\"col-sm-10\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"fname\" placeholder=\"Enter  Gender\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"fname\">First Name:</label>\r\n");
      out.write("                                            <div class=\"col-sm-10\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"fname\" placeholder=\"Enter First Name\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"lname\">Last Name:</label>\r\n");
      out.write("                                            <div class=\"col-sm-10\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"lname\" placeholder=\"Enter Last Name\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"lname\">TP Home:</label>\r\n");
      out.write("                                            <div class=\"col-sm-10\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"lname\" placeholder=\"Enter Home Telephone No\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"lname\">TP Mobile:</label>\r\n");
      out.write("                                            <div class=\"col-sm-10\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"lname\" placeholder=\"Enter Mobile No\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"address\">Address:</label>\r\n");
      out.write("                                            <div class=\"col-sm-10\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"address\" placeholder=\"Enter Address\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"email\">Email:</label>\r\n");
      out.write("                                            <div class=\"col-sm-10\">\r\n");
      out.write("                                                <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Enter email\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"address\">License No:</label>\r\n");
      out.write("                                            <div class=\"col-sm-10\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"address\" placeholder=\"Enter License No\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"blood_group\">Blood Group:</label>\r\n");
      out.write("                                            <div class=\"col-sm-10\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"blood_group\" placeholder=\"Enter Blood Group\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"pwd\">Birth Date</label>\r\n");
      out.write("                                            <div class=\"col-sm-10\"> \r\n");
      out.write("                                                <input type=\"date\" class=\"form-control\" id=\"pwd\" placeholder=\"Enter BirthDay\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"dl_no\">Other:</label>\r\n");
      out.write("                                            <div class=\"col-sm-10\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"dl_no\" placeholder=\"Other\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        \r\n");
      out.write("                                         <div class=\"form-group\"> \r\n");
      out.write("                                            <div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-default\">Add User</button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
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
