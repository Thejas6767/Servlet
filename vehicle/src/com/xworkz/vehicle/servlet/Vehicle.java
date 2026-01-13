package com.xworkz.vehicle.servlet;



import com.xworkz.vehicle.dto.VehicleDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/vehicle",loadOnStartup = 1)
public class Vehicle extends HttpServlet {
    public Vehicle() {
        System.out.println("this is vehicle class");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id=Integer.parseInt(req.getParameter("vehicleId"));
        String name=req.getParameter("vehicleName");
        String type=req.getParameter("vehicleType");
        String number=req.getParameter("vehicleNumber");
        int price=Integer.parseInt(req.getParameter("price"));
        VehicleDTO vehicleDTO=new VehicleDTO(id,name,type,number,price);
        req.setAttribute("vehicle",vehicleDTO);
        req.setAttribute("msg","successfully register");
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("register.jsp");
        requestDispatcher.forward(req,resp);
    }
}
