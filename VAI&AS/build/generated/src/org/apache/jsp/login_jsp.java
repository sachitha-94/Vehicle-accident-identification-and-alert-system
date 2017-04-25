package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("    <title>Oleose App Landing Page | Bootstrap Theme</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("    <link rel=\"shortcut icon\" href=\"favicon.png\">\n");
      out.write("            \n");
      out.write("    <!-- Bootstrap 3.3.2 -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/animate.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/login.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/slick.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/js/rs-plugin/css/settings.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\" src=\"assets/js/modernizr.custom.32033.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrapper\" id=\"wrapper\" style=\"position: absolute; z-index: 10; margin-top: 20%; display: none;\">\n");
      out.write("\t\n");
      out.write("\t<section id=\"support\" class=\"doublediagonal\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("\t<section id=\"content\">\n");
      out.write("\t\t<form action=\"AdminIndex.jsp\">\n");
      out.write("\t\t\t<h1>Login</h1>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<input type=\"text\" placeholder=\"Username\" required=\"\" id=\"username\"  class=\"form-control\" />\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t<input type=\"password\" placeholder=\"Password\" required=\"\" id=\"password\" class=\"form-control\" />\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div>\n");
      out.write("                             \n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"Log in\" class=\"btn btn-primary btn-lg\"/>\n");
      out.write("\t\t\t\t<a href=\"#\">Lost your password?</a>\n");
      out.write("\t\t\t\t<a href=\"#\">Register</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</form><!-- form -->\n");
      out.write("\t\t\n");
      out.write("\t</section><!-- content -->\n");
      out.write("</div><!-- container -->\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("</div> \n");
      out.write("\n");
      out.write("<script src=\"assets/js/jquery-1.11.1.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/slick.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/placeholdem.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/rs-plugin/js/jquery.themepunch.plugins.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/rs-plugin/js/jquery.themepunch.revolution.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/waypoints.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/scripts.js\"></script>\n");
      out.write("    <script src=\"assets/js/index.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function() {\n");
      out.write("            appMaster.preLoader();\n");
      out.write("        });\n");
      out.write("    </script>\n");
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
