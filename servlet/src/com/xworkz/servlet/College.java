package com.xworkz.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/college",loadOnStartup = 1)
public class College extends GenericServlet {

    public College(){
        System.out.println("College Object is created...");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("College Initialized");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse){
        System.out.println("College starts");
    }

    @Override
    public void destroy() {
        System.out.println("destroyed");
    }
}
