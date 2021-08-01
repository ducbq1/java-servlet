package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Random;
import java.util.Map;
import project.two.model.Item;
import project.two.model.Cart;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zxx\">\n");
      out.write("<head>\n");
      out.write("\t<title>eCommerce</title>\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t<meta name=\"description\" content=\"eCommerce\">\n");
      out.write("\t<meta name=\"keywords\" content=\"eCommerce, creative, html\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
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
      out.write("    \n");
      out.write("    ");

        Random rd = new Random();
        int x = rd.nextInt(100);
    
      out.write("\n");
      out.write("\t<!-- Page info -->\n");
      out.write("\t<div class=\"page-top-info\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h4>Your cart</h4>\n");
      out.write("\t\t\t<div class=\"site-pagination\">\n");
      out.write("\t\t\t\t<a href=\"\">Home</a> /\n");
      out.write("\t\t\t\t<a href=\"\">Your cart</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- Page info end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- checkout section  -->\n");
      out.write("\t<section class=\"checkout-section spad\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-8 order-2 order-lg-1\">\n");
      out.write("                                    <form class=\"checkout-form\" action=\"CheckOutServlet\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t<div class=\"cf-title\">Billing Address</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-7\">\n");
      out.write("\t\t\t\t\t\t\t\t<p>*Billing Information</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-5\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"cf-radio-btns address-rb\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"cfr-item\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"pm\" id=\"one\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"one\">Use my regular address</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"cfr-item\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"pm\" id=\"two\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"two\">Use a different address</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"row address-inputs\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"payment\" placeholder=\"Payment\">\n");
      out.write("                                                                <input type=\"text\" name=\"address\" placeholder=\"Address\">\n");
      out.write("                                                        </div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"name\" placeholder=\"Full name\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"phone\" placeholder=\"Phone no.\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                <input type=\"hidden\" name=\"shipping\" value=");
      out.print(x);
      out.write(">\n");
      out.write("                                                <button type=\"submit\" class=\"site-btn submit-order-btn\">Place Order</button>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 order-1 order-lg-2\">\n");
      out.write("\t\t\t\t\t<div class=\"checkout-cart\">\n");
      out.write("\t\t\t\t\t\t<h3>Your Cart</h3>\n");
      out.write("\t\t\t\t\t\t<ul class=\"product-list\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                                                        ");

                                                               Cart cart = (Cart) session.getAttribute("cart");
                                                                if (cart == null) {
                                                                    cart = new Cart();
                                                                    session.setAttribute("cart", cart);
                                                                }
                                                                
      out.write("\n");
      out.write("                                                        ");
for (Map.Entry<Long, Item> list : cart.getCartItems().entrySet()) {
      out.write("\n");
      out.write("                                                    \n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("                                                            <div class=\"pl-thumb\"><img src=\"");
      out.print(list.getValue().getProduct().getProductImage());
      out.write("\" alt=\"\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t<h6>");
      out.print(list.getValue().getProduct().getProductName());
      out.write("</h6>\n");
      out.write("                                                                <p>Đơn giá: $");
      out.print(list.getValue().getProduct().getProductPrice());
      out.write("</p>\n");
      out.write("                                                                <p>Số lượng: ");
      out.print(list.getValue().getQuantity());
      out.write("</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Tổng tiền: $");
      out.print(list.getValue().getProduct().getProductPrice() * list.getValue().getQuantity());
      out.write("</p>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("                                                        \n");
      out.write("                                                        ");
}
      out.write("\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<ul class=\"price-list\">\n");
      out.write("\t\t\t\t\t\t\t<li>Total<span>$");
      out.print(cart.totalCart());
      out.write("</span></li>\n");
      out.write("                                                        <li>Shipping<span>$");
      out.print(x);
      out.write("</span></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"total\">Total<span>$");
      out.print(cart.totalCart() + x);
      out.write("</span></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<!-- checkout section end -->\n");
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
