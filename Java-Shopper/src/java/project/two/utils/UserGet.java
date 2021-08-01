
package project.two.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import project.two.connect.MyConnection;
import project.two.model.User;

public class UserGet {
    
    public ArrayList<User> getListUser() throws SQLException, ClassNotFoundException {
        Connection connection = MyConnection.getConnection();
        String sql = "select * from users";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<User> list = new ArrayList<>();
        while (rs.next()) {
            User user = new User();
            user.setUserID(rs.getLong("user_id"));
            user.setUserName(rs.getString("user_name"));
            user.setUserEmail(rs.getString("user_email"));
            user.setUserPass(rs.getString("user_pass"));
            user.setUserRole(rs.getBoolean("user_role"));
            list.add(user);
        }
        return list;
    }
    
    public User getUser(long userID) throws SQLException, ClassNotFoundException {
        Connection connection = MyConnection.getConnection();
        String sql = "select * from users where user_id = '" + userID + "'";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        User user = new User();
        while (rs.next()) {
            user.setUserID(rs.getLong("user_id"));
            user.setUserName(rs.getString("user_name"));
            user.setUserEmail(rs.getString("user_email"));
            user.setUserPass(rs.getString("user_pass"));
            user.setUserRole(rs.getBoolean("user_role"));
        }
        connection.close();
        return user;
    }
    
    public boolean checkName(String name) throws SQLException, ClassNotFoundException {
        Connection connection = MyConnection.getConnection();
        String sql = "select * from users where user_name = '" + name + "'";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            connection.close();
            return true;
        }
        return false;
    }
    
    public User loginUser(String name, String password) throws SQLException, ClassNotFoundException {
        Connection connection = MyConnection.getConnection();
        String sql = "select * from users where user_name = '" + name + "' and user_pass = '" + password + "'";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            User user = new User();
            user.setUserID(rs.getLong("user_id"));
            user.setUserName(rs.getString("user_name"));
            user.setUserPass(rs.getString("user_pass"));
            user.setUserEmail(rs.getString("user_email"));
            user.setUserRole(rs.getBoolean("user_role"));
            connection.close();
            return user;
        }
        return null;
    }
    
    public void insert(User user) throws SQLException, ClassNotFoundException {
        Connection connection = MyConnection.getConnection();
        String sql = "insert into users values(?, ?, ?, ?, ?)";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setLong(1, user.getUserID());
        ps.setString(2, user.getUserName());
        ps.setString(3, user.getUserEmail());
        ps.setString(4, user.getUserPass());
        ps.setBoolean(5, user.isUserRole());
        ps.executeUpdate();
    }
    
    public boolean update(User user) throws SQLException, ClassNotFoundException {
        Connection connection = MyConnection.getConnection();
        String sql = "update users set user_name = ?, user_email = ?, user_pass = ?, user_role = ? where user_id = ?";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setString(1, user.getUserName());
        ps.setString(2, user.getUserEmail());
        ps.setString(3, user.getUserPass());
        ps.setBoolean(4, user.isUserRole());
        ps.setLong(5, user.getUserID());
        return ps.executeUpdate() == 1;
    }
    
    public static void delete(long index) throws SQLException, ClassNotFoundException {
        Connection connection = MyConnection.getConnection();
        String sql = "delete from users where user_id = ?";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setLong(1, index);
        ps.executeUpdate();
    }
}
