package com.art.controller.commands;

import com.art.controller.FrontCommand;
import com.art.service.UserService;
import com.art.service.impl.UserServiceImpl;

/**
 * Created by user on 16.02.2017.
 */
public class RegisterCommand extends FrontCommand {

    private UserService userService;
    //private String path = properties.getProperty("index");


    public void process() {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        userService = new UserServiceImpl();
        userService.registerUser(username, password);
       // forward(path);
    }
}
