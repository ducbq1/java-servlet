package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _005fmenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setHeader("X-Powered-By", "JSP/2.3");
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
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t<title>JSP Page</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"description\" content=\"eCommerce\">\n");
      out.write("\t<meta name=\"keywords\" content=\"eCommerce, creative, html\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        \n");
      out.write("\t<!-- Google Font -->\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Josefin+Sans:300,300i,400,400i,700,700i\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Stylesheets -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/flaticon.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/slicknav.min.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/jquery-ui.min.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/animate.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\"/>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<!-- Header section -->\n");
      out.write("\t<header class=\"header-section\">\n");
      out.write("\t<nav class=\"main-navbar\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<!-- menu -->\n");
      out.write("\t\t\t\t<ul class=\"main-menu\">\n");
      out.write("\t\t\t\t\t<li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"./product.jsp\">Product\n");
      out.write("\t\t\t\t\t\t<span class=\"new\">New</span>\n");
      out.write("\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Pages</a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub-menu\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./product.jsp\">Product Page</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./category.jsp\">Category Page</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./cart.jsp\">Cart Page</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"CheckOutServlet\">Checkout Page</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"./contact.jsp\">Contact Page</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li><a href=\"./about.jsp\">About</a></li>\n");
      out.write("                                        <li><a href=\"BillServlet\">History of bill</a></li>\n");
      out.write("                                        <li><a href=\"UserServlet?method=get\">Log Out</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</nav>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("<!--====== Javascripts & Jquery ======-->\n");
      out.write("\t<script src=\"js/jquery-3.2.1.min.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.slicknav.min.js\"></script>\n");
      out.write("\t<script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.nicescroll.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.zoom.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery-ui.min.js\"></script>\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
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
