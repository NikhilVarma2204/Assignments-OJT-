package com.newHyper;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class EmployeeList {
	ArrayList<Employee> l = new ArrayList();
	
	@RequestMapping("/add")
	@ResponseBody
	public ModelAndView addEmployee(@RequestParam("eName") String n, @RequestParam("eSalary") int s) {
		Employee e = new Employee();
		e.setName(n);
		e.setSalary(s);
		String r = e.getName();
	   int sal = e.getSalary();
		l.add(e);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("allemployee.jsp");
		mv.addObject("database", l);
		return mv;
		
	}

}
