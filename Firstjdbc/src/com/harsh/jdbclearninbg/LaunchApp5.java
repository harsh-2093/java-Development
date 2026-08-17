package com.harsh.jdbclearninbg;
import java.sql.*;

public class LaunchApp5 {

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
        String sql="update student set s_age=52 where id=1";

        //execute the query
        boolean status=statement.execute(sql);

        //process the data

        if(status==true)
        {
            //select
            System.out.println("if block");
            ResultSet rs=statement.getResultSet();
            while(rs.next())
            {
                System.out.println(rs.getInt("id")
                + " "
                +rs.getString("s_name")
                +" "
                +rs.getString("s_age")
                +" "
                +rs.getString("city")
                );
            }


        }
        else
        {
            //insert ,update ,delete
            System.out.println("else block");
            int rowAffected=statement.getUpdateCount();
            if(rowAffected==0)
            {
                System.out.println("operation failed");
            }
            else {
                System.out.println("operation Successful");
            }
        }



        //close the resouces
        statement.close();
        connect.close();
    }
}
