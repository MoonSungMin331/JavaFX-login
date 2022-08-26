package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    public Connection getConnection() {
        // 접속 정보
        String url = "jdbc:mysql://127.0.0.1:3306/yydh";
        String userName = "root";
        String password = "";

        Connection conn = null;
        //MySQL 드라이버 통해 접속
        try {
            conn = DriverManager.getConnection(url,userName,password);
        } catch (SQLException e){
            e.printStackTrace();
        }

        return conn;
    }
}
