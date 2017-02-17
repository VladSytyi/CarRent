package com.art.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by user on 16.02.2017.
 */
public abstract class FrontCommand {

    protected ServletContext servletContext;
    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected Properties properties;
    public static final String FILE_PATH = "/path.properties";

    public abstract void process();


    public void init(ServletContext servletContext, HttpServletRequest request, HttpServletResponse response){
        this.servletContext = servletContext;
        this.request = request;
        this.response = response;
       // initProperties();
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

    private void initProperties(){
        properties = new Properties();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(FILE_PATH);
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
