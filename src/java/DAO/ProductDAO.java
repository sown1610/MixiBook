/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.Locale.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Author;
import model.Genre;

import model.Product;
import model.Publisher;

/**
 *
 * @author Sown
 */
public class ProductDAO {

    public List<Product> getAll() throws SQLException, Exception {
        List<Product> list = new ArrayList<>();
        //lenh sql
        try {
            Connection conn = new DBContext().getConnection();
            String sql = "SELECT * FROM dbo.Books";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;

    }

    public List<Product> getTOP() throws SQLException, Exception {
        List<Product> list = new ArrayList<>();
        //lenh sql
        try {
            Connection conn = new DBContext().getConnection();
            String sql = "SELECT * FROM dbo.Books WHERE quantity > 0 ORDER BY quantity ";

            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));

                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;

    }

    public List<Product> getSoldout() throws SQLException, Exception {
        List<Product> list = new ArrayList<>();
        //lenh sql
        try {
            Connection conn = new DBContext().getConnection();
            String sql = "SELECT * FROM dbo.Books WHERE quantity = 0  ";

            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;

    }
    public List<Product> getSortbyPriceDesc() throws SQLException, Exception {
        List<Product> list = new ArrayList<>();
        //lenh sql
        try {
            Connection conn = new DBContext().getConnection();
            String sql = "SELECT TOP (1000) [bookID]\n"
                    + "      ,[bookName]\n"
                    + "      ,[price]\n"
                    + "      ,[quantity]\n"
                    + "      ,[genreID]\n"
                    + "      ,[author]\n"
                    + "      ,[publisher]\n"
                    + "      ,[publicDATE]\n"
                    + "      ,[img]\n"
                    + "      ,[desc]\n"
                    + "  FROM [MixiBook].[dbo].[Books] \n"
                    + " ORDER BY price DESC";

            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;

    }
    public List<Product> getSortbyPriceAsc() throws SQLException, Exception {
        List<Product> list = new ArrayList<>();
        //lenh sql
        try {
            Connection conn = new DBContext().getConnection();
            String sql = "SELECT TOP (1000) [bookID]\n"
                    + "      ,[bookName]\n"
                    + "      ,[price]\n"
                    + "      ,[quantity]\n"
                    + "      ,[genreID]\n"
                    + "      ,[author]\n"
                    + "      ,[publisher]\n"
                    + "      ,[publicDATE]\n"
                    + "      ,[img]\n"
                    + "      ,[desc]\n"
                    + "  FROM [MixiBook].[dbo].[Books] \n"
                    + " ORDER BY price";

            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;

    }

    public List<Product> search(String keyword) throws Exception {
        List<Product> list = new ArrayList<>();
        //lenh sql
        try {
            Connection conn = new DBContext().getConnection();
            String sql = "SELECT * FROM dbo.Books WHERE bookName LIKE ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + keyword + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));

                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }

    public List<Product> getPaging(int page, int page_size) throws Exception {
        List<Product> list = new ArrayList<>();
        //lenh sql
        try {
            Connection conn = new DBContext().getConnection();
            String sql = "SELECT * FROM dbo.Books ORDER BY bookID\n"
                    + "OFFSET (?-1)*? ROW FETCH NEXT ? ROW ONLY";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, page);
            ps.setInt(2, page_size);
            ps.setInt(3, page_size);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));

                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;

    }

    public int total() throws Exception {
        List<Product> list = new ArrayList<>();
        //lenh sql
        try {
            Connection conn = new DBContext().getConnection();
            String sql = "SELECT COUNT(bookID) FROM dbo.Books ";

            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return 0;

    }

    public List<Product> getProductBygenreID(int genreID) throws Exception {
        List<Product> list = new ArrayList<>();
        //lenh sql
        try {
            Connection conn = new DBContext().getConnection();
            String sql = "SELECT * FROM dbo.Books WHERE genreID = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, genreID);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));

                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }

    public List<Product> getAllGenre() {
        List<Product> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM dbo.Books";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
                list.add(p);
            }
        } catch (Exception ex) {
            Logger.getLogger(GenreDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public Product getProductByID(int productID) throws Exception {

        //lenh sql
        try {
            Connection conn = new DBContext().getConnection();
            String sql = "SELECT * FROM dbo.Books WHERE bookID = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, productID);
            ResultSet rs = ps.executeQuery();
            String pattern = "dd-MM-yyyy";

            SimpleDateFormat sd = new SimpleDateFormat(pattern);

            while (rs.next()) {
                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7), sd.format(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString(8))), rs.getString(9), rs.getString(10));

                return p;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }

    public void deleteProduct(String id) {

        try {
            Connection conn = new DBContext().getConnection();
            String sql = "DELETE FROM dbo.Books\n"
                    + "WHERE bookID = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
        } catch (Exception e) {
        }
    }

    public void insertProduct(String name, float price, int quantity, String genre, String author,
            String publisher, String publishDATE, String img, String desc) throws SQLException {

        try {
            String sql = "INSERT INTO [dbo].[Books]\n"
                    + "           ([bookName]\n"
                    + "           ,[price]\n"
                    + "           ,[quantity]\n"
                    + "           ,[genreID]\n"
                    + "           ,[author]\n"
                    + "           ,[publisher]\n"
                    + "           ,[publicDATE]\n"
                    + "           ,[img]\n"
                    + "           ,[desc])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?,?,?,?,?,?)";

            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setFloat(2, price);
            ps.setInt(3, quantity);
            ps.setString(4, genre);
            ps.setString(5, author);
            ps.setString(6, publisher);
            ps.setString(7, publishDATE);
            ps.setString(8, img);
            ps.setString(9, desc);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void editProduct(String name, float price, int quantity, String genre, String author,
            String publisher, String publishDATE, String img, String desc, String id) throws SQLException {

        try {
            String sql = "UPDATE [dbo].[Books]\n"
                    + "   SET [bookName] = ?\n"
                    + "      ,[price] = ?\n"
                    + "      ,[quantity] = ?\n"
                    + "      ,[genreID] = ?\n"
                    + "      ,[author] = ?\n"
                    + "      ,[publisher] = ?\n"
                    + "      ,[publicDATE] = ?\n"
                    + "      ,[img] = ?\n"
                    + "      ,[desc] = ?\n"
                    + " WHERE bookID = ?";

            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setFloat(2, price);
            ps.setInt(3, quantity);
            ps.setString(4, genre);
            ps.setString(5, author);
            ps.setString(6, publisher);
            ps.setString(7, publishDATE);
            ps.setString(8, img);
            ps.setString(9, desc);
            ps.setString(10, id);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
