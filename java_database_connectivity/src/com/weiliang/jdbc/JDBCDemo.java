package com.weiliang.jdbc;

import org.junit.Test;

import java.sql.*;

/**
 * @author liweiliang
 * @create 2022-12-31 19:45
 * @description 查询数据
 */
public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql:///test?useSSL=false";
        String username = "root";
        String password = "liang521..";
        Connection connection = DriverManager.getConnection(url, username, password);
        String sql = "select * from product";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String price = resultSet.getString(3);
            System.out.println(id + " " + name + " " + price );
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
/***
* @author: liweiliang
* @date: 2023/1/1 10:54
* @param: []
* @return: void
* @details: 修改数据
**/
@Test
public void testDML() throws SQLException {
    String url = "jdbc:mysql:///atguigudb?useSSL=false";
    String username = "root";
    String password = "liang521..";
    Connection connection = DriverManager.getConnection(url, username, password);
    String sql = "update emp set salary = 5000 where id = 1";
    Statement statement = connection.createStatement();
    int count = statement.executeUpdate(sql);
    System.out.println(count);
    statement.close();
    connection.close();
    }
}
