package com.art.service.impl;

import com.art.dao.UserDao;
import com.art.dao.impl.UserDaoImpl;
import com.art.entity.Role;
import com.art.entity.UserEntity;
import com.art.service.UserService;

/**
 * Created by user on 16.02.2017.
 */
public class UserServiceImpl implements UserService{

    private UserEntity userEntity;
    private UserDao userDao;

    public void registerUser(String username, String password) {
        userEntity = new UserEntity();
        userDao = new UserDaoImpl();
        userEntity.setUsername(username);
        userEntity.setPassword(password);
        userEntity.setRole(Role.USER);
        userDao.create(userEntity);
    }

    public UserEntity login(String username, String password) {
        userDao = new UserDaoImpl();
        userEntity = userDao.getUserByUsername(username);
        if(password.equals(userEntity.getPassword())){
            return userEntity;
        }
        System.out.println("User with username: " + username + " and password: " + password + " or password is incorrect");
        return null;
    }
}
