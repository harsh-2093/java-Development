package com.harsh.jdbclearninbg;
import java.sql.*;

public class launchApp4 {

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
        String sql="DELETE from student where id=1";
        int id=statement.executeUpdate(sql);

        //process the data
        if(id==1)
        {
            System.out.println("successfully deleted");
        }
        else {
            System.out.println("problem");
        }


        //close the resouces
        statement.close();
        connect.close();
    }
}
