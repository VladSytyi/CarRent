package com.art.service.impl;

import com.art.dao.AutoDao;
import com.art.dao.UserDao;
import com.art.dao.impl.AutoDaoImpl;
import com.art.dao.impl.UserDaoImpl;
import com.art.entity.AutoEntity;
import com.art.entity.Role;
import com.art.entity.UserEntity;
import com.art.service.UserService;

import java.util.List;

/**
 * Created by user on 16.02.2017.
 */
public class UserServiceImpl implements UserService{

    private UserEntity userEntity;
    private UserDao userDao;
    private AutoDao autoDao;

    public UserServiceImpl(){
        this.userDao = new UserDaoImpl();
        this.autoDao = new AutoDaoImpl();
    }

    public void registerUser(String username, String password) {
        userEntity = new UserEntity();
        userEntity.setUsername(username);
        userEntity.setPassword(password);
        userEntity.setRole(Role.USER);
        userDao.create(userEntity);
    }

    public UserEntity login(String username, String password) {
        userEntity = userDao.getUserByUsername(username);
        if(password.equals(userEntity.getPassword())){
            return userEntity;
        }
        System.out.println("User with username: " + username + " and password: " + password + " or password is incorrect");
        return null;
    }

    public List<UserEntity> showAllUsers(){
        return userDao.showAllUsers();
    }

    public List<AutoEntity> showAllAutos(){
        return autoDao.getAllAutos();
    }
}
