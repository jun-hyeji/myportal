package com.bitacademy.myportal.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/hello")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("/WEB-INF/views/home.jsp");
		
		return mav;
	}
}