package com.xworkz.assignment.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/Assignment",loadOnStartup = 1)
public class Assignment extends GenericServlet {

    public Assignment(){
        System.out.println("Assignment Object is created...");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Assignment Initialized");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Assignment created");
    }
    @Override
    public void destroy() {
        System.out.println("destroyed");
    }
}

