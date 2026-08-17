package com.harsh.jdbclearninbg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LaunchBatchApp {

    public static void main(String[] args) {

        Connection connect=null;
        PreparedStatement pstmnt=null;
        try {
            connect=jdbcUtil.getConnection();

            String sql="UPDATE student SET s_age=? where id=?";
            pstmnt=connect.prepareStatement(sql);

            pstmnt.setInt(1,200);
            pstmnt.setInt(2,1);
            pstmnt.addBatch();
            pstmnt.setInt(1,220);
            pstmnt.setInt(2,2);
            pstmnt.addBatch();
            pstmnt.setInt(1,20);
            pstmnt.setInt(2,6);
            pstmnt.addBatch();
            pstmnt.setInt(1,20);
            pstmnt.setInt(2,9);
            pstmnt.addBatch();

            pstmnt.executeBatch();

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
