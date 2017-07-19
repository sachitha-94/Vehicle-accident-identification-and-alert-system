package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\" class=\"no-js\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <title>VAIAS</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"favicon.png\">\r\n");
      out.write("\r\n");
      out.write("        <!-- style sheets -->\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("        <div class=\"container\" style=\"width: 100%\">\r\n");
      out.write("            <div class=\"pre-loader\">\r\n");
      out.write("                <div class=\"load-con\">\r\n");
      out.write("                    <img src=\"assets/img/freeze/logo.png\" class=\"animated fadeInDown\" alt=\"\">\r\n");
      out.write("                    <div class=\"spinner\">\r\n");
      out.write("                        <div class=\"bounce1\"></div>\r\n");
      out.write("                        <div class=\"bounce2\"></div>\r\n");
      out.write("                        <div class=\"bounce3\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <header>\r\n");
      out.write("\r\n");
      out.write("                <nav class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("                        <div class=\"navbar-header\">\r\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("                                <span class=\"fa fa-bars fa-lg\"></span>\r\n");
      out.write("                            </button>\r\n");
      out.write("                            <a class=\"navbar-brand\" href=\"index.html\">\r\n");
      out.write("                                <img src=\"assets/img/freeze/logo.png\" alt=\"\" class=\"logo\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("\r\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                                <li><a class=\"getApp\" href=\"Admin - dashboard.jsp\">Admin Panel</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                               \r\n");
      out.write("                                <li><a href=\"index.jsp\">Log Out</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- /.navbar-collapse -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /.container-->\r\n");
      out.write("                </nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <!--RevSlider-->\r\n");
      out.write("                <div id=\"banner\"  style=\"height: 150px;\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div id=\"map\" style=\"height: 700px;width: 100%;\"></div>\r\n");
      out.write("                <script>\r\n");
      out.write("                    function initMap() {\r\n");
      out.write("                        var uluru = {lat: 7.8731, lng: 80.7718};\r\n");
      out.write("                        var map = new google.maps.Map(document.getElementById('map'), {\r\n");
      out.write("                            zoom: 8,\r\n");
      out.write("                            center: uluru\r\n");
      out.write("                        });\r\n");
      out.write("                        var marker = new google.maps.Marker({\r\n");
      out.write("                            position: uluru,\r\n");
      out.write("                            map: map\r\n");
      out.write("                        });\r\n");
      out.write("                    }\r\n");
      out.write("                </script>\r\n");
      out.write("                <script async defer\r\n");
      out.write("                        src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBQNxuARLxgAq6oGgjEiHcMGCwRG7Eye2A&callback=initMap\">\r\n");
      out.write("                </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </header>\r\n");
      out.write("              \r\n");
      out.write("            <div id=\"viewprofile\" style=\"display: none\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "profileview.jsp", out, false);
      out.write("</div>\r\n");
      out.write("            <div class=\"wrapper\">\r\n");
      out.write("                <footer>\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <a href=\"#\" class=\"scrollpoint sp-effect3\">\r\n");
      out.write("                            <img src=\"assets/img/freeze/logo.png\" alt=\"\" class=\"logo\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div class=\"social\">\r\n");
      out.write("                            <a href=\"#\" class=\"scrollpoint sp-effect3\"><i class=\"fa fa-twitter fa-lg\"></i></a>\r\n");
      out.write("                            <a href=\"#\" class=\"scrollpoint sp-effect3\"><i class=\"fa fa-google-plus fa-lg\"></i></a>\r\n");
      out.write("                            <a href=\"#\" class=\"scrollpoint sp-effect3\"><i class=\"fa fa-facebook fa-lg\"></i></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"rights\">\r\n");
      out.write("                            <p>Copyright &copy; 2014</p>\r\n");
      out.write("                            <p>Template by <a href=\"http://www.scoopthemes.com\" target=\"_blank\">ScoopThemes</a></p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </footer>\r\n");
      out.write("                <script>\r\n");
      out.write("                    $('#banner').css('background-image', 'url(assets/img/freeze/bk-freeze.jpg)');\r\n");
      out.write("                    $('#banner').css('height', '140px');\r\n");
      out.write("                </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <script>\r\n");
      out.write("                    $('#profileButton').click(function () {\r\n");
      out.write("                        $('#viewprofile').toggle(\"slow\");\r\n");
      out.write("                    });\r\n");
      out.write("\r\n");
      out.write("                    $('#profileButton').click(function () {\r\n");
      out.write("                        $('#map').hide(\"slow\");\r\n");
      out.write("                    });\r\n");
      out.write("\r\n");
      out.write("                    $('#close').click(function () {\r\n");
      out.write("                        $('#viewprofile').hide(\"slow\");\r\n");
      out.write("                    });\r\n");
      out.write("                    $('#close').click(function () {\r\n");
      out.write("                        $('#map').toggle(\"slow\");\r\n");
      out.write("                    });\r\n");
      out.write("\r\n");
      out.write("                    //function displayMap() {\r\n");
      out.write("                    //document.getElementById('viewprofile').style.display = \"block\";\r\n");
      out.write("\r\n");
      out.write("                    //}\r\n");
      out.write("\r\n");
      out.write("                    // $('#profileButton').click(function () {\r\n");
      out.write("                    //$('#viewprofile').toggle(\"slow\");\r\n");
      out.write("                    //document.getElementById(\"container\").style.opacity = \"0.2\";\r\n");
      out.write("                    //displayMap();\r\n");
      out.write("                    // });\r\n");
      out.write("\r\n");
      out.write("                </script>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
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
