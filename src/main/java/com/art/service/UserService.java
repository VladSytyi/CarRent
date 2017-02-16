package com.art.service;

import com.art.entity.UserEntity;

/**
 * Created by user on 15.02.2017.
 */
public interface UserService {
    void registerUser(String username, String password);
    boolean isUserExist(String username);
}
