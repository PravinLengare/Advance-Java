package com.pravin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SubServler
 */
@WebServlet("/sub")
public class SubServler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubServler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// for the request dispatcher method 
		/*
		int k = (int)request.getAttribute("k");
		k = k * k;
		PrintWriter out = response.getWriter();
		out.println("I am at sub servlet ! and the value is : "+ k);
		
		*/
		// for the send redirect method 
		/*
		HttpSession session = request.getSession();
		System.out.print("servlet called");
		int k = (int)(session.getAttribute("k"));
		k = k * k;
		PrintWriter out = response.getWriter();
		out.println("I am at sub servlet ! and the value is : "+ k);
		
		*/
		
		// Cookies
		int k = 0;
		Cookie cookies[] = request.getCookies();
		for(Cookie c:cookies ) {
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}
		k = k * k;
		PrintWriter out = response.getWriter();
		out.println("I am at sub servlet and Implementing the Cookie ! and the value is : "+ k);
		
		
		 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
