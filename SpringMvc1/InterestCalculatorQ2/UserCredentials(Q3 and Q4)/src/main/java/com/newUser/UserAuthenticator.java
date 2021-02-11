package com.newUser;

import java.util.ArrayList;

import org.springframework.web.servlet.ModelAndView;

public class UserAuthenticator extends UserDatabase {
	ModelAndView n = new ModelAndView();
	public ModelAndView getAuthentication(String u, String p, String e) {
		for(User t: list) {
			if(t.userName ==u && t.passWord==p && t.email==e) {
				n.setViewName("show1.jsp");
				}
			else n.setViewName("login.jsp");
			}
		return n;
	}
}	
	
	

