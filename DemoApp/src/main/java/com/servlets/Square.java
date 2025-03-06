package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Square extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		/**
		 * Taking from URL.
		 */
		//int a = Integer.parseInt(req.getParameter("a"));
		//int b = Integer.parseInt(req.getParameter("b"));
		
		/**
		 * Taking from session
		 */
		HttpSession session = req.getSession();
		int a = (int) session.getAttribute("a");
		int b = (int) session.getAttribute("b");
		
		out.println("Square of a " + (a*a));
		out.println("Square of b " + (b*b));
		
		/**
		 * Taking from cookie
		 */
		
		Cookie[] cookies = req.getCookies();
		
		for(Cookie cookie: cookies) {
			if(cookie.getName().equals("Sum")) {
				out.println("Sum value is from cookie " + cookie.getValue());
			}
		}
		ServletContext ctx = getServletContext();
    	String phone = ctx.getInitParameter("Phone");
    	System.out.println("Phone in square servlet " + phone);
	}
}
