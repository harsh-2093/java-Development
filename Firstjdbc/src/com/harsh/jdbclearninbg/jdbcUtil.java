package com.harsh.jdbclearninbg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcUtil
{
    static
    {
        //load and register the driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static Connection getConnection() throws SQLException {
        //Establish the connection
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = "root";
        String psswd = "Harsh@123";
        return DriverManager.getConnection(url, user, psswd);

    }

    public static void closeConnection(Connection connect, Statement statement) throws SQLException {
        statement.close();
        connect.close();
    }
}
