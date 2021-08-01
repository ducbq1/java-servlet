
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
import javax.servlet.http.HttpSession;
import project.two.model.Cart;
import project.two.model.User;
import project.two.utils.UserGet;

public class UserServlet extends HttpServlet {

  UserGet userGet = new UserGet();
  Cart cart = new Cart();

    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            HttpSession session = request.getSession();
            Object sessioncart = session.getAttribute("cart");
            Object sessionuser = session.getAttribute("user");
            if (sessionuser == null) {
                response.sendRedirect(request.getContextPath() + "/");
            } else if (request.getParameter("command") != null || session.getAttribute("cart") == null) {
                
                    session.removeAttribute("user");
                    session.removeAttribute("cart");
                    request.setAttribute("error", "Logout successful!");
                    request.getRequestDispatcher("./login.jsp").forward(request, response);
                
            } else {
                request.setAttribute("command", "forceExit");
                request.setAttribute("exitMessage", "Force to exit?");
                request.getRequestDispatcher("./about.jsp").forward(request, response);
            }
    }
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String command = request.getParameter("command");
        
        
        String url = "";
        User users = new User();
        HttpSession session = request.getSession();
        
        switch (command) {
            
            case "Register":
                String email = request.getParameter("email");
                String pass = encryption(request.getParameter("pass"));
                int str1 = email.indexOf("@");
                String name = email.substring(0, str1);
                
        {
            try {
                if (userGet.checkName(name)) {
                    request.setAttribute("error", "User exist!");
                    request.getRequestDispatcher("register.jsp").forward(request, response);
                } else {
                    users.setUserID(new java.util.Date().getTime());
                    users.setUserName(name);
                    users.setUserEmail(email);    
                    users.setUserPass(pass);
                    users.setUserRole(false);
                    userGet.insert(users);
                    request.setAttribute("error", "Register successful!");
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(UserServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                
                break;
              
            
            case "Update":
                String email2 = request.getParameter("email");
                String pass2 = encryption(request.getParameter("pass"));
                int str2 = email2.indexOf("@");
                String name2 = email2.substring(0, str2);
                User user = (User) session.getAttribute("user");
                
                if (user != null) {
                
            {
                try {
                    if (userGet.checkName(name2)) {
                        request.setAttribute("error", "User exist!");
                        request.getRequestDispatcher("logedit.jsp").forward(request, response);
                    } else {
                        
                        users.setUserID(user.getUserID());
                        users.setUserName(name2);
                        users.setUserEmail(email2);    
                        users.setUserPass(pass2);
                        users.setUserRole(false);
                        userGet.update(users);
                        request.setAttribute("error", "Update successful!");
                        session.removeAttribute("user");
                        request.getRequestDispatcher("login.jsp").forward(request, response);
                    }
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(UserServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                } else {
                    request.setAttribute("error", "Must login!");
//                  response.sendRedirect("login.jsp");
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                }

                    break;
            
              
                  
            case "Login":
        {                
            try {
                users = userGet.loginUser(request.getParameter("name"), encryption((request.getParameter("pass"))));
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(UserServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                if (users != null) {
                    if (users.isUserRole()) {
                    session.setAttribute("user", users);
                    request.getRequestDispatcher("/admin/index.jsp").forward(request, response);
                    } else {
                    session.setAttribute("user", users);
                    request.getRequestDispatcher("product.jsp").forward(request, response);
                    }
                } else {
                    request.setAttribute("error", "Error account or password");
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                    }
                break;
                
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
