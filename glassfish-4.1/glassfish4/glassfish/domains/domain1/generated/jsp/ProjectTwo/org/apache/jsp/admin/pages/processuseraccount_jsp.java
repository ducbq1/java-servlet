package org.apache.jsp.admin.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class processuseraccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                                            <form role=\"form\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/AdminUserAccountServlet\" method=\"post\">\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userID != null ? \"User ID\" : null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\n");
      out.write("                                                    <p class=\"form-control-static\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userID != null ? userID : null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                                    <input type=\"hidden\" name=\"userID\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userID != null ? userID : \"2\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label>User Name</label>\n");
      out.write("                                                    <input class=\"form-control\" placeholder=\"Enter text\" name=\"username\" type=\"text\">\n");
      out.write("                                                </div>\n");
      out.write("                                                 <div class=\"form-group\">\n");
      out.write("                                                    <label>User Email</label>\n");
      out.write("                                                    <input class=\"form-control\" placeholder=\"Enter text\"name=\"useremail\" type=\"text\">\n");
      out.write("                                                </div>\n");
      out.write("                                                 <div class=\"form-group\">\n");
      out.write("                                                    <label>User Password</label>\n");
      out.write("                                                    <input class=\"form-control\" placeholder=\"Enter text\" name=\"userpassword\" type=\"password\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label>User Role</label>\n");
      out.write("                                                    <div class=\"radio\">\n");
      out.write("                                                        <label>\n");
      out.write("                                                            <input type=\"radio\" name=\"optionsRadio\" id=\"optionsRadios1\" value=\"option1\" checked>Adminstrator\n");
      out.write("                                                        </label>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"radio\">\n");
      out.write("                                                        <label>\n");
      out.write("                                                            <input type=\"radio\" name=\"optionsRadio\" id=\"optionsRadios2\" value=\"option2\">Customer Common\n");
      out.write("                                                        </label>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-default\" name=\"command\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userID != null ? \"edit\" : \"add\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Submit Button</button>\n");
      out.write("\n");
      out.write("                                                \n");
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
}
