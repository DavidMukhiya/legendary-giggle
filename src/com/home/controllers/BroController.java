package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/bro")
public class BroController {
	
	@RequestMapping("/soccerball")
	public String giveCricketBat() {
		return "SoccerBall";
	}
}
