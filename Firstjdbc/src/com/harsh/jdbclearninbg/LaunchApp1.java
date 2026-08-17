package com.harsh.jdbclearninbg;
import java.sql.*;

public class LaunchApp1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //load and register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");


        //Establish the connection
        String url="jdbc:mysql://localhost:3306/jdbclearning";
        String user="root";
        String psswd="Harsh@123";
        Connection connect=DriverManager.getConnection(url,user,psswd);

        //creating statement
        Statement statement=connect.createStatement();

        //execute the query
        String sql="INSERT INTO student(id,s_name,s_age,city) VALUES (1,'Harsh',19,'Kanpur')";
        int RowAffected=statement.executeUpdate(sql);

        //process the result
        if(RowAffected==0)
        {
            System.out.println("unable to insert row");
        }
        else
        {
            System.out.println("data inserted successfully");
        }
        //close the resouces
        statement.close();
        connect.close();
    }
}
