package com.sd.tech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {
	
	@GetMapping("/message")
	public String getHello(@RequestParam String name)
	{
		return "Hello "+name+" "+com.sd.tech.util.MessageUtility.getWishMessage();
	}

}
