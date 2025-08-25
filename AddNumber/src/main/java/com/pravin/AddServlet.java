package com.pravin;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		
		int k = i + j;
		// System.out.print(k);  // it will print on the console
		

		
		
		/*
		request.setAttribute("k", k);
		
		PrintWriter out = response.getWriter();
		
		out.println("the result is : "+k);
		*/
		
		
		
		/*
		RequestDispatcher rd = request.getRequestDispatcher("SubServler");
		rd.forward(request,response);
		
		*/
		// Session Using to maintain the data through journey
		
		/*
				 HttpSession session = request.getSession();
				 session.setAttribute("k", k);
		
		response.sendRedirect("sub");
		*/
		
		//Cookies
		Cookie cookie = new Cookie("k",k+"");
		response.addCookie(cookie);
		
		response.sendRedirect("sub");
		
		
	}
	
//	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//			
//			int i = Integer.parseInt(request.getParameter("num1"));
//			int j = Integer.parseInt(request.getParameter("num1"));
//			
//			int k = i + j;
//			// System.out.print(k);  // it will print on the console
//			PrintWriter out = response.getWriter();
//			
//			out.println("the result is : "+k);
//		}
}
