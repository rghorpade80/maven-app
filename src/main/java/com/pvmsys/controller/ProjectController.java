package com.pvmsys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

	@GetMapping("/hello")
	public String hello(){
		return "Hii";
	}
}
