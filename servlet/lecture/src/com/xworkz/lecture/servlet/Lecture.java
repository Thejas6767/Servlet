package com.xworkz.lecture.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/lecture",loadOnStartup = 1)
public class Lecture extends GenericServlet {

    public Lecture(){
        System.out.println("lecture Object is created...");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Lecture Initialized");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Lecture created");
    }
    @Override
    public void destroy() {
        System.out.println("destroyed");
    }
}