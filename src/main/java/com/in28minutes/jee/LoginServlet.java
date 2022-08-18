package com.in28minutes.jee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.in28minutes.springmvc.login.LoginService;

//@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	private LoginService service = new LoginService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// POST PARAMETERS
		String user = request.getParameter("userName");
		String password = request.getParameter("userPassword");

		boolean isValidUser = service.validateUser(user, password);

		if (isValidUser) {

			request.setAttribute("userName", user);

			// Welcome
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);

		} else {

			request.setAttribute("errorMessage", "Invalid Credentials!");

			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}

	}
}
