package com.CustomerOperations;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerManagement {
@RequestMapping("/register")
@ResponseBody
	public ArrayList<Customer> customerDatabase(@RequestParam("username") String u,@RequestParam("password") String p,@RequestParam("email") String e, @RequestParam("contact") long c,@RequestParam("city") String ci,@RequestParam("zipcode") int z){
	ArrayList<Customer>l = new ArrayList<Customer>();
	Customer c1=  new Customer();
	c1.setCity(ci);
    c1.setContact(c);
    c1.setEmail(e);
    c1.setPassword(p);
    c1.setZipcode(z);
    c1.setUsername(u);
    l.add(c1);
	return l;
		
	}

}
