package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      out.write("<!--[if lt IE 7]> <html class=\"no-js lt-ie9 lt-ie8 lt-ie7\" lang=\"en\"> <![endif]-->\n");
      out.write("<!--[if IE 7]> <html class=\"no-js lt-ie9 lt-ie8\" lang=\"en\"> <![endif]-->\n");
      out.write("<!--[if IE 8]> <html class=\"no-js lt-ie9\" lang=\"en\"> <![endif]-->\n");
      out.write("<!--[if gt IE 8]><!--> <html class=\"no-js\" lang=\"en\"> <!--<![endif]-->\n");
      out.write("<head>\n");
      out.write("<title>EMPLOYEE PORTAL</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("<link rel=\"stylesheet\" href=\"stylesheets/foundation.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"stylesheets/main.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"stylesheets/app.css\">\n");
      out.write("<script src=\"javascripts/modernizr.foundation.js\"></script>\n");
      out.write("<!-- Google fonts -->\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300|Playfair+Display:400italic' rel='stylesheet' type='text/css' />\n");
      out.write("<!-- IE Fix for HTML5 Tags -->\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("<script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("<![endif]-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write(" <!--<h1 class=\"heading_supersize\"><span class=\"heading_center_bg\">EMPLOYEE PORTAL!</span></h1>\n");
      out.write("<p style=\"text-align:center\"><a href=\"#\" class=\"button\">LOGIN</a> </p>-->\n");
      out.write("<!--<div class=\"row\"> <a href=\"index.html\"><img src=\"images/logo.png\" alt=\"\" class=\"header_logo\"></a> </div>\n");
      out.write("<div class=\"row page_wrap\" style=\"margin-top:-2px\">\n");
      out.write("  <!-- page wrap -->\n");
      out.write("  <!--<div class=\"twelve columns\">\n");
      out.write("    <!-- page wrap -->\n");
      out.write("    <!--<div class=\"row\">\n");
      out.write("      <div class=\"twelve columns header_nav\" style=\"margin-bottom:0; box-shadow: none\">\n");
      out.write("        <div class=\"twelve columns\">\n");
      out.write("          <ul id=\"menu-header\" class=\"nav-bar horizontal\">\n");
      out.write("            <li class=\"active\"><a href=\"index.html\">Home</a></li>\n");
      out.write("            <li class=\"has-flyout\"> <a href=\"#\">Example Pages</a><a href=\"#\" class=\"flyout-toggle\"></a>\n");
      out.write("              <ul class=\"flyout\">\n");
      out.write("                <li class=\"has-flyout\"><a href=\"blog.html\">Blog</a></li>\n");
      out.write("                <li class=\"has-flyout\"><a href=\"blog-single.html\">Blog Single Page</a></li>\n");
      out.write("                <li class=\"has-flyout\"><a href=\"products-page.html\">Products Page</a></li>\n");
      out.write("                <li class=\"has-flyout\"><a href=\"product-single.html\">Product Single</a></li>\n");
      out.write("                <li class=\"has-flyout\"><a href=\"pricing-table.html\">Pricing Table</a></li>\n");
      out.write("                <li class=\"has-flyout\"><a href=\"contact.html\">Contact Page</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("            <li><a href=\"galleries.html\">Boxed Gallery</a></li>\n");
      out.write("            <li><a href=\"portfolio.html\">Portfolio Gallery</a></li>\n");
      out.write("            <li><a href=\"pinterest-style.html\">Pinterest Gallery</a></li>\n");
      out.write("            <li><a href=\"tiles.html\">Tiles</a></li>\n");
      out.write("          </ul>\n");
      out.write("          <script>$('ul#menu-header').nav-bar();</script>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>-->\n");
      out.write("    <!-- END Header -->\n");
      out.write("    <!-- Slider -->\n");
      out.write("  <div class=\"row show-for-large-up\">\n");
      out.write("      <div class=\"twelve columns\">\n");
      out.write("        <div id=\"featured\"><br><img src=\"images/l.jpg\" alt=\"\" width=\"1000\" height=\"322\"> <img src=\"images/gal6.jpg\" width=\"1500\" height=\"3500\" alt=\"\"> <img src=\"images/gal11.jpg\" alt=\"\" width=\"1800\" height=\"131\"><img src=\"images/gal1.jpg\" alt=\"\" width=\"1000\" ><img src=\"images/img2.jpg\" alt=\"\" width=\"1000\" >\n");
      out.write("\n");
      out.write(" </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- END Slider -->\n");
      out.write("    \n");
      out.write("   <div class=\"row\">\n");
      out.write("      <div class=\"twelve columns\">\n");
      out.write("       \n");
      out.write("        <h1 class=\"heading_supersize\"><FONT face=\"Times New Roman\" color=\"#333333\"><center>EMPLOYEE PORTAL</center></FONT></h1>\n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("      <P ALIGN=\"center\"> <a href=\"index2.jsp\" class=\"button\">\n");
      out.write("           LOGIN</a></p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("   <p><!-- <div class=\"row\">\n");
      out.write("      <div class=\"twelve columns\">\n");
      out.write("        <ul id=\"menu3\" class=\"footer_menu horizontal\">\n");
      out.write("          <li><a href=\"index.html\">Home</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <script>$('ul#menu3').nav-bar();</script>\n");
      out.write("  </div>\n");
      out.write("</div>-->\n");
      out.write("  <!-- end page wrap) -->\n");
      out.write("  <!-- Included JS Files (Compressed) -->\n");
      out.write("  <script src=\"javascripts/foundation.min.js\"></script></p>\n");
      out.write("   <p>\n");
      out.write("     <script src=\"javascripts/app.js\"></script>\n");
      out.write("   </p>\n");
      out.write("   <br>\n");
      out.write("   <br>\n");
      out.write("   <br>\n");
      out.write("   <p align=\"right\"><img src=\"images/gal7.jpg\" ></p>\n");
      out.write("</body>\n");
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
