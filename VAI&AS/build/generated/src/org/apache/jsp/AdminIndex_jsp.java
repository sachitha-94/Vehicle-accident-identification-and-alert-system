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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\" class=\"no-js\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>VAIAS</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("        <link rel=\"shortcut icon\" href=\"favicon.png\">\n");
      out.write("\n");
      out.write("        <!-- style sheets -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/animate.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/slick.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/js/rs-plugin/css/settings.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/modernizr.custom.32033.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/slick.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/placeholdem.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/rs-plugin/js/jquery.themepunch.plugins.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/rs-plugin/js/jquery.themepunch.revolution.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/waypoints.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/scripts.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                appMaster.preLoader();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\" style=\"width: 100%\">\n");
      out.write("            <div class=\"pre-loader\">\n");
      out.write("                <div class=\"load-con\">\n");
      out.write("                    <img src=\"assets/img/freeze/logo.png\" class=\"animated fadeInDown\" alt=\"\">\n");
      out.write("                    <div class=\"spinner\">\n");
      out.write("                        <div class=\"bounce1\"></div>\n");
      out.write("                        <div class=\"bounce2\"></div>\n");
      out.write("                        <div class=\"bounce3\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <header>\n");
      out.write("\n");
      out.write("                <nav class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                        <div class=\"navbar-header\">\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                                <span class=\"fa fa-bars fa-lg\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <a class=\"navbar-brand\" href=\"index.html\">\n");
      out.write("                                <img src=\"assets/img/freeze/logo.png\" alt=\"\" class=\"logo\">\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                <li><a href=\"Admin - dashboard.jsp\">Admin Panel</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a class=\"getApp\" id=\"profileButton\" href=\"#getApp\">Profile</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"index.jsp\">Log Out</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.navbar-collapse -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.container-->\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!--RevSlider-->\n");
      out.write("                <div id=\"banner\"  style=\"height: 150px;\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div id=\"map\" style=\"height: 700px;width: 100%;\"></div>\n");
      out.write("                <script>\n");
      out.write("                    function initMap() {\n");
      out.write("                        var uluru = {lat: 7.8731, lng: 80.7718};\n");
      out.write("                        var map = new google.maps.Map(document.getElementById('map'), {\n");
      out.write("                            zoom: 4,\n");
      out.write("                            center: uluru\n");
      out.write("                        });\n");
      out.write("                        var marker = new google.maps.Marker({\n");
      out.write("                            position: uluru,\n");
      out.write("                            map: map\n");
      out.write("                        });\n");
      out.write("                    }\n");
      out.write("                </script>\n");
      out.write("                <script async defer\n");
      out.write("                        src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBQNxuARLxgAq6oGgjEiHcMGCwRG7Eye2A&callback=initMap\">\n");
      out.write("                </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <div id=\"viewprofile\" style=\"display: none\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "profileview.jsp", out, false);
      out.write("</div>\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("                <footer>\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <a href=\"#\" class=\"scrollpoint sp-effect3\">\n");
      out.write("                            <img src=\"assets/img/freeze/logo.png\" alt=\"\" class=\"logo\">\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"social\">\n");
      out.write("                            <a href=\"#\" class=\"scrollpoint sp-effect3\"><i class=\"fa fa-twitter fa-lg\"></i></a>\n");
      out.write("                            <a href=\"#\" class=\"scrollpoint sp-effect3\"><i class=\"fa fa-google-plus fa-lg\"></i></a>\n");
      out.write("                            <a href=\"#\" class=\"scrollpoint sp-effect3\"><i class=\"fa fa-facebook fa-lg\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"rights\">\n");
      out.write("                            <p>Copyright &copy; 2014</p>\n");
      out.write("                            <p>Template by <a href=\"http://www.scoopthemes.com\" target=\"_blank\">ScoopThemes</a></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </footer>\n");
      out.write("                <script>\n");
      out.write("                    $('#banner').css('background-image', 'url(assets/img/freeze/bk-freeze.jpg)');\n");
      out.write("                    $('#banner').css('height', '140px');\n");
      out.write("                </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <script>\n");
      out.write("                    $('#profileButton').click(function () {\n");
      out.write("                        $('#viewprofile').toggle(\"slow\");\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                    $('#profileButton').click(function () {\n");
      out.write("                        $('#map').hide(\"slow\");\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                    $('#close').click(function () {\n");
      out.write("                        $('#viewprofile').hide(\"slow\");\n");
      out.write("                    });\n");
      out.write("                    $('#close').click(function () {\n");
      out.write("                        $('#map').toggle(\"slow\");\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                    //function displayMap() {\n");
      out.write("                    //document.getElementById('viewprofile').style.display = \"block\";\n");
      out.write("\n");
      out.write("                    //}\n");
      out.write("\n");
      out.write("                    // $('#profileButton').click(function () {\n");
      out.write("                    //$('#viewprofile').toggle(\"slow\");\n");
      out.write("                    //document.getElementById(\"container\").style.opacity = \"0.2\";\n");
      out.write("                    //displayMap();\n");
      out.write("                    // });\n");
      out.write("\n");
      out.write("                </script>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
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
