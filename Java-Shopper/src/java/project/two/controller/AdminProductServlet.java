
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

public class AdminProductServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ProductGet product = new ProductGet();
        String command = request.getParameter("command");
        switch(command) {
            
            case "view":
            {
            try {
                request.setAttribute("listProducts", product.getListProduct());
                request.getServletContext().getRequestDispatcher("/admin/pages/product.jsp").forward(request, response);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(AdminProductServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            case "delete":
        {
            try {
                long index = Long.parseLong(request.getParameter("productID"));
                product.delete(index);
                response.sendRedirect(request.getContextPath() + "AdminProductServlet?method=get&command=view");
            } catch (SQLException ex) {
                Logger.getLogger(AdminProductServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AdminProductServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
        }
        }
        
    }

   

}
