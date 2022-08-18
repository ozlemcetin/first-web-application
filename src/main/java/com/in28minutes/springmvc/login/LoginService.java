package com.in28minutes.springmvc.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String user, String password) {

		return (user.equals("in28minutes") && password.equals("dummy"));
	}

}
