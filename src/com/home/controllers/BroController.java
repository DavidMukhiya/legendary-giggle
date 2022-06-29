package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/bro")
public class BroController {
	
	@ResponseBody
	@RequestMapping("/cricketbat")
	public String giveCricketBat() {
		return "Here Take it. This is a Cricket Bat.";
	}
}
