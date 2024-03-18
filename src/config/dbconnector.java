/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author SCC_PC
 */
public class dbconnector {

    public Connection connection;

    public static Connection mycon() {
        Connection con = null;

        try {
            Class.forName("con.mysql.jdbc.driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scholarshipsystem", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
        }

        return con;
    }

    public dbconnector() {

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/scholarshipsystem", "root", "");
        } catch (SQLException e) {
            System.err.println("Cannot connect to database: " + e.getMessage());
        }

    }

    public ResultSet getData(String sql) throws SQLException {
        Statement statement = (Statement) connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        return resultSet;
    }

    public void insertData(String sql) {

        try {
            PreparedStatement pstmt = (PreparedStatement) connection.prepareStatement(sql);

            pstmt.executeUpdate();
            System.out.println("Inserted Successfully!");
            pstmt.close();
        } catch (SQLException e) {
            System.out.println("Connection Error: " + e);
        }
    }

    public void deleteStudent(int id) {
        try {

            PreparedStatement stmt = (PreparedStatement) connection.prepareStatement("DELETE FROM table_student WHERE student_id = ?");
            stmt.setInt(1, id);

            int rowsDeleted = stmt.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println(rowsDeleted + " rows were deleted.");
            } else {
                System.out.println("No rows were deleted.");
            }

            stmt.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("Error deleting data: " + e.getMessage());
        }
    }

    public void deleteScholar(int id) {
        try {

            PreparedStatement stmt = (PreparedStatement) connection.prepareStatement("DELETE FROM table_scholarship WHERE scholarship_id = ?");
            stmt.setInt(1, id);

            int rowsDeleted = stmt.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println(rowsDeleted + " rows were deleted.");
            } else {
                System.out.println("No rows were deleted.");
            }

            stmt.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("Error deleting data: " + e.getMessage());
        }
    }

    public void deleteUser(int id) {
        try {

            PreparedStatement stmt = (PreparedStatement) connection.prepareStatement("DELETE FROM user_table WHERE user_id = ?");
            stmt.setInt(1, id);

            int rowsDeleted = stmt.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println(rowsDeleted + " rows were deleted.");
            } else {
                System.out.println("No rows were deleted.");
            }

            stmt.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("Error deleting data: " + e.getMessage());
        }
    }

    public void deleteApplication(int id) {
        try {

            PreparedStatement stmt = (PreparedStatement) connection.prepareStatement("DELETE FROM table_scholarship WHERE application_id = ?");
            stmt.setInt(1, id);

            int rowsDeleted = stmt.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println(rowsDeleted + " rows were deleted.");
            } else {
                System.out.println("No rows were deleted.");
            }

            stmt.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("Error deleting data: " + e.getMessage());
        }
    }
     public void deleteReport(int id) {
        try {

            PreparedStatement stmt = (PreparedStatement) connection.prepareStatement("DELETE FROM table_scholarship WHERE application_id = ?");
            stmt.setInt(1, id);

            int rowsDeleted = stmt.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println(rowsDeleted + " rows were deleted.");
            } else {
                System.out.println("No rows were deleted.");
            }

            stmt.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("Error deleting data: " + e.getMessage());
        }
    }

    public int updateData(String sql) {
        int num = 0;
        try {

            String query = sql;
            PreparedStatement pstmt = (PreparedStatement) connection.prepareStatement(query);
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Data updated successfully!");
                num = 1;
            } else {
                System.out.println("Data update failed!");
                num = 0;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return num;
    }
}
