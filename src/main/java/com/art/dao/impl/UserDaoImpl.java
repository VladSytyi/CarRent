package com.art.dao.impl;

import com.art.dao.UserDao;
import com.art.entity.Role;
import com.art.entity.UserEntity;
import com.art.utils.ConnectionPool;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by user on 16.02.2017.
 */
public class UserDaoImpl implements UserDao {

    private Connection connection;

    public void create(UserEntity userEntity) {
        try {
            connection = ConnectionPool.getInstance().getConnection();
            String query = "INSERT INTO user (username, password, role) VALUES (?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, userEntity.getUsername());
            preparedStatement.setString(2, userEntity.getPassword());
            preparedStatement.setString(3, String.valueOf(userEntity.getRole()));
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public UserEntity read(int id) {
        ResultSet resultSet = null;
        try {
            connection = ConnectionPool.getInstance().getConnection();
            String query = "SELECT * FROM user WHERE user_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }

        return getResult(resultSet);
    }

    public UserEntity getUserByUsername(String username) {
        ResultSet resultSet = null;
        try {
            connection = ConnectionPool.getInstance().getConnection();
            String query = "SELECT * FROM user WHERE username = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,username);
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return getResult(resultSet);
    }

    public void update(UserEntity userEntity) {

    }

    public void delete(UserEntity userEntity) {

    }

    private UserEntity getResult(ResultSet resultSet){
        UserEntity userEntity = new UserEntity();
        try {
            while (resultSet.next()){
                userEntity.setUserId(Integer.valueOf(resultSet.getString("user_id")));
                userEntity.setRole(Enum.valueOf(Role.class, resultSet.getString("role")));
                userEntity.setUsername(resultSet.getString("username"));
                userEntity.setPassword(resultSet.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userEntity;
    }

}
