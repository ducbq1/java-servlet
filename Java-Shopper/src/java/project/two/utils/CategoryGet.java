
package project.two.utils;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import project.two.connect.MyConnection;
import project.two.model.Category;

public class CategoryGet {
    
    public ArrayList<Category> getListCategory() throws SQLException, ClassNotFoundException {
        Connection connection = MyConnection.getConnection();
        String sql = "select * from category";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Category> list = new ArrayList<>();
        while (rs.next()) {
            Category category = new Category();
            category.setCategoryID(rs.getLong("category_id"));
            category.setCategoryName(rs.getString("category_name"));
            list.add(category);
        }
        return list;
        
    }
    
    public Category getCategory(long categoryID) throws SQLException, ClassNotFoundException {
        Connection connection = MyConnection.getConnection();
        String sql = "select * from category where category_id = '" + categoryID + "'";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        Category category = new Category();
        while (rs.next()) {
            category.setCategoryID(rs.getLong("category_id"));
            category.setCategoryName(rs.getString("category_name"));
        }
        return category;
    }
    
    public boolean insert(Category c) throws SQLException, ClassNotFoundException {
        Connection connection = MyConnection.getConnection();
        String sql = "insert into category value(?, ?)";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setLong(1, c.getCategoryID());
        ps.setString(2, c.getCategoryName());
        return ps.executeUpdate() == 1;
    }
    
    public boolean update(Category c) throws SQLException, ClassNotFoundException {
        Connection connection = MyConnection.getConnection();
        String sql = "update category set category_name = ? where category_id = ?";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setString(1, c.getCategoryName());
        ps.setLong(2, c.getCategoryID());
        return ps.executeUpdate() == 1;
    }
    
    public boolean delete(long category_id) throws SQLException, ClassNotFoundException {
        Connection connection = MyConnection.getConnection();
        String sql = "delete from category where category_id = ?";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setLong(1, category_id);
        return ps.executeUpdate() == 1;
    }
}
