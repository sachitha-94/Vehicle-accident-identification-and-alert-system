package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_0020_002d_0020users_0020_002d_0020register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("      <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>Free Bootstrap Admin Template : Binary Admin</title>\n");
      out.write("    \n");
      out.write("     <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("     <!-- FONTAWESOME STYLES-->\n");
      out.write("    <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("     <!-- MORRIS CHART STYLES-->\n");
      out.write("    <link href=\"assets/js/morris/morris-0.4.3.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- CUSTOM STYLES-->\n");
      out.write("    <link href=\"assets/css/custom.css\" rel=\"stylesheet\" />\n");
      out.write("   \n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/style2.css\">\n");
      out.write("   \n");
      out.write("        <!-- CUSTOM STYLES-->\n");
      out.write("  \n");
      out.write("     <!-- GOOGLE FONTS-->\n");
      out.write("   <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />\n");
      out.write("   \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("        <nav class=\"navbar navbar-default navbar-cls-top \" role=\"navigation\" style=\"margin-bottom: 0\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".sidebar-collapse\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.html\">Binary admin</a> \n");
      out.write("            </div>\n");
      out.write("  <div style=\"color: white;\n");
      out.write("padding: 15px 50px 5px 50px;\n");
      out.write("float: right;\n");
      out.write("font-size: 16px;\"> Last access : 30 May 2014 &nbsp; <a href=\"login.html\" class=\"btn btn-danger square-btn-adjust\">Logout</a> </div>\n");
      out.write("        </nav>   \n");
      out.write("           <!-- /. NAV TOP  -->\n");
      out.write("                <nav class=\"navbar-default navbar-side\" role=\"navigation\">\n");
      out.write("            <div class=\"sidebar-collapse\">\n");
      out.write("                <ul class=\"nav\" id=\"main-menu\">\n");
      out.write("\t\t\t\t<li class=\"text-center\">\n");
      out.write("                    <img src=\"assets/img/administrator.png\" class=\"user-image img-responsive\"/>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("                    <li>\n");
      out.write("                        <a   href=\"Admin - users - 1.jsp\"><i class=\"fa fa-dashboard fa-3x\"></i> Dashboard</a>\n");
      out.write("                    </li>\n");
      out.write("                     <li>\n");
      out.write("                         <a  href=\"Admin - users - search.jsp\"><i class=\"fa fa-desktop fa-3x\"></i> Search</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"active-menu\" href=\"Admin - users - register.jsp\"><i class=\"fa fa-qrcode fa-3x\"></i> Registration</a>\n");
      out.write("                    </li>\n");
      out.write("\t\t    <li  >\n");
      out.write("                        <a   href=\"Admin - users - update.jsp\"><i class=\"fa fa-bar-chart-o fa-3x\"></i> Update</a>\n");
      out.write("                    </li>\t\n");
      out.write("                      \t\n");
      out.write("                </ul>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </nav>  \n");
      out.write("        <!-- /. NAV SIDE  -->\n");
      out.write("        <div id=\"page-wrapper\" >\n");
      out.write("            <div id=\"page-inner\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div class=\"container\">\n");
      out.write("        \n");
      out.write("         <div class=\"row\">\n");
      out.write("               \n");
      out.write("                \n");
      out.write("                        \n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                        <strong>  Register user </strong>  \n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                                <div class=\"col-md-8 col-sm-8 scrollpoint sp-effect1\">\n");
      out.write("                                    <form  style=\"margin-left: 15%; width: 90%;\"class=\"form-horizontal\" action=\"UserController\" method=\"post\" role=\"form\">\n");
      out.write("                                        <div class=\"form-group \">\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"user_id\">User ID:</label>\n");
      out.write("                                            <div class=\"col-sm-10\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"user_id\" placeholder=\"Enter User ID\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"nic\">NIC Number:</label>\n");
      out.write("                                            <div class=\"col-sm-10\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"address\" placeholder=\"Enter NIC Munber\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"fname\">Gender:</label>\n");
      out.write("                                            <div class=\"col-sm-10\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"fname\" placeholder=\"Enter  Gender\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"fname\">First Name:</label>\n");
      out.write("                                            <div class=\"col-sm-10\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"fname\" placeholder=\"Enter First Name\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"lname\">Last Name:</label>\n");
      out.write("                                            <div class=\"col-sm-10\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"lname\" placeholder=\"Enter Last Name\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"lname\">TP Home:</label>\n");
      out.write("                                            <div class=\"col-sm-10\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"lname\" placeholder=\"Enter Home Telephone No\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"lname\">TP Mobile:</label>\n");
      out.write("                                            <div class=\"col-sm-10\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"lname\" placeholder=\"Enter Mobile No\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"address\">Address:</label>\n");
      out.write("                                            <div class=\"col-sm-10\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"address\" placeholder=\"Enter Address\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"email\">Email:</label>\n");
      out.write("                                            <div class=\"col-sm-10\">\n");
      out.write("                                                <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Enter email\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"address\">License No:</label>\n");
      out.write("                                            <div class=\"col-sm-10\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"address\" placeholder=\"Enter License No\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"blood_group\">Blood Group:</label>\n");
      out.write("                                            <div class=\"col-sm-10\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"blood_group\" placeholder=\"Enter Blood Group\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"pwd\">Birth Date</label>\n");
      out.write("                                            <div class=\"col-sm-10\"> \n");
      out.write("                                                <input type=\"date\" class=\"form-control\" id=\"pwd\" placeholder=\"Enter BirthDay\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"control-label col-sm-2\" for=\"dl_no\">Other:</label>\n");
      out.write("                                            <div class=\"col-sm-10\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"dl_no\" placeholder=\"Other\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                         <div class=\"form-group\"> \n");
      out.write("                                            <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-default\">Add User</button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            \n");
      out.write("                           \n");
      out.write("                       \n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                 \n");
      out.write("                           \n");
      out.write("    </div>\n");
      out.write("             <!-- /. PAGE INNER  -->\n");
      out.write("            </div>\n");
      out.write("         <!-- /. PAGE WRAPPER  -->\n");
      out.write("        </div>\n");
      out.write("     <!-- /. WRAPPER  -->\n");
      out.write("    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->\n");
      out.write("    <!-- JQUERY SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/jquery-1.10.2.js\"></script>\n");
      out.write("      <!-- BOOTSTRAP SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- METISMENU SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/jquery.metisMenu.js\"></script>\n");
      out.write("     <!-- MORRIS CHART SCRIPTS -->\n");
      out.write("     <script src=\"assets/js/morris/raphael-2.1.0.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/morris/morris.js\"></script>\n");
      out.write("      <!-- CUSTOM SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/custom.js\"></script>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    \n");
      out.write("   \n");
      out.write("</body>\n");
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