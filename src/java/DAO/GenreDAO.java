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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Genre;
import model.Product;

/**
 *
 * @author Sown
 */
public class GenreDAO {

    public List<Genre> getAllGenre() {
        List<Genre> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM dbo.Genre";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Genre genre = new Genre(rs.getInt(1), rs.getString(2));
                list.add(genre);
            }
        } catch (Exception ex) {
            Logger.getLogger(GenreDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public Genre getGenrebyID(int productID) {
        try {
            Connection conn = new DBContext().getConnection();
            String sql = "SELECT g.genreID, g.genreName FROM dbo.Books b INNER JOIN dbo.Genre g\n"
                    + "on b.genreID = g.genreID WHERE b.bookID = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, productID);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Genre genre = new Genre(rs.getInt(1), rs.getString(2));
                return genre;
            }

        } catch (Exception ex) {
            Logger.getLogger(GenreDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
}


