package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>content</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div id=\"rightContent\">\n");
      out.write("            <h3>Trang Quản Lý</h3>\n");
      out.write("            \n");
      out.write("            <div class=\"shortcutHome\">\n");
      out.write("                <a href=\"/MusicShop/admin/trangchu.jsp\"><img src=\"mos-css/Home.png\"><br>Trang Chủ</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"shortcutHome\">\n");
      out.write("                <a href=\"/MusicShop/admin/manager_category.jsp\"><img src=\"mos-css/Tag.png\"><br>Danh Mục</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"shortcutHome\">\n");
      out.write("                <a href=\"/MusicShop/admin/manager_brand.jsp\"><img src=\"mos-css/T-Shirt.png\"><br>Nhãn Hiệu</a>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("            <div class=\"shortcutHome\">\n");
      out.write("                <a href=\"/MusicShop/admin/manager_product.jsp\"><img src=\"mos-css/Database.png\"><br>Sản Phẩm</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"shortcutHome\">\n");
      out.write("                <a href=\"/MusicShop/admin/manager_bill.jsp\"><img src=\"mos-css/Shopping.png\"><br>Hóa Đơn</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"shortcutHome\">\n");
      out.write("                <a href=\"/MusicShop/admin/manager_user.jsp\"><img src=\"mos-css/User.png\"><br>Người Dùng</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"shortcutHome\">\n");
      out.write("                <a href=\"/MusicShop/admin/manager_contact.jsp\"><img src=\"mos-css/Mail3.png\"><br>Liên Hệ</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"shortcutHome\">\n");
      out.write("                <a href=\"/MusicShop/admin/manager_chart.jsp\"><img src=\"mos-css/Chart.png\"><br>Thống Kê</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("          \n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("        <div class=\"clear\"></div>\n");
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
