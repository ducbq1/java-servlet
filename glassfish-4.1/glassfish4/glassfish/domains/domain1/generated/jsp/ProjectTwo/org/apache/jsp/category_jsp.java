package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import project.two.model.Category;
import project.two.utils.CategoryGet;
import project.two.utils.ProductGet;

public final class category_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zxx\">\n");
      out.write("<head>\n");
      out.write("\t<title>eCommerce</title>\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t<meta name=\"description\" content=\" Divisima | eCommerce Template\">\n");
      out.write("\t<meta name=\"keywords\" content=\"divisima, eCommerce, creative, html\">\n");
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
      out.write("\t\t\t<h4>CAtegory PAge</h4>\n");
      out.write("\t\t\t<div class=\"site-pagination\">\n");
      out.write("\t\t\t\t<a href=\"\">Home</a> /\n");
      out.write("\t\t\t\t<a href=\"\">Shop</a> /\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- Page info end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Category section -->\n");
      out.write("\t<section class=\"category-section spad\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 order-2 order-lg-1\">\n");
      out.write("\t\t\t\t\t<div class=\"filter-widget\">\n");
      out.write("\t\t\t\t\t\t<h2 class=\"fw-title\">Categories</h2>\n");
      out.write("\t\t\t\t\t\t<ul class=\"category-menu\">\n");
      out.write("                                                \n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Tìm kiếm theo danh mục</a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"sub-menu\">\n");
      out.write("                                                                    ");

                                                                    ProductGet product = new ProductGet();
                                                                    CategoryGet category = new CategoryGet();
                                                                    
      out.write("\n");
      out.write("                                                                    ");
for (Category rs: category.getListCategory()) {
      out.write("\n");
      out.write("                                                                    <li><a href=\"CategoryServlet?method=get&categoryID=");
      out.print(rs.getCategoryID());
      out.write('"');
      out.write('>');
      out.print(rs.getCategoryName());
      out.write("<span>(");
      out.print(product.countProductByCategory(rs.getCategoryID()));
      out.write(")</span></a></li>\n");
      out.write("                                                                    ");
}
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("                                                        \n");
      out.write("                                                        <li><a href=\"#\">Tìm kiếm theo...</a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"sub-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Từ khóa<span>(34)</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Loại thực phẩm<span>(7)</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Giá tiền<span>(5)</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("                                               \n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"filter-widget mb-0\">\n");
      out.write("\t\t\t\t\t\t<h2 class=\"fw-title\">refine by</h2>\n");
      out.write("\t\t\t\t\t\t<div class=\"price-range-wrap\">\n");
      out.write("\t\t\t\t\t\t\t<h4>Price</h4>\n");
      out.write("                            <div class=\"price-range ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content\" data-min=\"10\" data-max=\"270\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"ui-slider-range ui-corner-all ui-widget-header\" style=\"left: 0%; width: 100%;\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t<span tabindex=\"0\" class=\"ui-slider-handle ui-corner-all ui-state-default\" style=\"left: 0%;\">\n");
      out.write("\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t<span tabindex=\"0\" class=\"ui-slider-handle ui-corner-all ui-state-default\" style=\"left: 100%;\">\n");
      out.write("\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"range-slider\">\n");
      out.write("                                <div class=\"price-input\">\n");
      out.write("                                    <input type=\"text\" id=\"minamount\">\n");
      out.write("                                    <input type=\"text\" id=\"maxamount\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"filter-widget mb-0\">\n");
      out.write("\t\t\t\t\t\t<h2 class=\"fw-title\">color by</h2>\n");
      out.write("\t\t\t\t\t\t<div class=\"fw-color-choose\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cs-item\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"cs\" id=\"gray-color\">\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"cs-gray\" for=\"gray-color\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>(3)</span>\n");
      out.write("\t\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cs-item\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"cs\" id=\"orange-color\">\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"cs-orange\" for=\"orange-color\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>(25)</span>\n");
      out.write("\t\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cs-item\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"cs\" id=\"yollow-color\">\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"cs-yollow\" for=\"yollow-color\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>(112)</span>\n");
      out.write("\t\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cs-item\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"cs\" id=\"green-color\">\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"cs-green\" for=\"green-color\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>(75)</span>\n");
      out.write("\t\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cs-item\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"cs\" id=\"purple-color\">\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"cs-purple\" for=\"purple-color\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>(9)</span>\n");
      out.write("\t\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cs-item\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"cs\" id=\"blue-color\" checked=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"cs-blue\" for=\"blue-color\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>(29)</span>\n");
      out.write("\t\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-lg-9  order-1 order-lg-2 mb-5 mb-lg-0\">\n");
      out.write("                                    <form class=\"row\" method=\"get\" action=\"category.jsp\" id=\"form1\">\n");
      out.write("                                            \n");
      out.write("                                        ");

                                        String rs = request.getParameter("rs");
                                        if (rs==null) {
                                            request.setAttribute("rs", null);
                                        } else {
                                            request.setAttribute("rs", rs);
                                        }
                                        
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"text-center w-100 pt-3\">\n");
      out.write("                                                    <button class=\"site-btn sb-line sb-dark\" type=\"submit\" value=\"submit\" name=\"rs\" method=\"get\" form=\"form1\">LOAD MORE</button>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<!-- Category section end -->\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rs != null ? listProducts : listProductCategories != null ? listProductCategories : listProductCharacter != null ? listProductCharacter : list6Products}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-sm-6\">\n");
          out.write("\t\t\t\t\t\t\t<div class=\"product-item\">\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"pi-pic\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<img src=\"./");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getProductImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"pi-links\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"CartServlet?method=get&command=plus&productID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getProductID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"add-card\"><i class=\"flaticon-bag\"></i><span>ADD TO CART</span></a>\n");
          out.write("                                                                                <a href=\"IndexServlet?method=get&productID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getProductID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"wishlist-btn\"><i class=\"flaticon-heart\"></i></a>\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"pi-text\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<h6>$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getProductPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h6>\n");
          out.write("\t\t\t\t\t\t\t\t\t<p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getProductName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("                                        ");
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
