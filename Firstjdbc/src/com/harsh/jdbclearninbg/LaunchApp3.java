package com.harsh.jdbclearninbg;
import java.sql.*;

public class LaunchApp3 {

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
        String sql="select *  from student ";
        ResultSet rs=statement.executeQuery(sql);

        //process the data

        while(rs.next())
        {
//            System.out.println(rs.getInt(1) +" "+
//                    rs.getString(2)+" "+rs.getInt(3)
//            +" "+rs.getString(4));
            System.out.println(rs.getInt("id") +" "+
                    rs.getString("s_name")+" "+rs.getInt("s_age")
                    +" "+rs.getString("city"));

        }

        //close the resouces
        rs.close();
        statement.close();
        connect.close();
    }
}
