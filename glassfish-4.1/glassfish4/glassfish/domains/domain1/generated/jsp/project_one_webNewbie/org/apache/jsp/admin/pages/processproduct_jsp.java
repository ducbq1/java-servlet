package org.apache.jsp.admin.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class processproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>Startmin - Bootstrap Admin Theme</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Core CSS -->\n");
      out.write("        <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- MetisMenu CSS -->\n");
      out.write("        <link href=\"../css/metisMenu.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link href=\"../css/startmin.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom Fonts -->\n");
      out.write("        <link href=\"../css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "_reUse.jsp", out, false);
      out.write("\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"page-wrapper\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-12\">\n");
      out.write("                            <h1 class=\"page-header\">Forms</h1>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.col-lg-12 -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.row -->\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-12\">\n");
      out.write("                            <div class=\"panel panel-default\">\n");
      out.write("                                <div class=\"panel-heading\">\n");
      out.write("                                    Basic Form Elements\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"panel-body\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-lg-6\">\n");
      out.write("                                            <form role=\"form\" method=\"post\" action=\"FileUploadServlet\" enctype=\"multipart/form-data\">\n");
      out.write("                                                \n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                        <label>Category</label>\n");
      out.write("                                                        <select class=\"form-control\" name=\"categoryID\">\n");
      out.write("                                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                        </select>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label>Product Name</label>\n");
      out.write("                                                    <input class=\"form-control\" placeholder=\"Enter text\" name=\"productname\" type=\"text\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label>Product Price</label>\n");
      out.write("                                                    <input class=\"form-control\" placeholder=\"Enter text\" name=\"productprice\" type=\"text\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label>Product Image</label>\n");
      out.write("                                                    <input type=\"file\" name=\"file\" id=\"file\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label>Destination</label>\n");
      out.write("                                                    <input class=\"form-control\" placeholder=\"Enter text\" type=\"text\" value=\"/home/dansharithm/NetBeansProjects/project_one_webNewbie/web/image\" name=\"destination\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label>Product Description</label>\n");
      out.write("                                                    <textarea class=\"form-control\" rows=\"3\" name=\"productdescription\" type=\"text\"></textarea>\n");
      out.write("                                                </div>\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-default\" value=\"Upload\" name=\"upload\" id=\"upload\">Submit Button</button>\n");
      out.write("\n");
      out.write("                                            </form>\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                        </div>\n");
      out.write("                                    <!-- /.row (nested) -->\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /.panel-body -->\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.panel -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.col-lg-12 -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.row -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /.container-fluid -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /#page-wrapper -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- /#wrapper -->\n");
      out.write("\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"../js/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Core JavaScript -->\n");
      out.write("        <script src=\"../js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Metis Menu Plugin JavaScript -->\n");
      out.write("        <script src=\"../js/metisMenu.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Custom Theme JavaScript -->\n");
      out.write("        <script src=\"../js/startmin.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
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
    _jspx_th_c_forEach_0.setVar("category");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCategories}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.getCategoryID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.getCategoryName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                                        ");
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
