
package project.two.utils;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import project.two.connect.MyConnection;
import project.two.model.Bill;



public class BillGet {
    
    public void insertBill(Bill bill) throws SQLException, ClassNotFoundException {
        Connection connection = MyConnection.getConnection();
        String sql = "insert into bill values(?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setLong(1, bill.getBillID());
        ps.setLong(2, bill.getUserID());
        ps.setLong(3, bill.getTotal());
        ps.setString(4, bill.getPayment());
        ps.setString(5, bill.getAddress());
        ps.setTimestamp(6, bill.getDate());
        ps.setString(7, bill.getName());
        ps.setString(8, bill.getPhone());
        ps.executeUpdate();
    }
    
    public ArrayList<Bill> getListBill() throws ClassNotFoundException, SQLException {
       
            Connection connection = MyConnection.getConnection();
            String sql = "select * from bill";
            PreparedStatement ps = connection.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            ArrayList<Bill> list = new ArrayList<>();
            while (rs.next()) {
                Bill bill = new Bill();
                bill.setBillID(rs.getLong("bill_id"));
                bill.setUserID(rs.getLong("user_id"));
                bill.setTotal(rs.getLong("total"));
                bill.setPayment(rs.getString("payment"));
                bill.setAddress(rs.getString("address"));
                bill.setDate(rs.getTimestamp("date"));
                list.add(bill);
            }
            return list;
 
    }
    
    public ArrayList<Bill> getListBillByUser(long user_id) throws SQLException, ClassNotFoundException {
        Connection connection = MyConnection.getConnection();
        String sql = "select * from bill where user_id = '" + user_id + "'";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Bill> list = new ArrayList<>();
        while (rs.next()) {
            Bill bill = new Bill();
            bill.setBillID(rs.getLong("bill_id"));
            bill.setUserID(rs.getLong("user_id"));
            bill.setTotal(rs.getLong("total"));
            bill.setPayment(rs.getString("payment"));
            bill.setAddress(rs.getString("address"));
            bill.setDate(rs.getTimestamp("date"));
            list.add(bill);
        }
        return list;
    }
}

   
