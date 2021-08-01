package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import get.BrandGet;
import model.Brand;
import java.util.Map;
import model.Item;
import model.Cart;
import model.User;
import model.Category;
import get.CategoryGet;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>header</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
 
            
        CategoryGet categoryget = new CategoryGet();
        BrandGet brandget = new BrandGet();
        User user = null;
        if(session.getAttribute("user") != null){
            user = (User) session.getAttribute("user");
        }
        
        Cart cart = (Cart) session.getAttribute("cart");
            if (cart == null) {
                cart = new Cart();
                session.setAttribute("cart", cart);
            }
            DecimalFormat formatter = new DecimalFormat("###,###,###");
            
      out.write("\n");
      out.write("        \t<div class=\"header\">\n");
      out.write("\t\t\t<div class=\"header-grid\">\n");
      out.write("\t\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"header-left animated wow fadeInLeft\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><i class=\"glyphicon glyphicon-headphones\"></i><a href=\"#\">Hỗ trợ 24/7</a></li>\n");
      out.write("\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-envelope\" ></i><a href=\"mailto:contact@hutechguitarshop.com\">@hutechguitarshop.com</a></li>\n");
      out.write("\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-earphone\" ></i>+8493 552 6224</li>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"header-right animated wow fadeInRight\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t<div class=\"header-right1 \">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("                                            ");
if(user!=null){ 
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-user\" ></i><a href=\"navigate.jsp\">Chào ");
      out.print(user.getUserName());
      out.write("</a></li>\n");
      out.write("\t\t\t\t\t\t");
 } 
      out.write("\n");
      out.write("                                                ");
if(user==null){ 
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-log-in\" ></i><a href=\"navigate.jsp\">My Account</a></li>\n");
      out.write("\t\t\t\t\t\t");
 } 
      out.write("\n");
      out.write("                                                \n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"header-right2\">\n");
      out.write("                                    \n");
      out.write("\t\t\t\t\t<div class=\"cart box_1\">\n");
      out.write("                                           \n");
      out.write("                                            \n");
      out.write("\t\t\t\t\t\t<a href=\"checkout.jsp\">\n");
      out.write("\t\t\t\t\t\t\t<h3> <div class=\"total\">\n");
      out.write("                                                                \n");
      out.write("                                                                <span class=\"last_price\" >");
      out.print(formatter.format(cart.totalCart()));
      out.write("</span> VNĐ <span> (Xem giỏ hàng)</span></div>\n");
      out.write("\t\t\t\t\t\t\t\t <img src=\"images/cart.png\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t</h3>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("                                                                      \n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                                                <a href=\"javascript:;\" class=\"simpleCart_empty\">Làm trống giỏ</a>\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("                                       \n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"logo-nav\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t<nav class=\"navbar navbar-default\">\n");
      out.write("\t\t\t\t\t<!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t\t\t\t\t<div class=\"navbar-header nav_2\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed navbar-toggle1\" data-toggle=\"collapse\" data-target=\"#bs-megadropdown-tabs\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t <div class=\"navbar-brand logo-nav-left \">\n");
      out.write("\t\t\t\t\t\t\t<h1 class=\"animated wow pulse\" data-wow-delay=\".5s\"><a href=\"index.jsp\">HUTECH<span> ACOUSTIC SHOP</span></a></h1>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-megadropdown-tabs\">\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t\t\t<li class=\"active\"><a href=\"index.jsp\" class=\"act\">Trang Chủ</a></li>\t\n");
      out.write("\t\t\t\t\t\t\t<!-- Mega Menu -->\n");
      out.write("<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Nhạc Cụ <b class=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu multi\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h4>HUTECH MUSIC SHOP</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                                                                                ");

                                                                                                    for (Category c : categoryget.getListCategory()) {
                                                                                                    
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp?category=");
      out.print(c.getCategoryID());
      out.write('"');
      out.write('>');
      out.print(c.getCategoryName());
      out.write("</a></li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                                                                                ");

                                                                                                    }
                                                                                                 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row-top\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-6 row1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"guitar.jsp\"><img src=\"images/me.jpg\" alt=\"\" class=\"img-responsive\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\" col-sm-6 row2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"piano.jsp\"><img src=\"images/me1.jpg\" alt=\"\" class=\"img-responsive\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Thương Hiệu <b class=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu multi\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h4>THƯƠNG HIỆU</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                                                                                ");

                                                                                                    for (Brand b : brandget.getListBrand()) {
                                                                                                    
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"productbrand.jsp?brand=");
      out.print(b.getBrandID());
      out.write('"');
      out.write('>');
      out.print(b.getBrandName());
      out.write("</a></li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                                                                                ");

                                                                                                    }
                                                                                                 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row-top\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-6 row1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"productbrand.jsp?brand=1\"><img src=\"images/taylor.jpg\" alt=\"\" class=\"img-responsive\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\" col-sm-6 row2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"productbrand.jsp?brand=8\"><img src=\"images/kawai.jpg\" alt=\"\" class=\"img-responsive\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"navigate.jsp\">Tài Khoản</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"contact.jsp\">Liên Hệ</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
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
