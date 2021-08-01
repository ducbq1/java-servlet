package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import java.util.Map;
import project.two.model.Item;
import project.two.model.Cart;;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\t<meta name=\"description\" content=\"eCommerce Template\">\n");
      out.write("\t<meta name=\"keywords\" content=\"eCommerce, creative, html\">\n");
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
      out.write("\t<!-- cart section end -->\n");
      out.write("\t<section class=\"cart-section spad\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-8\">\n");
      out.write("\t\t\t\t\t<div class=\"cart-table\">\n");
      out.write("\t\t\t\t\t\t<h3>Your Cart</h3>\n");
      out.write("\t\t\t\t\t\t<div class=\"cart-table-warp\">\n");
      out.write("\t\t\t\t\t\t\t<table>\n");
      out.write("\t\t\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"product-th\">Product</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"quy-th\">Quantity</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"size-th\">Category</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"total-th\">Price</th>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t\t\t<tbody>\n");
      out.write("                                                                ");

                                                                Cart cart = (Cart) session.getAttribute("cart");
                                                                if (cart == null) {
                                                                    cart = new Cart();
                                                                    session.setAttribute("cart", cart);
                                                                }
                                                                
      out.write("\n");
      out.write("                                                        ");
for (Map.Entry<Long, Item> list : cart.getCartItems().entrySet()) {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"product-col\">\n");
      out.write("                                                                            <a href=\"CartServlet?method=get&command=remove&productID=");
      out.print(list.getValue().getProduct().getProductID());
      out.write("\"><img src=\"");
      out.print(list.getValue().getProduct().getProductImage());
      out.write("\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"pc-title\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4>");
      out.print(list.getValue().getProduct().getProductName());
      out.write("</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>$");
      out.print(list.getValue().getProduct().getProductPrice());
      out.write("</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"quy-col\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"quantity\">\n");
      out.write("\t\t\t\t\t                        <div class=\"pro-qty\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" value=\"");
      out.print(list.getValue().getQuantity());
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                    \t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"size-col\"><h4>");
      out.print(list.getValue().getProduct().getCategoryID());
      out.write("</h4></td>\n");
      out.write("                                                                        <td class=\"total-col\"><h4>");
      out.print(list.getValue().getProduct().getProductPrice() * list.getValue().getQuantity());
      out.write("</h4></td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("                                                        ");
}
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"total-cost\">\n");
      out.write("\t\t\t\t\t\t\t<h6>Total <span>$");
      out.print(cart.totalCart());
      out.write("</span></h6>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 card-right\">\n");
      out.write("\t\t\t\t\t<form class=\"promo-code-form\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" placeholder=\"Enter promo code\">\n");
      out.write("\t\t\t\t\t\t<button>Submit</button>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t<a href=\"./checkout.jsp\" class=\"site-btn\">Proceed to checkout</a>\n");
      out.write("\t\t\t\t\t<a href=\"./category.jsp\" class=\"site-btn sb-dark\">Continue shopping</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<!-- cart section end -->\n");
      out.write("\n");
      out.write("\t<!-- Related product section -->\n");
      out.write("\t<section class=\"related-product-section\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"section-title text-uppercase\">\n");
      out.write("\t\t\t\t<h2>Continue Shopping</h2>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<!-- Related product section end -->\n");
      out.write("\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("product");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listProducts}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t<div class=\"col-lg-3 col-sm-6\">\n");
          out.write("\t\t\t\t\t<div class=\"product-item\">\n");
          out.write("\t\t\t\t\t\t<div class=\"pi-pic\">\n");
          out.write("\t\t\t\t\t\t\t<div class=\"tag-new\">New</div>\n");
          out.write("\t\t\t\t\t\t\t<img src=\"./");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getProductImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("\t\t\t\t\t\t\t<div class=\"pi-links\">\n");
          out.write("                                                            <a href=\"CartServlet?method=get&command=plus&productID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getProductID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"add-card\"><i class=\"flaticon-bag\"></i><span>ADD TO CART</span></a>\n");
          out.write("                                                            <a href=\"IndexServlet?method=get&productID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getProductID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"wishlist-btn\"><i class=\"flaticon-heart\"></i></a>\n");
          out.write("\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t<div class=\"pi-text\">\n");
          out.write("\t\t\t\t\t\t\t<h6>$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getProductPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h6>\n");
          out.write("\t\t\t\t\t\t\t<p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getProductName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t</div>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
