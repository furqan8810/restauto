package com.unicommerce.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class dbUtil {
    static Connection connection;

    public static Connection getConnection(String dbname) throws ClassNotFoundException, SQLException {

        String username = "root";
        String password = "uniware";
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(dbname, username, password);
        System.out.println("db connection created");
        return connection;
    }

    public static void closeConnection() throws SQLException {
        connection.close();
        System.out.println("SQL DB connection closed");
    }
}
