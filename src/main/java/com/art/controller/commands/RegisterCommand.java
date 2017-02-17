package com.art.controller.commands;

import com.art.controller.FrontCommand;
import com.art.entity.UserEntity;
import com.art.service.UserService;
import com.art.service.impl.UserServiceImpl;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by user on 16.02.2017.
 */
public class RegisterCommand extends FrontCommand {

    private UserService userService;
    private String username;
    private String password;

    public void process() {
        username = request.getParameter("username");
        password = request.getParameter("password");

        if(StringUtils.isNotEmpty(username) && StringUtils.isNotEmpty(password)){
            userService = new UserServiceImpl();
            userService.registerUser(username, password);
            /*
            * TODO: if block for check if user exist
            * */
            forward(properties.getProperty("index"));
        }
        forward(properties.getProperty("index"));
    }
}
