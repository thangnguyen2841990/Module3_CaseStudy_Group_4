package com.codegym.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static String jbdcURL = "jdbc:mysql://localhost:3306/caseStudy?useSSL=false";
    private static String jbdcUsername = "root";
    private static String jbdcPassword = "thuthuyda1";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jbdcURL, jbdcUsername, jbdcPassword);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
