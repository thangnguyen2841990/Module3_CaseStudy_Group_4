package com.codegym.dao.story;

import com.codegym.model.Story;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StoryDAO implements IStoryDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/casestudy?useSSL=false";
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

    @Override
    public List<Story> selectAllStory() {
        String query = "{call select_all_story()}";
        List<Story> storyList = new ArrayList<>();
        Connection connection = getConnection();
        try {
            CallableStatement statement = connection.prepareCall(query);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                int categoryId = rs.getInt("categoryId");
                String img = rs.getString("img");
                String name = rs.getString("name");
                Double price = rs.getDouble("price");
                String writer = rs.getString("writer");
                String dateSubmited = rs.getString("dateSubmited");

                storyList.add(new Story(id,categoryId,img,name,price,writer,dateSubmited));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return storyList;
    }

    @Override
    public List<Story> selectByCategoryId(int categoryId) {
        List<Story> stories = new ArrayList<>();
        Connection connection = getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM story where categoryId = ?");
            preparedStatement.setInt(1,categoryId);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String img = rs.getString("img");
                String name = rs.getString("name");
                Double price = rs.getDouble("price");
                String writer = rs.getString("writer");
                String dateSubmited = rs.getString("dateSubmited");
                stories.add( new Story(id,categoryId,img,name,price,writer,dateSubmited));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stories;
    }

    @Override
    public List<Story> selectByName(String name) {
        String query = "call select_by_name1(?)";
        List<Story> storyList = new ArrayList<>();
        Connection connection = getConnection();
        try {
            CallableStatement statement = connection.prepareCall(query);
            statement.setString(1,name);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                int categoryId = rs.getInt("categoryId");
                String name1 = rs.getString("name");
                String img = rs.getString("img");
                Double price = rs.getDouble("price");
                String writer = rs.getString("writer");
                String dateSubmited = rs.getString("dateSubmited");
                storyList.add( new Story(id,categoryId,img,name1,price,writer,dateSubmited));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return storyList;
    }
}
