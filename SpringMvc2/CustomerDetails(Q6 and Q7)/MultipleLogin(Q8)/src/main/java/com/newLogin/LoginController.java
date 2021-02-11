package com.newLogin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
@RequestMapping("/login")
@ResponseBody
public String checkUser(@RequestParam("id") String a , @RequestParam("login_password") String b ) {
	return "Successfull login";
}
}
