package edu.fa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.fa.model.Fresher;

@Controller
public class LoginController {
	@RequestMapping(value = "login")
	public ModelAndView showLogin() {
		
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("fresher", new Fresher("Ninhlt", "java"));
		return mav;
	
	}
}
