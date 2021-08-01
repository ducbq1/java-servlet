package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class orderView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\t<meta name=\"description\" content=\"\">\n");
      out.write("\t<meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("\t<title>Drink management</title>\n");
      out.write("\n");
      out.write("\t<!-- Bootstrap core CSS -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("\t<!-- Custom styles for this template -->\n");
      out.write("\t<link href=\"/WEB-INF/views/css/heroic-features.css\" rel=\"stylesheet\">\n");
      out.write("\t<style>\n");
      out.write("\t\t@import \"https://fonts.googleapis.com/css?family=Montserrat:300,400,700\";\n");
      out.write("\n");
      out.write("\t\t.rwd-table {\n");
      out.write("\t\t\tmargin: 1em 0;\n");
      out.write("\t\t\tmin-width: 300px;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.rwd-table tr {\n");
      out.write("\t\t\tborder-top: 1px solid #ddd;\n");
      out.write("\t\t\tborder-bottom: 1px solid #ddd;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.rwd-table th {\n");
      out.write("\t\t\tdisplay: none;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.rwd-table td {\n");
      out.write("\t\t\tdisplay: block;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.rwd-table td:first-child {\n");
      out.write("\t\t\tpadding-top: 0.5em;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.rwd-table td:last-child {\n");
      out.write("\t\t\tpadding-bottom: 0.5em;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.rwd-table td:before {\n");
      out.write("\t\t\tcontent: attr(data-th) \": \";\n");
      out.write("\t\t\tfont-weight: bold;\n");
      out.write("\t\t\twidth: 6.5em;\n");
      out.write("\t\t\tdisplay: inline-block;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t@media (min-width: 480px) {\n");
      out.write("\t\t\t.rwd-table td:before {\n");
      out.write("\t\t\t\tdisplay: none;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.rwd-table td,\n");
      out.write("\t\t.rwd-table th {\n");
      out.write("\t\t\ttext-align: left;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t@media (min-width: 480px) {\n");
      out.write("\n");
      out.write("\t\t\t.rwd-table td,\n");
      out.write("\t\t\t.rwd-table th {\n");
      out.write("\t\t\t\tdisplay: table-cell;\n");
      out.write("\t\t\t\tpadding: 0.25em 0.5em;\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t.rwd-table td:first-child,\n");
      out.write("\t\t\t.rwd-table th:first-child {\n");
      out.write("\t\t\t\tpadding-left: 0;\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t.rwd-table td:last-child,\n");
      out.write("\t\t\t.rwd-table th:last-child {\n");
      out.write("\t\t\t\tpadding-right: 0;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tbody {\n");
      out.write("\t\t\tpadding: 88px 2em 0;\n");
      out.write("\t\t\tfont-family: Montserrat, sans-serif;\n");
      out.write("\t\t\t-webkit-font-smoothing: antialiased;\n");
      out.write("\t\t\ttext-rendering: optimizeLegibility;\n");
      out.write("\t\t\tcolor: #444;\n");
      out.write("\t\t\tbackground: #eee;\n");
      out.write("\t\t\tmin-height: 100vh;\n");
      out.write("\t\t\tbackground-image: linear-gradient(120deg, #3498db, #8e44ad);\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\th1 {\n");
      out.write("\t\t\tfont-weight: normal;\n");
      out.write("\t\t\tletter-spacing: -1px;\n");
      out.write("\t\t\tcolor: white;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.rwd-table {\n");
      out.write("\t\t\tbackground: #34495E;\n");
      out.write("\t\t\tcolor: #fff;\n");
      out.write("\t\t\tborder-radius: 0.4em;\n");
      out.write("\t\t\toverflow: hidden;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.rwd-table tr {\n");
      out.write("\t\t\tborder-color: #46637f;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.rwd-table td,\n");
      out.write("\t\t.rwd-table th {\n");
      out.write("\t\t\tmargin: 0.5em 1em;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t@media (min-width: 480px) {\n");
      out.write("\n");
      out.write("\t\t\t.rwd-table td,\n");
      out.write("\t\t\t.rwd-table th {\n");
      out.write("\t\t\t\tpadding: 1em !important;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.rwd-table td:before,\n");
      out.write("\t\t.rwd-table th {\n");
      out.write("\t\t\tcolor: #dd5;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.bd-placeholder-img {\n");
      out.write("\t\t\tfont-size: 1.125rem;\n");
      out.write("\t\t\ttext-anchor: middle;\n");
      out.write("\t\t\t-webkit-user-select: none;\n");
      out.write("\t\t\t-moz-user-select: none;\n");
      out.write("\t\t\t-ms-user-select: none;\n");
      out.write("\t\t\tuser-select: none;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t@media (min-width: 768px) {\n");
      out.write("\t\t\t.bd-placeholder-img-lg {\n");
      out.write("\t\t\t\tfont-size: 3.5rem;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.bs-example {\n");
      out.write("\t\t\tmargin: 20px;\n");
      out.write("\t\t}\n");
      out.write("\t</style>\n");
      out.write("\t<script>\n");
      out.write("\t\twindow.console = window.console || function(t) {};\n");
      out.write("\t</script>\n");
      out.write("\t<script>\n");
      out.write("\t\tif (document.location.search.match(/type=embed/gi)) {\n");
      out.write("\t\t\twindow.parent.postMessage(\"resize\", \"*\");\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<!-- Navigation -->\n");
      out.write("\t<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark fixed-top\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"#\">Start Bootstrap</a>\n");
      out.write("\t\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("\t\t\t\t<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav ml-auto\">\n");
      out.write("\t\t\t\t\t<li class=\"nav-item active\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/HomeServlet\">Home\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sr-only\">(current)</span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/OrderServlet\">Order</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/ProductListServlet\">Drink list</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/ManagerTask\">Manager task</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/UserInforServlet\">About</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"nav-item dropdown\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("\t\t\t\t\t\t\tSign in\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("\t\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/LoginServlet\">Log in</a>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"SignupServlet\">Sign up</a>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"dropdown-divider\"></div>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/LogoutServlet\">Log out</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\n");
      out.write("\t<!-- Page Content -->\n");
      out.write("\t<div class=\"container\" align=\"center\">\n");
      out.write("\n");
      out.write("\t\t<h1>LIST ORDER</h1>\n");
      out.write("\t\t\n");
      out.write("\t\t<table class=\"rwd-table\" align=\"center\">\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<th>ID</th>\n");
      out.write("\t\t\t\t<th>CODE</th>\n");
      out.write("\t\t\t\t<th>QUANTITY</th>\n");
      out.write("\t\t\t\t<th>CUSTOMER_NAME</th>\n");
      out.write("\t\t\t\t<th>ADDRESS</th>\n");
      out.write("                                <th>REJECT</th>\n");
      out.write("\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                <tr><td><a href=\"CreateOrderServlet\">Order Now</td></a></tr>\n");
      out.write("\t\t</table>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<!-- /.container -->\n");
      out.write("\n");
      out.write("\t<!-- Footer <footer class=\"py-5 bg-dark\"> <div class=\"container\"> <p class=\"m-0 text-center text-white\">Copyright &copy; Your Website 2019</p> </div> /.container </footer>-->\n");
      out.write("\n");
      out.write("\t<!-- Bootstrap core JavaScript -->\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("\t<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orderList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("order");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.order_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.code}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.customer_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td><a href=\"DeleteOrderServlet?order_id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.order_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Submit</a></td>\n");
          out.write("\t\t\t\t</tr>\n");
          out.write("\t\t\t");
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
