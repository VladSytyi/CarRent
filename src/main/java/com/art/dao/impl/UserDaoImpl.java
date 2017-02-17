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
        return null;
    }

    public void update(UserEntity userEntity) {

    }

    public void delete(UserEntity userEntity) {

    }

    public UserEntity getUserByUsername(String username) {
        UserEntity userEntity = new UserEntity();
        try {
            connection = ConnectionPool.getInstance().getConnection();
            String query = "SELECT * FROM user WHERE username = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,username);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                userEntity.setUserId(Integer.valueOf(resultSet.getString("user_id")));
                userEntity.setRole(Enum.valueOf(Role.class, resultSet.getString("role")));
                userEntity.setUsername(resultSet.getString("username"));
                userEntity.setPassword(resultSet.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userEntity;
    }

}
