package MyPackage;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			String str1 = request.getParameter("username");
			String str2 = request.getParameter("password");
		
		 response.getWriter().append("doGet is calling : "+"UserName: "+str1 +"  Password: "+ str2);
		 response.sendRedirect("MyServlet2");  // for sending data from one Servlet to another and generally used for the communicate another
		
		// for the send and retrieve the data
		/*
 		RequestDispatcher dispatcher = request.getRequestDispatcher("MyServlet2"); // we load the data 
 		dispatcher.forward(request, response);  		// we send the data
		
		
		
		
		// 1.  using sendRedirect  (when we use this then the value of the parameter will get loose and control of servlet will shift to another servlet)
		response.sendRedirect("MyServlet2?Data1="+str1+"&Data2="+str2);
		*/
		
		// for the request attribute
		/*
		String str1 = request.getParameter("username");
		String str2 = request.getParameter("password");
		request.setAttribute("Data1",str1);
		request.setAttribute("Data2","I am Pravin");
		 // response.sendRedirect("MyServlet2");  // if we use this then control of servlet will shift so not will work
		request.getRequestDispatcher("MyServlet2").forward(request, response);
		*/	
		// for the session attribute
		/*
		String str1 = request.getParameter("username");
		String str2 = request.getParameter("password");
		HttpSession session = request.getSession();
		
		
		
		session.setAttribute("Data1",str1);
		session.setAttribute("Data2","I am Pravin");
		 // response.sendRedirect("MyServlet2");  // if we use this then control of servlet will shift so not will work
		request.getRequestDispatcher("MyServlet2").forward(request, response);
		*/
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		String str1 = request.getParameter("username");
		String str2 = request.getParameter("password");
		HttpSession session = request.getSession();
		
		
		
		session.setAttribute("Data1",str1);
		session.setAttribute("Data2","I am Pravin");
		 // response.sendRedirect("MyServlet2");  // if we use this then control of servlet will shift so not will work
		request.getRequestDispatcher("MyServlet2").forward(request, response);
		*/
	 
	}

}
