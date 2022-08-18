package com.in28minutes.springmvc.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * url -> http://localhost:8080/spring-mvc/login
 * 
 * 
 * Change URL to http://localhost:8080/login
 * 
 * <servlet-mapping>
 * 
 * <servlet-name>dispatcher</servlet-name>
 * 
 * <!--<url-pattern>/spring-mvc/*</url-pattern> -->
 * 
 * <url-pattern>/</url-pattern>
 * 
 * </servlet-mapping>
 */

@Controller
public class LoginController {

	// private LoginService service = new LoginService();

	@Autowired
	private LoginService service;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {

		// view -> /WEB-INF/views/login.jsp
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String userName, @RequestParam String userPassword,
			ModelMap modelMap) {

		boolean isValidUser = service.validateUser(userName, userPassword);

		if (!isValidUser) {

			modelMap.put("errorMessage", "Invalid Credentials!");

			return "login";
		}

		modelMap.put("userName", userName);

		return "welcome";
	}

}
