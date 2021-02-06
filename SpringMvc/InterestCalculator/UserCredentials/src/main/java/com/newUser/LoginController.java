package com.newUser;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
@RequestMapping("/login")
public ModelAndView sayHello(@RequestParam("Username") String u,@RequestParam("Password") String p ) {
	ModelAndView mv = new ModelAndView();
	if(u.equals("User")&& p.equals("1234")) {
	mv.setViewName("show1.jsp");
	}
	else
		mv.setViewName("login.jsp");
	return mv;
}
}
