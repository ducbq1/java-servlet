package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zxx\">\n");
      out.write("<head>\n");
      out.write("\t<title>Divisima | eCommerce Template</title>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"description\" content=\" Divisima | eCommerce Template\">\n");
      out.write("\t<meta name=\"keywords\" content=\"divisima, eCommerce, creative, html\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t<!-- Favicon -->\n");
      out.write("\t<link href=\"img/favicon.ico\" rel=\"shortcut icon\"/>\n");
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
      out.write("\n");
      out.write("\t<!--[if lt IE 9]>\n");
      out.write("\t\t  <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("\t  <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("\t<![endif]-->\n");
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
      out.write("\t\t\t<h4>Category Page</h4>\n");
      out.write("\t\t\t<div class=\"site-pagination\">\n");
      out.write("\t\t\t\t<a href=\"index.jsp\">Home</a> /\n");
      out.write("\t\t\t\t<a href=\"product.jsp\">Shop</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- Page info end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- product section -->\n");
      out.write("\t<section class=\"product-section\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"back-link\">\n");
      out.write("\t\t\t\t<a href=\"./category.jsp\"> &lt;&lt; Back to Category</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-6\">\n");
      out.write("\t\t\t\t\t<div class=\"product-pic-zoom\">\n");
      out.write("                                            <img class=\"product-big-img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${randomProduct.getProductImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"\">\n");
      out.write("                                        </div>\n");
      out.write("\t\t\t\t\t<div class=\"product-thumbs\" tabindex=\"1\" style=\"overflow: hidden; outline: none;\">\n");
      out.write("\t\t\t\t\t\t<div class=\"product-thumbs-track\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pt active\" data-imgbigurl=\"image/icon1.png\"><img src=\"image/icon1.png\" alt=\"\"></div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pt\" data-imgbigurl=\"image/icon2.png\"><img src=\"image/icon2.png\" alt=\"\"></div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pt\" data-imgbigurl=\"image/icon3.png\"><img src=\"image/icon3.png\" alt=\"\"></div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pt\" data-imgbigurl=\"image/icon4.png\"><img src=\"image/icon4.png\" alt=\"\"></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-6 product-details\">\n");
      out.write("\t\t\t\t\t<h2 class=\"p-title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${randomProduct.getProductName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("\t\t\t\t\t<h3 class=\"p-price\">$");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${randomProduct.getProductPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("\t\t\t\t\t<h4 class=\"p-stock\">Available: <span>In Stock</span></h4>\n");
      out.write("\t\t\t\t\t<div class=\"p-rating\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-star-o\"></i>\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-star-o\"></i>\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-star-o\"></i>\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-star-o\"></i>\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-star-o fa-fade\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"p-review\">\n");
      out.write("\t\t\t\t\t\t<a href=\"\">3 reviews</a>|<a href=\"review.jsp\">Add your review</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"fw-size-choose\">\n");
      out.write("\t\t\t\t\t\t<p>Size</p>\n");
      out.write("\t\t\t\t\t\t<div class=\"sc-item\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" name=\"sc\" id=\"xs-size\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"xs-size\">32</label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"sc-item\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" name=\"sc\" id=\"s-size\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"s-size\">34</label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"sc-item\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" name=\"sc\" id=\"m-size\" checked=\"\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"m-size\">36</label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"sc-item\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" name=\"sc\" id=\"l-size\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"l-size\">38</label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"sc-item disable\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" name=\"sc\" id=\"xl-size\" disabled>\n");
      out.write("\t\t\t\t\t\t\t<label for=\"xl-size\">40</label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"sc-item\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" name=\"sc\" id=\"xxl-size\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"xxl-size\">42</label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"quantity\">\n");
      out.write("\t\t\t\t\t\t<p>Quantity</p>\n");
      out.write("                        <div class=\"pro-qty\"><input type=\"text\" value=\"1\"></div>\n");
      out.write("                    </div>\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"site-btn\">SHOP NOW</a>\n");
      out.write("\t\t\t\t\t<div id=\"accordion\" class=\"accordion-area\">\n");
      out.write("\t\t\t\t\t\t<div class=\"panel\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-header\" id=\"headingOne\">\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"panel-link active\" data-toggle=\"collapse\" data-target=\"#collapse1\" aria-expanded=\"true\" aria-controls=\"collapse1\">information</button>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div id=\"collapse1\" class=\"collapse show\" aria-labelledby=\"headingOne\" data-parent=\"#accordion\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${randomProduct.getProductDescription()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Approx length 66cm/26\" (Based on a UK size 8 sample)</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Mixed fibres</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>The Model wears a UK size 8/ EU size 36/ US size 4 and her height is 5'8\"</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"panel\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-header\" id=\"headingTwo\">\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"panel-link\" data-toggle=\"collapse\" data-target=\"#collapse2\" aria-expanded=\"false\" aria-controls=\"collapse2\">care details </button>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div id=\"collapse2\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordion\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"./img/cards.png\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pharetra tempor so dales. Phasellus sagittis auctor gravida. Integer bibendum sodales arcu id te mpus. Ut consectetur lacus leo, non scelerisque nulla euismod nec.</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"panel\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-header\" id=\"headingThree\">\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"panel-link\" data-toggle=\"collapse\" data-target=\"#collapse3\" aria-expanded=\"false\" aria-controls=\"collapse3\">shipping & Returns</button>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div id=\"collapse3\" class=\"collapse\" aria-labelledby=\"headingThree\" data-parent=\"#accordion\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>7 Days Returns</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Cash on Delivery Available<br>Home Delivery <span>3 - 4 days</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pharetra tempor so dales. Phasellus sagittis auctor gravida. Integer bibendum sodales arcu id te mpus. Ut consectetur lacus leo, non scelerisque nulla euismod nec.</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"social-sharing\">\n");
      out.write("\t\t\t\t\t\t<a href=\"\"><i class=\"fa fa-google-plus\"></i></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"\"><i class=\"fa fa-pinterest\"></i></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"\"><i class=\"fa fa-youtube\"></i></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<!-- product section end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- RELATED PRODUCTS section -->\n");
      out.write("\t<section class=\"related-product-section\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"section-title\">\n");
      out.write("\t\t\t\t<h2>RELATED PRODUCTS</h2>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"product-slider owl-carousel\">\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<!-- RELATED PRODUCTS section end -->\n");
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
          out.write("                                <div class=\"product-item\">\n");
          out.write("\t\t\t\t\t<div class=\"pi-pic\">\n");
          out.write("\t\t\t\t\t\t<img src=\"./");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getProductImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("\t\t\t\t\t\t<div class=\"pi-links\">\n");
          out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"add-card\"><i class=\"flaticon-bag\"></i><span>ADD TO CART</span></a>\n");
          out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"wishlist-btn\"><i class=\"flaticon-heart\"></i></a>\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t<div class=\"pi-text\">\n");
          out.write("\t\t\t\t\t\t<h6>$35,00</h6>\n");
          out.write("\t\t\t\t\t\t<p>Flamboyant Pink Top </p>\n");
          out.write("\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t</div>\n");
          out.write("                            ");
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
