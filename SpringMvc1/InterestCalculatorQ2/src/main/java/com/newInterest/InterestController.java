package com.newInterest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InterestController {
	@RequestMapping("/interest")
public ModelAndView Calculator(@RequestParam("P")int p,@RequestParam("T")int t,@RequestParam("R")int r) {
	ModelAndView mv = new ModelAndView();
	ServiceProvider s = new ServiceProvider();
	double in=s.getinterest(p, t, r);
	mv.setViewName("result.jsp");
	 mv.addObject("yourInterest",in);
	return mv;
}
}
