package com.company;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet Filter implementation class IDFilter
 */
@WebFilter("/MyServlet")
public class IDFilter extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public IDFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	 
	public void destroy() {
		
	}

	 
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		 //System.out.print("I ma filet");
		 PrintWriter out = response.getWriter();
		 HttpServletRequest req = (HttpServletRequest) request;
		 int  aid = Integer.parseInt(request.getParameter("aid"));
		 
		 if(aid > 1) {
			 chain.doFilter(request, response);
		 }
		 else {
			 out.print("Invalid Input !");
		 }
	}

	 
	public void init(FilterConfig fConfig) throws ServletException {
		 
	}

}
