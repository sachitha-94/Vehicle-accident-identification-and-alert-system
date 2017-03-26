package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profileview_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-5  toppad  pull-right col-md-offset-3 \">\n");
      out.write("                    <A href=\"edit.html\" >Edit Profile</A>\n");
      out.write("\n");
      out.write("                    <A href=\"edit.html\" >Logout</A>\n");
      out.write("                    <br>\n");
      out.write("                    <p class=\" text-info\">May 05,2014,03:00 pm </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"panel panel-info\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <h3 class=\"panel-title\">Sheena Shrestha</h3>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-3 col-lg-3 \" align=\"center\"> <img alt=\"User Pic\" src=\"http://babyinfoforyou.com/wp-content/uploads/2014/10/avatar-300x300.png\" class=\"img-circle img-responsive\"> </div>\n");
      out.write("\n");
      out.write("                                <!--<div class=\"col-xs-10 col-sm-10 hidden-md hidden-lg\"> <br>\n");
      out.write("                                  <dl>\n");
      out.write("                                    <dt>DEPARTMENT:</dt>\n");
      out.write("                                    <dd>Administrator</dd>\n");
      out.write("                                    <dt>HIRE DATE</dt>\n");
      out.write("                                    <dd>11/12/2013</dd>\n");
      out.write("                                    <dt>DATE OF BIRTH</dt>\n");
      out.write("                                       <dd>11/12/2013</dd>\n");
      out.write("                                    <dt>GENDER</dt>\n");
      out.write("                                    <dd>Male</dd>\n");
      out.write("                                  </dl>\n");
      out.write("                                </div>-->\n");
      out.write("                                <div class=\" col-md-9 col-lg-9 \"> \n");
      out.write("                                    <table class=\"table table-user-information\">\n");
      out.write("                                        <tbody>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Department:</td>\n");
      out.write("                                                <td>Programming</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Hire date:</td>\n");
      out.write("                                                <td>06/23/2013</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Date of Birth</td>\n");
      out.write("                                                <td>01/24/1988</td>\n");
      out.write("                                            </tr>\n");
      out.write("\n");
      out.write("                                            <tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Gender</td>\n");
      out.write("                                                <td>Female</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Home Address</td>\n");
      out.write("                                                <td>Kathmandu,Nepal</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Email</td>\n");
      out.write("                                                <td><a href=\"mailto:info@support.com\">info@support.com</a></td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        <td>Phone Number</td>\n");
      out.write("                                        <td>123-4567-890(Landline)<br><br>555-4567-890(Mobile)\n");
      out.write("                                        </td>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-primary\">My Sales Performance</a>\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-primary\">Team Sales Performance</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-footer\">\n");
      out.write("                            <a data-original-title=\"Broadcast Message\" data-toggle=\"tooltip\" type=\"button\" class=\"btn btn-sm btn-primary\"><i class=\"glyphicon glyphicon-envelope\"></i></a>\n");
      out.write("                            <span class=\"pull-right\">\n");
      out.write("                                <a href=\"edit.html\" data-original-title=\"Edit this user\" data-toggle=\"tooltip\" type=\"button\" class=\"btn btn-sm btn-warning\"><i class=\"glyphicon glyphicon-edit\"></i></a>\n");
      out.write("                                <a data-original-title=\"Remove this user\" data-toggle=\"tooltip\" type=\"button\" class=\"btn btn-sm btn-danger\"><i class=\"glyphicon glyphicon-remove\"></i></a>\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
