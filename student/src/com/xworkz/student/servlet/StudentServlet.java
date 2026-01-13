package com.xworkz.student.servlet;


import com.xworkz.student.dto.StudentDTO;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/enroll", loadOnStartup = 1)
public class StudentServlet extends HttpServlet {

    public StudentServlet() {
        System.out.println("StudentServlet instance created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("studentId"));
        String name = req.getParameter("studentName");
        String course = req.getParameter("course");
        String email = req.getParameter("email");
        int age = Integer.parseInt(req.getParameter("age"));

        StudentDTO studentDTO = new StudentDTO(id, name, course, email, age);

        req.setAttribute("student", studentDTO);
        req.setAttribute("msg", "Student Enrolled Successfully!");

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("success.jsp");
        requestDispatcher.forward(req, resp);
    }
}
