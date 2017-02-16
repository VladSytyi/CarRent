package com.art.dao.impl;

import com.art.dao.UserDao;
import com.art.entity.UserEntity;
import com.art.utils.ConnectionPool;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by user on 16.02.2017.
 */
public class UserDaoImpl implements UserDao {
    public void create(UserEntity userEntity) {
        try {
            Connection connection = ConnectionPool.getConnection();
        } catch (SQLException e) {
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
        return null;
    }
}
