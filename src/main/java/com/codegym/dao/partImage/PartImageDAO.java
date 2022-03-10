package com.codegym.dao.partImage;

import com.codegym.dao.DBConnection;
import com.codegym.model.PartImage;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PartImageDAO implements IPartImageDAO{
    String query = "call select_all_image(?,?)";
    private String jdbcURL = "jdbc:mysql://localhost:3306/caseStudy?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "thuthuyda1";

    protected Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    Connection connection = getConnection();
    @Override
    public List<PartImage> selectAllImg(int storyId,int partId) {
        List<PartImage> images = new ArrayList<>();
        try {
            CallableStatement statement = connection.prepareCall(query);
            statement.setInt(1,storyId);
            statement.setInt(2,partId);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                int storyId1 = rs.getInt("storyId");


                int partId1 = rs.getInt("partId");

                String img = rs.getString("img");

                images.add(new PartImage(id,storyId,partId,img));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return images;
    }
}
