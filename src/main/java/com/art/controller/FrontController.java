package com.art.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by user on 15.02.2017.
 */
public class FrontController extends HttpServlet{
    private final String COMMAND_LABEL = "Command";
    private final String COMMANDS_LOCATION = "com.art.controller.commands.";

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            FrontCommand command = getCommand(request);
            command.init(getServletContext(), request, response);
            command.process();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    private FrontCommand getCommand(HttpServletRequest request) throws IllegalAccessException, InstantiationException {
        return (FrontCommand) getCommandClass(request).newInstance();
    }

    private Class getCommandClass(HttpServletRequest request){
        Class resultCommandClass = null;
        StringBuilder classNameBuilder = new StringBuilder(COMMANDS_LOCATION);
        classNameBuilder.append(request.getParameter(COMMAND_LABEL));
        classNameBuilder.append(COMMAND_LABEL);
        try {
            resultCommandClass = Class.forName(classNameBuilder.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return resultCommandClass;
    }
}
