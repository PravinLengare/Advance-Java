package com.company;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class IdFilter
 */
@WebFilter("/MyServlet")
public class IdFilter extends HttpFilter implements Filter {
       
    
    public IdFilter() {
        super();
         
    }

	 
	public void destroy() {
		 
	}

	 
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("In filter!");
	}

	 
	public void init(FilterConfig fConfig) throws ServletException {
		 
	}

}
