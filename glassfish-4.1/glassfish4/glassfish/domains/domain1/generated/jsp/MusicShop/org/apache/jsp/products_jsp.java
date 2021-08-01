package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import get.BrandGet;
import model.Brand;
import get.CategoryGet;
import model.Category;
import model.Product;
import get.ProductGet;

public final class products_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>SẢN PHẨM - HUTECH ACOUSTIC SHOP</title>\n");
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
      out.write("<link href='//fonts.googleapis.com/css?family=Lato:400,100,300,700,900' rel='stylesheet' type='text/css'>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 
            DecimalFormat formatter = new DecimalFormat("###,###,###");
        ProductGet productGet = new ProductGet();    
        BrandGet brandget = new BrandGet();
    String category_id = "";
    String brand_id = "";
    if(request.getParameter("category")!=null){
    category_id = request.getParameter("category");
    }
    if(request.getParameter("brand")!=null){
    brand_id = request.getParameter("brand");
    }
    CategoryGet categoryget = new CategoryGet();
    String category_id_1 = "1";
            
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("       <div class=\"banner-top\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<h2 class=\"animated wow fadeInLeft\" data-wow-delay=\".5s\">Sản Phẩm</h2>\n");
      out.write("\t\t<h3 class=\"animated wow fadeInRight\" data-wow-delay=\".5s\"><a href=\"index.html\">Trang Chủ</a><label>/</label>Sản Phẩm<label>/</label>Nhạc Cụ</h3>\n");
      out.write("\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        \t\t<div class=\"product\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 product-bottom\">\n");
      out.write("\t\t\t<!--categories-->\n");
      out.write("\t\t\t<div class=\"categories animated wow fadeInUp animated\" data-wow-delay=\".5s\" >\n");
      out.write("\t\t\t\t\t<h3>Loại Sản Phẩm</h3>\n");
      out.write("\t\t\t\t\t<ul class=\"cate\">\n");
      out.write("                                            ");

                       for (Category c : categoryget.getListCategory()) {
                                              
      out.write("\n");
      out.write("\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-menu-right\" ></i><a href=\"products.jsp?category=");
      out.print(c.getCategoryID());
      out.write('"');
      out.write('>');
      out.print(c.getCategoryName());
      out.write("</a></li>\t\n");
      out.write("\t\t\t\t\t ");
 } 
      out.write("\n");
      out.write("                                        </ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                                         <div class=\"categories animated wow fadeInUp animated\" data-wow-delay=\".5s\" >\n");
      out.write("\t\t\t\t\t<h3>Thương Hiệu</h3>\n");
      out.write("                                        \n");
      out.write("\t\t\t\t\t<ul class=\"cate\">\n");
      out.write("                                            ");

                       for (Brand b : brandget.getListBrand()) {
                                              
      out.write("\n");
      out.write("\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-menu-right\" ></i><a href=\"productbrand.jsp?brand=");
      out.print(b.getBrandID());
      out.write('"');
      out.write('>');
      out.print(b.getBrandName());
      out.write("</a></li>\t\n");
      out.write("\t\t\t\t\t ");
 } 
      out.write("\n");
      out.write("                                        </ul>\n");
      out.write("                                       \n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t<!--//menu-->\n");
      out.write("\t\t<!--price-->\n");
      out.write("\t\t\t\t<div class=\"price animated wow fadeInUp animated\" data-wow-delay=\".5s\" >\n");
      out.write("\t\t\t\t\t<h3>Khoảng Giá</h3>\n");
      out.write("\t\t\t\t\t<div class=\"price-head\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 price-head1\">\n");
      out.write("                                        <div class=\"price-top1\">\n");
      out.write("                                            <span class=\"price-top\">$</span>\n");
      out.write("                                            <input type=\"text\"  value=\"0\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-6 price-head2\">\n");
      out.write("                                        <div class=\"price-top1\">\n");
      out.write("                                            <span class=\"price-top\">$</span>\n");
      out.write("                                            <input type=\"text\"  value=\"500\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    </div>\n");
      out.write("\t\t\t<!--//price-->\n");
      out.write("\t\t\t<!--colors-->\n");
      out.write("\t\t\t<div class=\"colors animated wow fadeInLeft animated\" data-wow-delay=\".5s\" >\n");
      out.write("\t\t\t\t\t<h3>Màu Sắc</h3>\n");
      out.write("\n");
      out.write("                                        <div class=\"color-top\">\n");
      out.write("                                            <ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"color1\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"color2\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"color3\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"color4\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"color5\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"color6\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"color7\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("                                 \n");
      out.write("\t\t\t<!--//colors-->\n");
      out.write("\t\t\t<div class=\"sellers animated wow fadeInUp\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"best\">Bán Chạy Nhất</h3>\n");
      out.write("\t\t\t\t\t<div class=\"product-head\">\n");
      out.write("                                            ");

                                for (Product p : productGet.getList3ProductByCategory(Long.parseLong(category_id_1))) {
                                
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"product-go\">\n");
      out.write("\t\t\t\t\t\t<div class=\" fashion-grid\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write("\"><img class=\"img-responsive \" src=\"");
      out.print(p.getProductImageForward());
      out.write("\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\" fashion-grid1\">\n");
      out.write("\t\t\t\t\t\t\t\t<h6 class=\"best2\"><a href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write('"');
      out.write('>');
      out.print(p.getProductName());
      out.write("</a></h6>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\" price-in1\">");
      out.print(formatter.format(p.getProductPrice()));
      out.write(" VNĐ</span>\n");
      out.write("\t\t\t\t\t\t\t\t<p><a href=\"CartServlet?command=plus&productID=");
      out.print(p.getProductID());
      out.write("\" data-text=\"Thêm vào giỏ\" class=\"but-hover1 item_add\">Thêm vào giỏ</a></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                ");
 } 
      out.write("\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!---->\n");
      out.write(" \t</div>\n");
      out.write("                    \n");
      out.write("                            \n");
      out.write("\t\t\t<div class=\"col-md-9 animated wow fadeInRight\" data-wow-delay=\".5s\">  \n");
      out.write("\n");
      out.write("\t\t\t<div class=\"mid-popular\">\n");
      out.write("                            \n");
      out.write("                             ");

                                for (Product p : productGet.getListProductByCategory(Long.parseLong(category_id))) {
                                
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-sm-4 item-grid item-gr  simpleCart_shelfItem\">\n");
      out.write("                                    \n");
      out.write("\t\t\t\t\t\t\t<div class=\"grid-pro\">\n");
      out.write("\t\t\t\t\t\t\t\t<div  class=\" grid-product \" >\n");
      out.write("\t\t\t\t\t\t\t\t\t<figure>\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"grid-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img  src=\"");
      out.print(p.getProductImageBack());
      out.write("\" class=\"img-responsive\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"grid-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img  src=\"");
      out.print(p.getProductImageForward());
      out.write("\" class=\"img-responsive\"  alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</figure>\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"women\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<h6><a href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write('"');
      out.write('>');
      out.print(p.getProductName());
      out.write("</a></h6>\n");
      out.write("                                                                        <p ><em class=\"item_price\">");
      out.print(formatter.format(p.getProductPrice()));
      out.write(" VNĐ</em></p>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("                                                                        <a href=\"CartServlet?command=plus&productID=");
      out.print(p.getProductID());
      out.write("\" data-text=\"Thêm vào giỏ\" class=\"but-hover1 item_add\">Thêm vào giỏ</a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");

                                    }
                                    
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("                                \n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t<div class=\"social animated wow fadeInUp\" data-wow-delay=\".1s\">\n");
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
      out.write("        <div class=\"clearfix\"></div>\n");
      out.write("\t</div>\n");
      out.write("                            </div>\n");
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
