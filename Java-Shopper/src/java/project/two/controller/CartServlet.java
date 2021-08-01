
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
import project.two.model.Cart;
import project.two.model.Item;
import project.two.model.Product;
import project.two.utils.ProductGet;

public class CartServlet extends HttpServlet {
    
    private final ProductGet productGet = new ProductGet();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("user") != null) {
            
        String command = request.getParameter("command");
        String productID = request.getParameter("productID");
        Cart cart = (Cart) session.getAttribute("cart");
        if (cart == null) {
            cart = new Cart();
            session.setAttribute("cart", cart);
        }
        
        long idProduct = Long.parseLong(productID);
        Product product;
            try {
                product = productGet.getProduct(idProduct);
                switch (command) {
                case "plus":
                    
                    if (cart.getCartItems().containsKey(idProduct)) {
                        cart.plusToCart(idProduct, new Item(product, cart.getCartItems().get(idProduct).getQuantity()));
                    } else {
                        cart.plusToCart(idProduct, new Item(product, 1));
                        
                    }
                    break;
                
                case "numberplus":
                    int quantity = (int) Integer.parseInt(request.getParameter("quantity"));
                    if (cart.getCartItems().containsKey(idProduct)) {
                        cart.insertToCart(idProduct, new Item(product, cart.getCartItems().get(idProduct).getQuantity()), quantity);
                    } else {
                        cart.plusToCart(idProduct, new Item(product, quantity));
                    }
                    break;
                    
                case "remove":
                    cart.removeToCart(idProduct);
                    break;
                    
                default:
                    request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        
        session.setAttribute("cart", cart);
        request.getRequestDispatcher("cart.jsp").forward(request, response);
                
        } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(CartServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        
    } else {
            request.setAttribute("error", "Must login before ordering!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
    }
        
    }
}
