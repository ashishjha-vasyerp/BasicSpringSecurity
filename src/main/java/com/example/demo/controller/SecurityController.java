package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class SecurityController {
	
	@GetMapping("/start")
	public String start()
	{
		return "lets start the security";
	}
	
	@GetMapping("/end")
	public String end()
	{
		return "security ended";
	}
	

}
