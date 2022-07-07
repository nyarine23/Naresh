package com.wipro.firstapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	@GetMapping("/")
	public String home (){
		return"Home Response";
	}
	@GetMapping("/about")
	public String about (){
		return"about Response";
	}
	@GetMapping("/contact")
	public String contact (){
		return"contact Response";
	}


}
