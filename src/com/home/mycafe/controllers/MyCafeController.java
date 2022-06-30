package com.home.mycafe.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeController {
	
	@RequestMapping("/cafe")
	public String momCafe(Model model) {
		
		
		
		String myName = "David Mukhiya";
		model.addAttribute("myWebsiteTitle", "MOM'S CAFE");
		model.addAttribute("nameValue", myName);
		return "welcome-page";
		
	}
	@RequestMapping("/processOrder")
	public String processOrder(HttpServletRequest request,Model model) {
		String userEnteredValue = request.getParameter("foodType");
		
		model.addAttribute("userInput", userEnteredValue);
		return "process-order";
	}
}
