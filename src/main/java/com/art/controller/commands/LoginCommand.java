package com.art.controller.commands;

import com.art.controller.FrontCommand;
import com.art.entity.Role;
import com.art.entity.UserEntity;
import com.art.service.UserService;
import com.art.service.impl.UserServiceImpl;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpSession;

/**
 * Created by user on 18.02.2017.
 */
public class LoginCommand extends FrontCommand{

    private UserServiceImpl userService;
    private UserEntity userEntity;
    private String username;
    private String password;
    private HttpSession session;



    public void process() {
        username = request.getParameter("username");
        password = request.getParameter("password");

        if(StringUtils.isNotEmpty(username) && StringUtils.isNotEmpty(password)){
            userService = new UserServiceImpl();
            userEntity = userService.login(username, password);
            if(userEntity != null){
                session = request.getSession();
                session.setAttribute("userId", userEntity.getUserId());
                if(userEntity.getRole() == Role.ADMIN){
                    forward(properties.getProperty("login_admin"));
                }
                request.setAttribute("username", userEntity.getUsername());
                request.setAttribute("autos", userService.showAllAutos());
                forward(properties.getProperty("login_user"));
            }else{
                forward(properties.getProperty("index"));
                /*
                   TODO: Create exception handler for incorrect user credentials
                */
            }
        }
        forward(properties.getProperty("index"));
    }

}
