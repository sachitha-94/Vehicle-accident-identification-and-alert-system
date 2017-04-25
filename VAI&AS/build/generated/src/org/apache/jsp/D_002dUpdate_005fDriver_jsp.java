package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class D_002dUpdate_005fDriver_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <title>Update_Driver</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"favicon.png\">\r\n");
      out.write("        \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/animate.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/slick.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/js/rs-plugin/css/settings.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/modernizr.custom.32033.js\"></script>\r\n");
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
      out.write("        \r\n");
      out.write("        <style>\r\n");
      out.write("            button {\r\n");
      out.write("                float: left;\r\n");
      out.write("                border: 1px solid green;\r\n");
      out.write("                width: 150px;\r\n");
      out.write("                border: 2px solid #00A8FF;\r\n");
      out.write("                border-radius: 12px;\r\n");
      out.write("                padding: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("            button:hover {\r\n");
      out.write("                background-color: #00A8FF; \r\n");
      out.write("                color: white;\r\n");
      out.write("                box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);\r\n");
      out.write("}\r\n");
      out.write("            input{\r\n");
      out.write("                width: 130px;\r\n");
      out.write("                -webkit-transition: width 0.4s ease-in-out;\r\n");
      out.write("                transition: width 0.4s ease-in-out;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* When the input field gets focus, change its width to 100% */\r\n");
      out.write("            input[type=text]:focus {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("}\r\n");
      out.write("        </style>\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        <button type=\"button\">Add Driver</button>\r\n");
      out.write("        <button type=\"button\">Update</button>\r\n");
      out.write("        <button type=\"button\">Remove</button>\r\n");
      out.write("        \r\n");
      out.write("        <br><br><hr>\r\n");
      out.write("        \r\n");
      out.write("        <form class=\"form-horizontal\">\r\n");
      out.write("            \r\n");
      out.write("            <input type=\"text\" name=\"search\" placeholder=\"Search\"><br><hr>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label class=\"control-label col-sm-2\" for=\"user_id\">User ID:</label>\r\n");
      out.write("                    <div class=\"col-sm-10\">\r\n");
      out.write("                        <input type=\"varchar\" class=\"form-control\" id=\"user_id\" placeholder=\"Enter User ID\">\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label class=\"control-label col-sm-2\" for=\"driver_id\">Driver ID:</label>\r\n");
      out.write("                    <div class=\"col-sm-10\">\r\n");
      out.write("                        <input type=\"varchar\" class=\"form-control\" id=\"driver_id\" placeholder=\"Enter Driver ID\">\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        \r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label class=\"control-label col-sm-2\" for=\"dl_no\">Driving License Number:</label>\r\n");
      out.write("                    <div class=\"col-sm-10\">\r\n");
      out.write("                        <input type=\"varchar\" class=\"form-control\" id=\"dl_no\" placeholder=\"Enter Driving License Number\">\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label class=\"control-label col-sm-2\" for=\"blood_group\">Blood Group:</label>\r\n");
      out.write("                    <div class=\"col-sm-10\">\r\n");
      out.write("                        <input type=\"varchar\" class=\"form-control\" id=\"blood_group\" placeholder=\"Enter Blood Group\">\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label class=\"control-label col-sm-2\" for=\"family_id\">Family ID:</label>\r\n");
      out.write("                    <div class=\"col-sm-10\">\r\n");
      out.write("                        <input type=\"varchar\" class=\"form-control\" id=\"family_id\" placeholder=\"Enter Family ID\">\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"form-group\"> \r\n");
      out.write("                <div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-default\">Save Changes</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("        </form>\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
