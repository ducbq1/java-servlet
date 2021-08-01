
package project.two.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import project.two.model.User;
import project.two.utils.BillDetailGet;
import project.two.utils.BillGet;

public class BillServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if (user != null) {
        
        BillGet bill = new BillGet();
        BillDetailGet billdetail = new BillDetailGet();
        try {
            request.setAttribute("bill", bill.getListBillByUser(user.getUserID()));
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BillServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.getRequestDispatcher("./bill.jsp").forward(request, response);
                
        } else {
            request.setAttribute("error", "Must login!");
            request.getRequestDispatcher("./login.jsp").forward(request, response);
        }
    }

 
}
