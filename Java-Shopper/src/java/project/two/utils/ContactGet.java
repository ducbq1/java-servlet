
package project.two.utils;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import project.two.connect.MyConnection;
import project.two.model.Contact;


public class ContactGet {
     
    public ArrayList<Contact> getListContact() throws SQLException, ClassNotFoundException {
        Connection connection = MyConnection.getConnection();
        String sql = "select * from contact";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Contact> list = new ArrayList<>();
        while (rs.next()) {
            Contact ct = new Contact();
            ct.setContactID(rs.getLong("contact_id"));
            ct.setContactName(rs.getString("contact_name"));
            ct.setContactWeb(rs.getString("contact_web"));
            ct.setContactEmail(rs.getString("contact_email"));
            ct.setContactTitle(rs.getString("contact_title"));
            ct.setContactMessage(rs.getString("contact_message"));
            ct.setDate(rs.getTimestamp("contact_date"));
            list.add(ct);
        }
        return list;
    }
    
    public boolean insertContact(Contact c) throws SQLException, ClassNotFoundException {
        Connection connection = MyConnection.getConnection();
        String sql = "insert into contact values(?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setLong(1, c.getContactID());
        ps.setString(2, c.getContactName());
        ps.setString(3, c.getContactWeb());
        ps.setString(4, c.getContactEmail());
        ps.setString(5, c.getContactTitle());
        ps.setString(6, c.getContactMessage());
        ps.setTimestamp(7, c.getDate());
        return ps.executeUpdate() == 1;
    }
}
