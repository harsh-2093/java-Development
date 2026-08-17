package com.harsh.jdbclearninbg;

import java.sql.*;
import java.util.Scanner;

public class LaunchApp9 {

    public static void main(String[] args) {

        Connection connect=null;
        PreparedStatement pstmnt=null;
        try {
            connect=jdbcUtil.getConnection();

            String sql="select * from student";

            pstmnt=connect.prepareStatement(sql);

            ResultSet rs = pstmnt.executeQuery();

            while (rs.next())
            {
                System.out.println("student id="+rs.getInt(1)
                +"student_name"+rs.getString(2)
                                +"student_age"+rs.getInt(3)+
                        "student add "+rs.getString(4)
                );

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
