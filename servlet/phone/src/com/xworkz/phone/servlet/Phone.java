package com.xworkz.phone.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/Phone",loadOnStartup = 1)
public class Phone extends GenericServlet {

    public Phone(){
        System.out.println("Phone Object is created...");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Phone Initialized");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Phone created");
    }
    @Override
    public void destroy() {
        System.out.println("destroyed");
    }
}
