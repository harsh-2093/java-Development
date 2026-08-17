package com.harsh.jdbclearninbg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LaunchApp8 {

    public static void main(String[] args) {

        Connection connect=null;
        PreparedStatement pstmnt=null;
        try {
            connect=jdbcUtil.getConnection();

            String sql="UPDATE student SET s_name=? where id=?";
            pstmnt=connect.prepareStatement(sql);

            Scanner scan=new Scanner(System.in);
            System.out.println("please enter the info");

            System.out.println("please enter your id");
            Integer id=scan.nextInt();

            System.out.println("please enter your name to update");
            String name=scan.next();

            pstmnt.setString(1,name);
            pstmnt.setInt(2,id);

            int rowAffected=pstmnt.executeUpdate();
                   
            if(rowAffected>0)
            {
                System.out.println("row affected"+rowAffected);
            }
            else {
                System.out.println("problem occured");
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
