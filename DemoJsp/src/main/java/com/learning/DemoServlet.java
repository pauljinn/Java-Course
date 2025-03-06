package com.learning;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		RequestDispatcher rd = req.getRequestDispatcher("demo.jsp");
		Student st = new Student(1, "Aman");
		req.setAttribute("label","aman");
		req.setAttribute("student", st);
		rd.forward(req,res);
	}
}
