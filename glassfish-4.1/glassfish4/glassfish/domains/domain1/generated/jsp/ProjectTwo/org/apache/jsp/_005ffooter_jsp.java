package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _005ffooter_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <title>Footer</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <!-- Footer section -->\n");
      out.write("  <section class=\"footer-section\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"footer-logo text-center\">\n");
      out.write("        <a href=\"index.html\"></a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-3 col-sm-6\">\n");
      out.write("          <div class=\"footer-widget about-widget\">\n");
      out.write("            <h2>About</h2>\n");
      out.write("            <p>Donec vitae purus nunc. Morbi faucibus erat sit amet congue mattis. Nullam frin-gilla faucibus urna, id dapibus erat iaculis ut. Integer ac sem.</p>\n");
      out.write("            <img src=\"img/cards.png\" alt=\"\">\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-3 col-sm-6\">\n");
      out.write("          <div class=\"footer-widget about-widget\">\n");
      out.write("            <h2>Questions</h2>\n");
      out.write("            <ul>\n");
      out.write("              <li><a href=\"\">About Us</a></li>\n");
      out.write("              <li><a href=\"\">Track Orders</a></li>\n");
      out.write("              <li><a href=\"\">Returns</a></li>\n");
      out.write("              <li><a href=\"\">Jobs</a></li>\n");
      out.write("              <li><a href=\"\">Shipping</a></li>\n");
      out.write("              <li><a href=\"\">Blog</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <ul>\n");
      out.write("              <li><a href=\"\">Partners</a></li>\n");
      out.write("              <li><a href=\"\">Bloggers</a></li>\n");
      out.write("              <li><a href=\"\">Support</a></li>\n");
      out.write("              <li><a href=\"\">Terms of Use</a></li>\n");
      out.write("              <li><a href=\"\">Press</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-3 col-sm-6\">\n");
      out.write("          <div class=\"footer-widget about-widget\">\n");
      out.write("            <h2>Questions</h2>\n");
      out.write("            <div class=\"fw-latest-post-widget\">\n");
      out.write("              <div class=\"lp-item\">\n");
      out.write("                <div class=\"lp-thumb set-bg\" data-setbg=\"image/icon1.png\"></div>\n");
      out.write("                <div class=\"lp-content\">\n");
      out.write("                  <h6>what shoes to wear</h6>\n");
      out.write("                  <span>Oct 21, 2018</span>\n");
      out.write("                  <a href=\"#\" class=\"readmore\">Read More</a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"lp-item\">\n");
      out.write("                <div class=\"lp-thumb set-bg\" data-setbg=\"image/icon2.png\"></div>\n");
      out.write("                <div class=\"lp-content\">\n");
      out.write("                  <h6>trends this year</h6>\n");
      out.write("                  <span>Oct 21, 2018</span>\n");
      out.write("                  <a href=\"#\" class=\"readmore\">Read More</a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-3 col-sm-6\">\n");
      out.write("          <div class=\"footer-widget contact-widget\">\n");
      out.write("            <h2>Questions</h2>\n");
      out.write("            <div class=\"con-info\">\n");
      out.write("              <span>C.</span>\n");
      out.write("              <p>Your Company Ltd </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"con-info\">\n");
      out.write("              <span>B.</span>\n");
      out.write("              <p>1481 Creekside Lane Avila Beach, CA 93424, P.O. BOX 68 </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"con-info\">\n");
      out.write("              <span>T.</span>\n");
      out.write("              <p>+53 345 7953 32453</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"con-info\">\n");
      out.write("              <span>E.</span>\n");
      out.write("              <p>office@youremail.com</p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"social-links-warp\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"social-links\">\n");
      out.write("          <a href=\"\" class=\"instagram\"><i class=\"fa fa-instagram\"></i><span>instagram</span></a>\n");
      out.write("          <a href=\"\" class=\"google-plus\"><i class=\"fa fa-google-plus\"></i><span>g+plus</span></a>\n");
      out.write("          <a href=\"\" class=\"pinterest\"><i class=\"fa fa-pinterest\"></i><span>pinterest</span></a>\n");
      out.write("          <a href=\"\" class=\"facebook\"><i class=\"fa fa-facebook\"></i><span>facebook</span></a>\n");
      out.write("          <a href=\"\" class=\"twitter\"><i class=\"fa fa-twitter\"></i><span>twitter</span></a>\n");
      out.write("          <a href=\"\" class=\"youtube\"><i class=\"fa fa-youtube\"></i><span>youtube</span></a>\n");
      out.write("          <a href=\"\" class=\"tumblr\"><i class=\"fa fa-tumblr-square\"></i><span>tumblr</span></a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("        <p class=\"text-white text-center mt-5\">Copyright &copy;<script>\n");
      out.write("            document.write(new Date().getFullYear());\n");
      out.write("          </script> All rights reserved | This template is made with <i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a></p>\n");
      out.write("        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("  <!-- Footer section end -->\n");
      out.write("  \n");
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
}
