/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Product;

/**
 *
 * @author Sown
 */
public class LoginDAO {

    public Account check(String user, String pass) throws Exception {
        try {
            Connection conn = new DBContext().getConnection();
            String sql = "SELECT * FROM dbo.Account WHERE [user]= ? AND pass= ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Account acc = new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getBoolean(7));
                return acc;
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public void signup(String user, String pass, String fullname, String email, String phone) {
        try {
            //mo ket noi
            Connection conn = new DBContext().getConnection();
            String sql = "INSERT INTO dbo.Account\n"
                    + "(\n"
                    + "    [user],\n"
                    + "    pass,\n"
                    + "    fullname,\n"
                    + "    email,\n"
                    + "    phone,\n"
                    + "    role\n"
                    + ")\n"
                    + "VALUES\n"
                    + "(   ?, \n"
                    + "    ?, \n"
                    + "    ?, \n"
                    + "    ?, \n"
                    + "    ?, \n"
                    + "    0 \n"
                    + "    )";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setString(3, fullname);
            ps.setString(4, email);
            ps.setString(5, phone);
            ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }

    public Account checkAccountExisted(String user) throws Exception {
        try {
            //mo ket noi
            Connection conn = new DBContext().getConnection();
            String sql = "SELECT * FROM dbo.Account WHERE [user] = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getBoolean(7));

            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    public void changePass(String username, String newpass) {
        try {
            //mo ket noi
            Connection conn = new DBContext().getConnection();
            String sql = "UPDATE dbo.Account\n"
                    + "SET pass = ?\n"
                    + "WHERE [user] = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, newpass);
            ps.setString(2, username);
            ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }

    public void EditProfile(String username, String fullname, String email, String phone) {
        try {
            //mo ket noi
            Connection conn = new DBContext().getConnection();
            String sql = "UPDATE [dbo].[Account]\n"
                    + "   SET \n"
                    + "      [fullname] = ?\n"
                    + "      ,[email] = ?\n"
                    + "      ,[phone] = ?\n"
                    + "\n"
                    + " WHERE [user] = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, fullname);
            ps.setString(2, email);
            ps.setString(3, phone);
            ps.setString(4, username);
            ps.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }

    public List<Account> getAllAccount() throws SQLException, Exception {
        List<Account> list = new ArrayList<>();
        //lenh sql
        try {
            Connection conn = new DBContext().getConnection();
            String sql = "SELECT * FROM dbo.Account";

            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Account a = new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getBoolean(7));
                list.add(a);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;

    }

    public void insertUser(String name, String user, String pass, String mail, String phone, String role) throws SQLException {

        try {
            String sql = "INSERT INTO [dbo].[Account]\n"
                    + "           ([user]\n"
                    + "           ,[pass]\n"
                    + "           ,[fullname]\n"
                    + "           ,[email]\n"
                    + "           ,[phone]\n"
                    + "           ,[role])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?,?,?)";

            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setString(3, name);
            ps.setString(4, mail);
            ps.setString(5, phone);
            ps.setString(6, role);

            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deleteUser(String id) {

        try {
            Connection conn = new DBContext().getConnection();
            String sql = "DELETE FROM dbo.Account WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
        } catch (Exception e) {
        }
    }

    public void editUsers(String name, String user, String pass, String email, String phone, String role, String id) throws SQLException {

        try {
            String sql = "UPDATE [dbo].[Account]\n"
                    + "   SET [user] = ?\n"
                    + "      ,[pass] = ?\n"
                    + "      ,[fullname] = ?\n"
                    + "      ,[email] = ?\n"
                    + "      ,[phone] = ?\n"
                    + "      ,[role] = ?\n"
                    + " WHERE id=?";

            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setString(3, name);
            ps.setString(4, email);
            ps.setString(5, phone);
            ps.setString(6, role);
            ps.setString(7, id);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Account getUserByID(String id) throws Exception {

        //lenh sql
        try {
            Connection conn = new DBContext().getConnection();
            String sql = "SELECT *  FROM dbo.Account WHERE id = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Account a = new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getBoolean(7));
                return a;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }
}
