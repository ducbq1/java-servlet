
package project.two.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MyConnection {
    
    public static Connection getConnection()
            throws SQLException, ClassNotFoundException {
        
        String hostName = "localhost";
        String dbName = "projecttwo";
        String userName = "root";
        String password = "";
        
        return getConnection(hostName, dbName, userName, password);
    }
    
    public static Connection getConnection(String hostName, String dbName, String userName, String password)
            throws SQLException, ClassNotFoundException {
        
        Class.forName("com.mysql.jdbc.Driver");
        String connURL = "jdbc:mysql://" + hostName + ":3306/" + dbName + "?useSSL=false";
        Connection conn = DriverManager.getConnection(connURL, userName, password);
        return conn;
        
    }
    
}