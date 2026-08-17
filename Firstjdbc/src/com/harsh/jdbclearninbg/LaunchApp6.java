package com.harsh.jdbclearninbg;
import java.sql.*;

public class LaunchApp6 {

    public static void main(String[] args) {

        Connection connect=null;
        Statement statement=null;
        try {

            connect=jdbcUtil.getConnection();

            //creating statement
            statement = connect.createStatement();

            //execute the query
            String sql = "update student set s_age=23 where id=3";
            int RowAffected = statement.executeUpdate(sql);
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
            catch (Exception e)
            {
                e.printStackTrace();
            }
            finally {
             //close the resouces
                try
                {
                    jdbcUtil.closeConnection(connect,statement);
                }
                catch (SQLException e)
                {
                    e.printStackTrace();
                }

            }
    }
}
