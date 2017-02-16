package com.art.controller.commands;

import com.art.controller.FrontCommand;
import com.art.service.UserService;
import com.art.service.impl.UserServiceImpl;

/**
 * Created by user on 16.02.2017.
 */
public class RegisterCommand extends FrontCommand {

    private UserService userService;

    public void process() {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        userService = new UserServiceImpl();
        if(!userService.isUserExist(username)){
            userService.registerUser(username, password);
        }
    }
}
