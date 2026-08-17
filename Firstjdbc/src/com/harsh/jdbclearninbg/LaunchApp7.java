package com.harsh.jdbclearninbg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LaunchApp7 {

    public static void main(String[] args) {

        Connection connect=null;
        Statement statement=null;
        PreparedStatement pstmnt=null;
        try {

            connect=jdbcUtil.getConnection();

            //creating statement

            //execute the query
            String sql = "insert into student values(?,?,?,?)";
            pstmnt=connect.prepareStatement(sql);

            System.out.println("please enter the follwing details");

            Scanner scan=new Scanner(System.in);

            System.out.println("Enter your id");
            Integer id=scan.nextInt();

            System.out.println("Enter your name");
            String name=scan.next();

            System.out.println("Enter your age");
            Integer age=scan.nextInt();

            System.out.println("Enter your city");
            String address=scan.next();

            pstmnt.setInt(1,id);
            pstmnt.setString(2,name);
            pstmnt.setInt(3,age);
            pstmnt.setString(4,address);

            int RowAffected = pstmnt.executeUpdate();
            //process the result
            if (RowAffected == 0) {
                System.out.println("unable to insert row");
            } else {
                System.out.println("data inserted successfully");
            }

            } catch (SQLException e)
            {
                e.printStackTrace();
            }
            finally {
             //close the resouces

                try
                {
                    jdbcUtil.closeConnection(connect,pstmnt);
                }
                catch (SQLException e)
                {
                    e.printStackTrace();
                }


            }
    }
}
