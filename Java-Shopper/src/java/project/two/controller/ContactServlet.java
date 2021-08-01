
package project.two.controller;


import java.io.IOException;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import project.two.model.Contact;
import project.two.utils.ContactGet;

public class ContactServlet extends HttpServlet {
ContactGet contactGet = new ContactGet();
 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        
        String name = request.getParameter("name");
        String web = request.getParameter("web");
        String email = request.getParameter("email");
        String subject =  request.getParameter("subject");
        String message = request.getParameter("message");
        
    try {
        contactGet.insertContact(new Contact(new Date().getTime(), name, web, email, subject, message, new Timestamp(new Date().getTime())));
    } catch (SQLException | ClassNotFoundException ex) {
        Logger.getLogger(ContactServlet.class.getName()).log(Level.SEVERE, null, ex);
    }
        request.setAttribute("message", "Thanks for contact!");
        RequestDispatcher rd = request.getRequestDispatcher("about.jsp");
        rd.forward(request, response);

    }

}
