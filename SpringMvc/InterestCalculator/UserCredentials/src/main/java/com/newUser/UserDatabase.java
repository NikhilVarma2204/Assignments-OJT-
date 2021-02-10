package com.newUser;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class UserDatabase {
	ArrayList<User>list= new ArrayList<User>();
	@RequestMapping("/register")
	public void addUserToDataBase() {
		User u1= new User("Adam","123","Adam123");
		User u2= new User("Max","qwe","Maxqwe");
		User u3= new User("Tyson","asd","Tysonasd");
		list.add(u1);
		list.add(u2);
		list.add(u3);
		
		
	}
}
