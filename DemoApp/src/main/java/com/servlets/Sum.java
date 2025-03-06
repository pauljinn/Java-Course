package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Sum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Sum() {
 
        super();
    }
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
    	int a = Integer.parseInt(req.getParameter("a"));
    	int b = Integer.parseInt(req.getParameter("b"));
    	PrintWriter pw = res.getWriter();
    	pw.println("Sum from service is " + (a+b));
    	/**
    	 * Request Dispatcher to call another servlet from current servlet.
    	 */
//    	RequestDispatcher rd = req.getRequestDispatcher("square");
//    	rd.forward(req, res);
    	
    	/**
    	 * Send Redirect : Make the client call another servlet.
    	 * Data can be passed in three ways: 1) URL Rewriting, 2) Session, 3)Cookies
    	 */
    	
    	//URL Rewriting
    	//res.sendRedirect("square?a="+ a + "&b=" + b);
    	
    	/**
    	 * Session
    	 */
    	
    	HttpSession session = req.getSession();
    	session.setAttribute("a", a);
    	session.setAttribute("b", b);
    	
    	/**
    	 * Cookies
    	 */
    	Cookie cookie = new Cookie("Sum", (a+b)+"");
    	res.addCookie(cookie);
    	
    	res.sendRedirect("square");
    	
    	/**
    	 * Servlet Context
    	 */
    	ServletContext ctx = getServletContext();
    	String phone = ctx.getInitParameter("Phone");
    	System.out.println("Phone in sum servlet " + phone);
    	
    	/**
    	 * Servlet config
    	 */
    	
    	ServletConfig cg = getServletConfig();
    	System.out.println("Phone from servlet config " + cg.getInitParameter("Phone"));
    }
    	
    	



}
