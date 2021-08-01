package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<!-- Hero section -->\n");
      out.write("\t<section class=\"hero-section\">\n");
      out.write("\t\t<div class=\"hero-slider owl-carousel\">\n");
      out.write("\t\t\t<div class=\"hs-item set-bg\" data-setbg=\"image/banner1.jpg\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xl-6 col-lg-7 text-white\">\n");
      out.write("\t\t\t\t\t\t\t<span>New Arrivals</span>\n");
      out.write("\t\t\t\t\t\t\t<h2>denim jackets</h2>\n");
      out.write("                                                        <p style=\"text-shadow: 2px 2px 4px #000000;\">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Quis ipsum sus-pendisse ultrices gravida. Risus commodo viverra maecenas accumsan lacus vel facilisis. </p>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"site-btn sb-line\">DISCOVER</a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"site-btn sb-white\">ADD TO CART</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"offer-card text-white\">\n");
      out.write("\t\t\t\t\t\t<span>from</span>\n");
      out.write("\t\t\t\t\t\t<h2>$29</h2>\n");
      out.write("\t\t\t\t\t\t<p>SHOP NOW</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"hs-item set-bg\" data-setbg=\"image/banner2.jpg\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xl-6 col-lg-7 text-white\">\n");
      out.write("\t\t\t\t\t\t\t<span>New Arrivals</span>\n");
      out.write("\t\t\t\t\t\t\t<h2>denim jackets</h2>\n");
      out.write("                                                        <p style=\"text-shadow: 2px 2px 4px #000000;\">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Quis ipsum sus-pendisse ultrices gravida. Risus commodo viverra maecenas accumsan lacus vel facilisis. </p>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"site-btn sb-line\">DISCOVER</a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"site-btn sb-white\">ADD TO CART</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"offer-card text-white\">\n");
      out.write("\t\t\t\t\t\t<span>from</span>\n");
      out.write("\t\t\t\t\t\t<h2>$29</h2>\n");
      out.write("\t\t\t\t\t\t<p>SHOP NOW</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
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
      out.write("\t<!-- letest product section -->\n");
      out.write("\t<section class=\"top-letest-product-section\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"section-title\">\n");
      out.write("\t\t\t\t<h2>LATEST PRODUCTS</h2>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"product-slider owl-carousel\">\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<!-- letest product section end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Product filter section -->\n");
      out.write("\t<section class=\"product-filter-section\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"section-title\">\n");
      out.write("\t\t\t\t<h2>BROWSE TOP SELLING PRODUCTS</h2>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<ul class=\"product-filter-menu\">\n");
      out.write("\t\t\t\t<li><a href=\"#\">Stunning</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Appealing</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Gorgeous</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Ravishing</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Dazzling</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Alluring</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Attractive</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"text-center pt-5\">\n");
      out.write("\t\t\t\t<button class=\"site-btn sb-line sb-dark\">LOAD MORE</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<!-- Product filter section end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Banner section -->\n");
      out.write("\t<section class=\"banner-section\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"banner set-bg\" data-setbg=\"image/banner.jpg\">\n");
      out.write("\t\t\t\t<div class=\"tag-new\">NEW</div>\n");
      out.write("\t\t\t\t<span>New Arrivals</span>\n");
      out.write("\t\t\t\t<h2>STRIPED SHIRTS</h2>\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"site-btn\">SHOP NOW</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<!-- Banner section end  -->\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${newProducts}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <div class=\"product-item\">\n");
          out.write("\t\t\t\t\t<div class=\"pi-pic\">\n");
          out.write("\t\t\t\t\t\t<img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getProductImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("\t\t\t\t\t\t<div class=\"pi-links\">\n");
          out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"add-card\"><i class=\"flaticon-bag\"></i><span>ADD TO CART</span></a>\n");
          out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"wishlist-btn\"><i class=\"flaticon-heart\"></i></a>\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t<div class=\"pi-text\">\n");
          out.write("\t\t\t\t\t\t<h6>$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getProductPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h6>\n");
          out.write("\t\t\t\t\t\t<p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getProductName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("product");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${topProducts}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t<div class=\"col-lg-3 col-sm-6\">\n");
          out.write("\t\t\t\t\t<div class=\"product-item\">\n");
          out.write("\t\t\t\t\t\t<div class=\"pi-pic\">\n");
          out.write("\t\t\t\t\t\t\t<img src=\"./");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getProductImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("\t\t\t\t\t\t\t<div class=\"pi-links\">\n");
          out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"add-card\"><i class=\"flaticon-bag\"></i><span>ADD TO CART</span></a>\n");
          out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"wishlist-btn\"><i class=\"flaticon-heart\"></i></a>\n");
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
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
