package com.in28minutes.jee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Browser sends Http Request to Web Server
 * 
 * Code in Web Server => Input:HttpRequest, Output: HttpResponse
 * JEE with Servlets
 * 
 * Web Server responds with Http Response
 */

//Java Platform, Enterprise Edition (Java EE) JEE6

//Servlet is a Java programming language class 
//used to extend the capabilities of servers 
//that host applications accessed by means of 
//a request-response programming model.

//1. extends javax.servlet.http.HttpServlet
//2. @WebServlet(urlPatterns = "/login.do")
//3. doGet(HttpServletRequest request, HttpServletResponse response)
//4. How is the response created?

@WebServlet(urlPatterns = "/start.do")
public class StartServlet extends HttpServlet {

	/*
	 * http://localhost:8080/start.do?name=ranga&password=r
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// GET PARAMETERS
		{
			String name = request.getParameter("name");
			request.setAttribute("name", name);
		}

		{
			String password = request.getParameter("password");
			request.setAttribute("password", password);

		}

		request.getRequestDispatcher("/WEB-INF/views/start.jsp").forward(request, response);

		if (false) {

			PrintWriter out = response.getWriter();
			{
				out.println("<html>");
				out.println("<head>");
				out.println("<title>Yahoo!!!!!!!!</title>");
				out.println("</head>");
				out.println("<body>");
				out.println("My First Servlet");
				out.println("</body>");
				out.println("</html>");
			}
		}

	}

}
