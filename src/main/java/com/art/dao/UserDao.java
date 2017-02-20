package com.art.dao;

import com.art.entity.UserEntity;

import java.util.List;

/**
 * Created by user on 16.02.2017.
 */
public interface UserDao extends Dao<UserEntity> {
    UserEntity getUserByUsername(String username);
    List<UserEntity> showAllUsers();
}
