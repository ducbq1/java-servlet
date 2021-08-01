
package project.two.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import project.two.utils.ProductGet;

public class CategoryServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ProductGet product = new ProductGet();
        long categoryID = Long.parseLong(request.getParameter("categoryID"));
        try {
            request.setAttribute("listProductCategories", product.getListProductByCategory(categoryID));
            request.getRequestDispatcher("./category.jsp").forward(request, response);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CategoryServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

}
