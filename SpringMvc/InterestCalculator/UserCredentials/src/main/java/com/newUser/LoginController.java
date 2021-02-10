package com.newUser;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@ResponseBody
	@RequestMapping("/login")
public ModelAndView welcomeUser(@RequestParam("userName") String u,@RequestParam("passWord") String p,@RequestParam("email") String e ) {
		ModelAndView m = new ModelAndView();
	UserAuthenticator q = new UserAuthenticator();
	ModelAndView w=q.getAuthentication(u, p, e);
	
	return w;
}


}
