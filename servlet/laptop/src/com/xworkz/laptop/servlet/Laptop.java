package com.xworkz.laptop.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/laptop",loadOnStartup = 1)
public class Laptop extends GenericServlet {

    public Laptop(){
        System.out.println("laptop Object is created...");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Laptop Initialized");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Laptop created");
    }
    @Override
    public void destroy() {
        System.out.println("destroyed");
    }
}
