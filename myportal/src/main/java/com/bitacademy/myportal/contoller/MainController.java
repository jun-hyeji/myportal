package com.bitacademy.myportal.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping("/main")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/view/home.jsp");
		return mav;
	}
}
