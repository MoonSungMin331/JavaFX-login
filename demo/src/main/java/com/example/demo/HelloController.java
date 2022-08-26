package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class HelloController {
    @FXML
    private TextField id;
    @FXML
    private TextField pw;
    @FXML
    private TextField name;
    @FXML
    private Button joinButton;

    public void insertMember(){
        DBUtil db = new DBUtil();
        Connection conn = db.getConnection();

        PreparedStatement pstmt = null;
        String sql = "INSERT INTO users(id, pw, name) VALUES(?,?,?)";

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id.getText());
            pstmt.setString(2,pw.getText());
            pstmt.setString(3, name.getText());
            pstmt.executeUpdate();
            System.out.println("삽입 성공!!");
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("삽입 실패!!");
        }
    }

}