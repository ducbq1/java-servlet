package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>ĐĂNG NHẬP - HUTECH ACOUSTIC SHOP</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Classic Style Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("\t\tfunction hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- //for-mobile-apps -->\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!-- js -->\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<!-- //js -->\n");
      out.write("<!-- cart -->\n");
      out.write("<script src=\"js/simpleCart.min.js\"></script>\n");
      out.write("<!-- cart -->\n");
      out.write("<!-- for bootstrap working -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap-3.1.1.min.js\"></script>\n");
      out.write("<!-- //for bootstrap working -->\n");
      out.write("<!-- animation-effect -->\n");
      out.write("<link href=\"css/animate.min.css\" rel=\"stylesheet\"> \n");
      out.write("<script src=\"js/wow.min.js\"></script>\n");
      out.write("<script>\n");
      out.write(" new WOW().init();\n");
      out.write("</script>\n");
      out.write("<!-- //animation-effect -->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Cabin:400,500,600,700' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Lato:400,100,300,700,900' rel='stylesheet' type='text/css'></head>\n");
      out.write("\t\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"banner-top\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<h2 class=\"animated wow fadeInLeft\" data-wow-delay=\".5s\">ĐĂNG NHẬP</h2>\n");
      out.write("\t\t<h3 class=\"animated wow fadeInRight\" data-wow-delay=\".5s\"><a href=\"index.html\">Trang Chủ</a><label>/</label>Đăng Nhập</h3>\n");
      out.write("\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        \t<div class=\"login\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("                    <form action=\"UserServlet\" method=\"POST\">\n");
      out.write("                    ");
if(request.getParameter("error")!=null){
      out.write("\n");
      out.write("                    <div>\n");
      out.write("                        <p style=\"color:red\">");
      out.print(request.getParameter("error"));
      out.write("</p>\n");
      out.write("                    </div>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("\t\t\t<div class=\"col-md-6 login-do1 animated wow fadeInLeft\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t<div class=\"login-mail\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" placeholder=\"Tên tài khoản\" name=\"name\" required>\n");
      out.write("\t\t\t\t\t<i class=\"glyphicon glyphicon-envelope\"></i>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"login-mail\">\n");
      out.write("\t\t\t\t\t<input type=\"password\" placeholder=\"Mật khẩu\" name=\"pass\" required>\n");
      out.write("\t\t\t\t\t<i class=\"glyphicon glyphicon-lock\"></i>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t   <a class=\"news-letter \" href=\"#\">\n");
      out.write("\t\t\t\t\t\t <label class=\"checkbox1\"><input type=\"checkbox\" name=\"checkbox\" ><i> </i>Quên mật khẩu ? (kệ bạn :v )</label>\n");
      out.write("\t\t\t\t\t   </a>\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-6 login-do animated wow fadeInRight\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t<label class=\"hvr-sweep-to-top login-sub\">\n");
      out.write("                                    <input type=\"hidden\" value=\"login\" name=\"command\">\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"Đăng nhập\">\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t<p>Bạn chưa có tài khoản ?</p>\n");
      out.write("\t\t\t\t<a href=\"register.jsp\" class=\"hvr-sweep-to-top\">Đăng ký</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("        \n");
      out.write("        <div class=\"social animated wow fadeInUp\" data-wow-delay=\".1s\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"col-sm-3 social-ic\">\n");
      out.write("\t\t\t<a href=\"#\">FACEBOOK</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-sm-3 social-ic\">\n");
      out.write("\t\t\t<a href=\"#\">TWITTER</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-sm-3 social-ic\">\n");
      out.write("\t\t\t<a href=\"#\">GOOGLE+</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-sm-3 social-ic\">\n");
      out.write("\t\t\t<a href=\"#\">PINTEREST</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t<div class=\"clearfix\"></div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
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
