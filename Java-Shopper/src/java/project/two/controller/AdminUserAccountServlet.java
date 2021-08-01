
package project.two.controller;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import project.two.model.User;
import project.two.utils.UserGet;

public class AdminUserAccountServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        switch(request.getParameter("command")) {
        
            case "view":
            {
            UserGet user = new UserGet();
            try {
                request.setAttribute("listUsers", user.getListUser());
                request.getServletContext().getRequestDispatcher("/admin/pages/useraccount.jsp").forward(request, response);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(AdminUserAccountServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            case "delete": {
            try {
                UserGet.delete(Long.valueOf(request.getParameter("userID")));
                response.sendRedirect(request.getContextPath() + "/AdminUserAccountServlet?method=get&command=view");
                break;
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(AdminUserAccountServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            case "edit": {
            request.setAttribute("userID", Long.parseLong(request.getParameter("userID")));
            request.getServletContext().getRequestDispatcher("/admin/pages/processuseraccount.jsp").forward(request, response);
            break;
            }
            
            case "add": {
            request.getServletContext().getRequestDispatcher("/admin/pages/processuseraccount.jsp").forward(request, response);
            }
            
           
        
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
    
        switch (request.getParameter("command")) {
        
            case "add": {
                User user =  new User();
                UserGet userget  = new UserGet();
                user.setUserID(new java.util.Date().getTime());
                user.setUserName(request.getParameter("username"));
                user.setUserPass(encryption(request.getParameter("userpassword")));
                user.setUserEmail(request.getParameter("useremail"));
                user.setUserRole(request.getParameter("optionsRadio").equals("option1"));
            try {
                userget.insert(user);
                request.setAttribute("listUsers", userget.getListUser());
                request.getServletContext().getRequestDispatcher("/admin/pages/useraccount.jsp").forward(request, response);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(AdminUserAccountServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            case "edit": {
                User user = new User();
                UserGet userget = new UserGet();
                user.setUserID(Long.parseLong(request.getParameter("userID")));
                user.setUserName(request.getParameter("username"));
                user.setUserPass(encryption(request.getParameter("userpassword")));
                user.setUserEmail(request.getParameter("useremail"));
                user.setUserRole(request.getParameter("optionsRadio").equals("option1"));
            try {
                userget.update(user);
                request.setAttribute("listUsers", userget.getListUser());
                request.getServletContext().getRequestDispatcher("/admin/pages/useraccount.jsp").forward(request, response);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(AdminUserAccountServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            }
            
        }
        
    }
    
    public static String encryption(String str) {
        byte[] defaultBytes = str.getBytes();
        try {
            MessageDigest algorithm = MessageDigest.getInstance("MD5");
            algorithm.reset();
            algorithm.update(defaultBytes);
            byte messageDigest[] = algorithm.digest();
            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < messageDigest.length; i++) {
            String hex = Integer.toHexString(0xFF & messageDigest[i]);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        str = hexString + "";
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
            return str;
        }

}
