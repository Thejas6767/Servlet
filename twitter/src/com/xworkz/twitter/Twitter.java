package com.xworkz.twitter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/twitter",loadOnStartup = 1)
public class Twitter  extends HttpServlet {
        public Twitter(){
            System.out.println("Twitter");
        }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("Username");
        String email = req.getParameter("Email");
        String password = req.getParameter("password");
        System.out.println("Name is "+name+" and password = "+password+" and Email is "+email);
        System.out.println(name);
    }
}

