package com.bitacademy.myportal.contoller;

@Controller
public class MainController {
	@RequestMapping("/main")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "Hello, " + name);
		mav.setViewName("/WEB-INF/views/home.jsp");
		return mav;
	}
}