package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/jspf/header.jsp");
    _jspx_dependants.add("/WEB-INF/jspf/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"menu/css/simple_menu.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/nivo-slider.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"boxes/css/style6.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"js/fancybox/jquery.fancybox.css\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div id=\"site_title\">\n");
      out.write("                <img src=\"img/logo.png\" alt=\"\"> <br />\n");
      out.write("            </div>\n");
      out.write("            <ol id=\"menu\">\n");
      out.write("                <li class=\"active_menu_item\"><a href=\"#\" style=\"color:#FFF\">Home</a></li>\n");
      out.write("                <li><a href=\"#\">Category</a></li>\n");
      out.write("                <ol>\n");
      out.write("                    <li><a href=\"#\">Mac</a>\n");
      out.write("                        <ol>\n");
      out.write("                            <li><a href=\"#\">iMac</a></li>\n");
      out.write("                            <li><a href=\"#\">Mac Pro</a></li>\n");
      out.write("                            <li><a href=\"#\">MacBook Air</a></li>\n");
      out.write("                            <li><a href=\"#\">MacBook Pro</a></li>\n");
      out.write("                        </ol>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li><a href=\"#\">iPad</a></li>\n");
      out.write("                    <li><a href=\"#\">iPhone</a></li>\n");
      out.write("                    <li><a href=\"#\">Accessories</a></li>\n");
      out.write("                </ol>\n");
      out.write("            </ol>\n");
      out.write("        </div>\n");
      out.write("  ");
      out.write("<div id=\"container\">\n");
      out.write("    <div id=\"prod_wrapper\">\n");
      out.write("        <div id=\"panes\">\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <br clear=\"all\">\n");
      out.write("        \n");
      out.write("        <div id=\"prod_nav\">\n");
      out.write("            <ul>\n");
      out.write("                ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("              \n");
      out.write("                <div style=\"clear: both\"></div>\n");
      out.write("                <div class=\"one-fourth\">\n");
      out.write("                    <div class=\"heading_bg\">\n");
      out.write("                        <h2>Mac</h2>\n");
      out.write("                    </div>\n");
      out.write("                    <img src=\"img/demo/4.jpg\" width=\"217\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"one-fourth\">\n");
      out.write("                    <div class=\"heading_bg\">\n");
      out.write("                        <h2>iPad</h2>\n");
      out.write("                    </div>\n");
      out.write("                    <img src=\"img/demo/6.jpg\" width=\"217\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"one-fourth\">\n");
      out.write("                    <div class=\"heading_bg\">\n");
      out.write("                        <h2>iPhone</h2>\n");
      out.write("                    </div>\n");
      out.write("                    <img src=\"img/demo/3.jpg\" width=\"217\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"one-fourth last\">\n");
      out.write("                    <div class=\"heading_bg\">\n");
      out.write("                        <h2>Accessories</h2>\n");
      out.write("                    </div>\n");
      out.write("                    <img src=\"img/demo/1.jpg\" width=\"217\" alt=\"\">\n");
      out.write("                    <div style=\"clear: both; height: 40px\"></div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("</div>");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"footer\">\n");
      out.write("    <div class=\"one-fourth\">\n");
      out.write("        <h3>Customers' Services</h3>\n");
      out.write("        <ul class=\"footer_links\">\n");
      out.write("            <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("<div class=\"one-fourth\">\n");
      out.write("    <h3>Adminstrator</h3>\n");
      out.write("    <ul class=\"footer_links\">\n");
      out.write("        <li><a href=\"#\">Login</a></li>\n");
      out.write("    </ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"one-fourth\">\n");
      out.write("    <h3>Information</h3>\n");
      out.write("    For online shopping Apple's products.\n");
      out.write("    <div id=\"social_icons\">Theme by <a href=\"http://www.csstemplateheaven.com\">CssTemplateHeaven</a><br />\n");
      out.write("        Photo @ <a href=\"http://dieterschenider.net\">Dieter Scheneider</a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"one-fourth last\">\n");
      out.write("    <h3>Socialize</h3>\n");
      out.write("    <img src=\"img/icon_fb.png\" alt=\"\">\n");
      out.write("    <img src=\"img/icon_twitter.png\" alt=\"\">\n");
      out.write("    <img src=\"img/icon_in.png\" alt=\"\">\n");
      out.write("    <div style=\"clear: both\"></div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
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
          out.write("                <div>\n");
          out.write("                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${initParam.imgProductPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" />\n");
          out.write("                    <h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\n");
          out.write("                    <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getDescription()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                    <p style=\"text-align: right; margin-right: 16px\">\n");
          out.write("                        <a href=\"#\" class=\"button\">More Info</a>\n");
          out.write("                        <a href=\"#\" class=\"button\">Buy Now</a>\n");
          out.write("                    </p>\n");
          out.write("                </div>\n");
          out.write("            ");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("countProduct");
    _jspx_th_c_set_0.setScope("request");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
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
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${newProducts}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <li>\n");
          out.write("                        <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${countProducts}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${initParam.imgProductPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getThumbImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("                            <strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong> $ ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                        </a>\n");
          out.write("                    </li>\n");
          out.write("                    ");
          if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("                ");
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

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_set_1.setVar("countProduct");
    _jspx_th_c_set_1.setScope("request");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${countProduct + 1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }
}
