package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SisController {
	
	@ResponseBody
	@RequestMapping("/makeup")
	public String makeUp() {
		return "Here is your make up.Take it.";
	}
}
