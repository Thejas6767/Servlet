package com.xworkz.clas.servlet;

import java.io.PrintWriter;

public class Class {
    public static void main(String[] args) {
        String servletRequest;
        String name = servletRequest
        System.out.println("name"+name);
        System.out.println("age"+age);
        System.out.println("gender"+gender);
        System.out.println("qualification"+servletRequest.getParameter());

        PrintWriter printWriter = servletResponse.getWriter();
        printWriter.println("Hi"+name);
        printWriter.println("Registered Succesfully");
    }
}
