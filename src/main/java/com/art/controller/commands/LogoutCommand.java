package com.art.controller.commands;

import com.art.controller.FrontCommand;

import javax.servlet.http.HttpSession;

/**
 * Created by user on 18.02.2017.
 */
public class LogoutCommand extends FrontCommand {
    private HttpSession session;

    public void process() {
        session = request.getSession();
        session.setAttribute("userId", null);
        forward(properties.getProperty("index"));
    }
}
