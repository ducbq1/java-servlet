
package project.two.utils;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import project.two.connect.MyConnection;
import project.two.model.BillDetail;



public class BillDetailGet {
    
    public void insertBillDetail(BillDetail bd) throws SQLException, ClassNotFoundException {
        Connection connection = MyConnection.getConnection();
        String sql = "insert into bill_detail values(?, ?, ?, ?, ?)";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setLong(1, bd.getBillDetailID());
        ps.setLong(2, bd.getBillID());
        ps.setLong(3, bd.getProductID());
        ps.setDouble(4, bd.getPrice());
        ps.setInt(5, bd.getQuantity());
        ps.executeUpdate();
    }
}
