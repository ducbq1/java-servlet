
package project.two.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import project.two.model.Cart;
import project.two.utils.CategoryGet;
import project.two.utils.ProductGet;


@WebServlet(name = "IndexServlet", urlPatterns = {"/IndexServlet"}, loadOnStartup = 1)
public class IndexServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param servletConfig
     * @throws ServletException if a servlet-specific error occurs
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
    
        super.init(servletConfig);
        ProductGet product = new ProductGet();
        CategoryGet category = new CategoryGet();
        Cart cart = new Cart();
        Random rd = new Random();
        int number = rd.nextInt(5);
        try {
            getServletContext().setAttribute("list6Products", product.getListLimitProductByCategory(number, 6));
            getServletContext().setAttribute("list8Products", product.getListLimitProduct(3, 0, 8));
            getServletContext().setAttribute("listProducts", product.getListProduct());
            getServletContext().setAttribute("listCategories", category.getListCategory());
            getServletContext().setAttribute("randomProduct", product.getRandomProduct());
            getServletContext().setAttribute("randomCategory", category.getCategory(product.getRandomProduct().getCategoryID()));
            getServletContext().setAttribute("countCart", cart.countItem());
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(IndexServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String productIDstr = (String) request.getParameter("productID");
            long productID = Long.parseLong(productIDstr);
            ProductGet product = new ProductGet();
            CategoryGet category = new CategoryGet();
        try {
            request.setAttribute("products", product.getProduct(productID));
            request.setAttribute("categories", category.getCategory(product.getProduct(productID).getCategoryID()));
            request.getRequestDispatcher("product.jsp").forward(request, response);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(IndexServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }

    
    
}
