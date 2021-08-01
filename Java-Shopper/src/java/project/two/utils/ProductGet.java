
package project.two.utils;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import project.two.connect.MyConnection;
import project.two.model.Product;




public class ProductGet {
    
    public ArrayList<Product> getListLimitProduct(long categoryID, int first, int second) throws SQLException, ClassNotFoundException {
        Connection connection = MyConnection.getConnection();
        String sql = "select * from product where category_id = '" + categoryID + "' limit ?, ?";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setInt(1, first);
        ps.setInt(2, second);
        ResultSet rs = ps.executeQuery();
        ArrayList<Product> list = new ArrayList<>();
        while (rs.next()) {
            Product product = new Product();
            product.setProductID(rs.getLong("product_id"));
            product.setProductName(rs.getString("product_name"));
            product.setProductImage(rs.getString("product_image"));
            product.setProductPrice(rs.getLong("product_price"));
            product.setProductDescription(rs.getString("product_description"));
            list.add(product);
        }
        return list;
    }

    public int countProductByCategory(long categoryID) throws SQLException, ClassNotFoundException {
        Connection connection = MyConnection.getConnection();
        String sql = "select count(product_id) from product where category_id = '" + categoryID + "' group by '" + categoryID + "'";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        int count = 0;
        while (rs.next()) {
            count = rs.getInt(1);
        }   
        return count;
    }
    
    public ArrayList<Product> getListProductByCategory(long category_id) throws SQLException, ClassNotFoundException {
        Connection connection = MyConnection.getConnection();
        String sql = "select * from product where category_id = '" + category_id + "'";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Product> list = new ArrayList<>();
        while (rs.next()) {
            Product product = new Product();
            product.setProductID(rs.getLong("product_id"));
            product.setProductName(rs.getString("product_name"));
            product.setProductImage(rs.getString("product_image"));
            product.setProductPrice(rs.getLong("product_price"));
            product.setProductDescription(rs.getString("product_description"));
            list.add(product);
        }
        return list;
        
    }
    
    public ArrayList<Product> getListLimitProductByCategory(long category_id, int index) throws SQLException, ClassNotFoundException {
        Connection connection = MyConnection.getConnection();
        String sql = "select * from product where category_id = '" + category_id + "' limit " + index;

        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Product> list = new ArrayList<>();
        while (rs.next()) {
            Product product = new Product();
            product.setProductID(rs.getLong("product_id"));
            product.setProductName(rs.getString("product_name"));
            product.setProductImage(rs.getString("product_image"));
            product.setProductPrice((rs.getLong("product_price")));
            product.setProductDescription(rs.getString("product_description"));
            list.add(product);
        }
        return list;
    }
    
    public ArrayList<Product> getListProductByCharacter(String index) throws SQLException, ClassNotFoundException {
        Connection connection = MyConnection.getConnection();
        String sql = "select * from product where (product_name like '%" + index + "%')";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Product> list = new ArrayList<>();
        while (rs.next()) {
            Product product = new Product();
            product.setProductID(rs.getLong("product_id"));
            product.setProductName(rs.getString("product_name"));
            product.setProductImage(rs.getString("product_image"));
            product.setProductPrice(rs.getLong("product_price"));
            product.setProductDescription(rs.getString("product_description"));
            list.add(product);
        }
        return list;
    }
    
    public ArrayList<Product> getListProduct() throws SQLException, ClassNotFoundException {
        Connection connection = MyConnection.getConnection();
        String sql = "select * from product";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Product> list = new ArrayList<>();
        while (rs.next()) {
            Product product = new Product();
            product.setProductID(rs.getLong("product_id"));
            product.setCategoryID(rs.getLong("category_id"));
            product.setProductName(rs.getString("product_name"));
            product.setProductImage(rs.getString("product_image"));
            product.setProductPrice(rs.getLong("product_price"));
            product.setProductDescription(rs.getString("product_description"));
            list.add(product);
        }
        return list;
    }
    
    public Product getProduct(long productID) throws SQLException, ClassNotFoundException {
        Connection connection = MyConnection.getConnection();
        String sql = "select * from product where product_id = '" + productID + "'";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        Product product = new Product();
        while (rs.next()) {
            product.setProductID(rs.getLong("product_id"));
            product.setCategoryID(rs.getLong("category_id"));
            product.setProductName(rs.getString("product_name"));
            product.setProductImage(rs.getString("product_image"));
            product.setProductPrice(rs.getLong("product_price"));
            product.setProductDescription(rs.getString("product_description"));
        }
        return product;
    }
    
    public Product getRandomProduct() throws SQLException, ClassNotFoundException {
        Connection connection = MyConnection.getConnection();
        String sql = "select * from product order by rand() limit 1";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        Product product = new Product();
        while (rs.next()) {
            product.setProductID(rs.getLong("product_id"));
            product.setCategoryID(rs.getLong("category_id"));
            product.setProductName(rs.getString("product_name"));
            product.setProductImage(rs.getString("product_image"));
            product.setProductPrice(rs.getLong("product_price"));
            product.setProductDescription(rs.getString("product_description"));
        }
        return product;
    }
    
    public boolean insert(Product c) throws SQLException, ClassNotFoundException {
        Connection connection = MyConnection.getConnection();
        String sql = "insert into product value(?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setLong(1, c.getProductID());
        ps.setLong(2, c.getCategoryID());
        ps.setString(3, c.getProductName());
        ps.setString(4, c.getProductImage());
        ps.setLong(5, c.getProductPrice());
        ps.setString(6, c.getProductDescription());
        return ps.executeUpdate() == 1;
        
    }
    
    public boolean update(Product c) throws SQLException, ClassNotFoundException {
        Connection connection = MyConnection.getConnection();
        String sql = "update product set product_name = ? where product_id = ?";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setLong(1, c.getProductID());
        ps.setLong(2, c.getCategoryID());
        ps.setString(3, c.getProductName());
        ps.setString(4, c.getProductImage());
        ps.setLong(5, c.getProductPrice());
        ps.setString(6, c.getProductDescription());
        return ps.executeUpdate() == 1;
    }
    
    public boolean delete(long product_id) throws SQLException, ClassNotFoundException {
        Connection connection = MyConnection.getConnection();
        String sql = "delete from product where product_id = ?";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setLong(1, product_id);
        return ps.executeUpdate() == 1;
    }
    
    
}
    
   
