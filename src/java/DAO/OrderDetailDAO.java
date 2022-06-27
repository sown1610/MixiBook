/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cart;

/**
 *
 * @author Sown
 */
public class OrderDetailDAO {

    public void saveCart(int orderID, Map<Integer, Cart> carts) {
        try {
            Connection conn = new DBContext().getConnection();
            String sql = "INSERT INTO [dbo].[OrderDetail]\n"
                    + "           ([orderID]\n"
                    + "           ,[bookName]\n"
                    + "           ,[img]\n"
                    + "           ,[price]\n"
                    + "           ,[quantity])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?,?)";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, orderID);
            for (Map.Entry<Integer, Cart> entry : carts.entrySet()) {
                Integer productID = entry.getKey();
                Cart cart = entry.getValue();
                ps.setString(2, cart.getProduct().getBookName());
                ps.setString(3, cart.getProduct().getImg());
                ps.setDouble(4, cart.getProduct().getPrice());
                ps.setInt(5, cart.getQuantity());

            }

            ps.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(ShippingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
