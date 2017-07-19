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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-5  toppad  pull-right col-md-offset-3 \">\r\n");
      out.write("                    \r\n");
      out.write("                    <p class=\" text-info\">May 05,2016,03:00 pm </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad\" >\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"panel panel-info\">\r\n");
      out.write("                        <div class=\"panel-heading\">\r\n");
      out.write("                            <h3 class=\"panel-title\">Sheena Shrestha</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"panel-body\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-md-3 col-lg-3 \" align=\"center\"> <img alt=\"User Pic\" src=\"http://babyinfoforyou.com/wp-content/uploads/2014/10/avatar-300x300.png\" class=\"img-circle img-responsive\"> </div>\r\n");
      out.write("\r\n");
      out.write("                                \r\n");
      out.write("                                <div class=\" col-md-9 col-lg-9 \"> \r\n");
      out.write("                                    <table class=\"table table-user-information\">\r\n");
      out.write("                                        <tbody>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <td>Blood Group:</td>\r\n");
      out.write("                                                <td>O+</td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <td>License No:</td>\r\n");
      out.write("                                                <td>B12321212</td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <td>Date of Birth</td>\r\n");
      out.write("                                                <td>01/24/1988</td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <td>Gender</td>\r\n");
      out.write("                                                <td>Female</td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <td>Home Address</td>\r\n");
      out.write("                                                <td>Colombo,Srilanka</td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <td>Email</td>\r\n");
      out.write("                                                <td><a href=\"mailto:info@support.com\">info@support.com</a></td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                        <td>Phone Number</td>\r\n");
      out.write("                                        <td>091-5432211(Landline)<br><br>0715235566(Mobile)\r\n");
      out.write("                                        </td>\r\n");
      out.write("\r\n");
      out.write("                                        </tr>\r\n");
      out.write("\r\n");
      out.write("                                        </tbody>\r\n");
      out.write("                                    </table>\r\n");
      out.write("\r\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-primary\">Police Station</a>\r\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-primary\">Hospital</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"panel-footer\">\r\n");
      out.write("                            <a data-original-title=\"Broadcast Message\" data-toggle=\"tooltip\" type=\"button\" class=\"btn btn-sm btn-primary\"><i class=\"glyphicon glyphicon-envelope\"></i></a>\r\n");
      out.write("                            <span class=\"pull-right\">\r\n");
      out.write("                                <a href=\"edit.html\" data-original-title=\"Edit this user\" data-toggle=\"tooltip\" type=\"button\" class=\"btn btn-sm btn-warning\"><i class=\"glyphicon glyphicon-edit\"></i></a>\r\n");
      out.write("                                <a data-original-title=\"Remove this user\" id=close data-toggle=\"tooltip\" type=\"button\" class=\"btn btn-sm btn-danger\"><i class=\"glyphicon glyphicon-remove\"></i></a>\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
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
