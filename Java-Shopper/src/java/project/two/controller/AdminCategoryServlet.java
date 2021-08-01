
package project.two.controller;


import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import project.two.model.Category;
import project.two.utils.CategoryGet;



public class AdminCategoryServlet extends HttpServlet {
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String command = request.getParameter("command");
        CategoryGet categoryget = new CategoryGet();                
        Category c = new Category();


        switch (command) {
        
            case "view":
        {
            try {
                request.setAttribute("listCategories", categoryget.getListCategory());
                request.getServletContext().getRequestDispatcher("/admin/pages/category.jsp").forward(request, response);

            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(AdminCategoryServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
            case "insert": {
                request.getServletContext().getRequestDispatcher("/admin/pages/processcategory.jsp").forward(request, response);
            }
            
            case "edit": {
                request.setAttribute("categoryID", request.getParameter("categoryID"));
                request.getServletContext().getRequestDispatcher("/admin/pages/processcategory.jsp").forward(request, response);
            }
            
            case "delete":
        {
            try {
                categoryget.delete(Long.valueOf(request.getParameter("categoryID")));
                response.sendRedirect(request.getContextPath() + "/AdminCategoryServlet?method=get&command=view");
            } catch (SQLException ex) {
                Logger.getLogger(AdminCategoryServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AdminCategoryServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    
        response.setContentType("text/html;charset=UTF-8");
        String command = request.getParameter("command");
        CategoryGet categoryget = new CategoryGet();                
        Category category = new Category();


        switch (command) {
        
        case "insert":
        {
            try {
                category.setCategoryID(new java.util.Date().getTime());
                category.setCategoryName(request.getParameter("categoryname"));
                categoryget.insert(category);
                request.setAttribute("listCategories", categoryget.getListCategory());
                request.getServletContext().getRequestDispatcher("/admin/pages/category.jsp").forward(request, response);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(AdminCategoryServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            case "edit":
        {
            try {
                category.setCategoryID(Long.parseLong(request.getParameter("categoryID")));
                category.setCategoryName(request.getParameter("categoryname"));
                categoryget.update(category);
                request.setAttribute("listCategories", categoryget.getListCategory());
                request.getServletContext().getRequestDispatcher("/admin/pages/category.jsp").forward(request, response);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(AdminCategoryServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        }
        
    }

}