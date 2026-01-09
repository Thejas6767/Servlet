package com.xworkz.servlet;


import sun.net.www.content.text.Generic;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.xml.ws.Service;

@WebServlet(urlPatterns = "/school",loadOnStartup = 2)
    public class School extends GenericServlet {

    public School(){
        System.out.println("School opened...");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse){

    }
}
