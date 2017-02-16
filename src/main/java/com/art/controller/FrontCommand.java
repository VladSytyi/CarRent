package com.art.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by user on 16.02.2017.
 */
public abstract class FrontCommand {

    protected ServletContext servletContext;
    protected HttpServletRequest request;
    protected HttpServletResponse response;

    public abstract void process();

    public void init(ServletContext servletContext, HttpServletRequest request, HttpServletResponse response){
        this.servletContext = servletContext;
        this.request = request;
        this.response = response;
    }

    protected void forward(String pagePath){
        RequestDispatcher dispatcher = servletContext.getRequestDispatcher(pagePath);
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
