package com.art.dao;

import com.art.entity.UserEntity;

/**
 * Created by user on 16.02.2017.
 */
public interface UserDao extends Dao<UserEntity> {
    UserEntity getUserByUsername(String username);
    boolean ifUserExist(UserEntity userEntity);
}
