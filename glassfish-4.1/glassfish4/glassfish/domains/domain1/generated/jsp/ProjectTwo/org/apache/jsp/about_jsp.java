package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import project.two.model.User;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zxx\">\n");
      out.write("<head>\n");
      out.write("\t<title>eCommerce</title>\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t<meta name=\"description\" content=\" Divisima | eCommerce Template\">\n");
      out.write("\t<meta name=\"keywords\" content=\"divisima, eCommerce, creative, html\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
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
      out.write("<body>\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "_header.jsp", out, false);
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "_menu.jsp", out, false);
      out.write("\n");
      out.write("\t<!-- Hero section -->\n");
      out.write("\t<section class=\"hero-section\">\n");
      out.write("\t\t<div class=\"hero-slider owl-carousel\">\n");
      out.write("\t\t\t<div class=\"hs-item set-bg\" data-setbg=\"image/about1.jpg\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xl-6 col-lg-7 text-white\">\n");
      out.write("\t\t\t\t\t\t\t<span>Many Thanks ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getUserName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t\t<h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message != null ? message : \"INFORMATION\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("                                                        <a href=\"UserServlet?method=get&command=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${command}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><h2 style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${exitMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2></a>\n");
      out.write("                                                        <p style=\"text-shadow: 2px 2px 4px #000000;\">\n");
      out.write("                                                        ");

                                                            Date dNow = new Date( );
                                                            SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
                                                            out.print(ft.format(dNow) );
                                                        
      out.write(" <br />\n");
      out.write("                                                        ID: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getUserID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <br />\n");
      out.write("                                                        Name: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getUserName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <br />\n");
      out.write("                                                        Email: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getUserEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <br />\n");
      out.write("                                                        </p>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"./product.jsp\" class=\"site-btn sb-line\">ORDER NOW</a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"./logedit.jsp\" class=\"site-btn sb-white\">EDIT INFO</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"slide-num-holder\" id=\"snh-1\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<!-- Hero section end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Features section -->\n");
      out.write("\t<section class=\"features-section\">\n");
      out.write("\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-4 p-0 feature\">\n");
      out.write("\t\t\t\t\t<div class=\"feature-inner\">\n");
      out.write("\t\t\t\t\t\t<div class=\"feature-icon\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/icons/1.png\" alt=\"#\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<h2>Fast Secure Payments</h2>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 p-0 feature\">\n");
      out.write("\t\t\t\t\t<div class=\"feature-inner\">\n");
      out.write("\t\t\t\t\t\t<div class=\"feature-icon\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/icons/2.png\" alt=\"#\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<h2>Premium Products</h2>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 p-0 feature\">\n");
      out.write("\t\t\t\t\t<div class=\"feature-inner\">\n");
      out.write("\t\t\t\t\t\t<div class=\"feature-icon\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/icons/3.png\" alt=\"#\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<h2>Free & fast Delivery</h2>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<!-- Features section end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "_footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!--====== Javascripts & Jquery ======-->\n");
      out.write("\t<script src=\"js/jquery-3.2.1.min.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.slicknav.min.js\"></script>\n");
      out.write("\t<script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.nicescroll.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.zoom.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery-ui.min.js\"></script>\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\t</body>\n");
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
