package com.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlller {
	
	@GetMapping("/welcome")
	public String save() {
		return "Hello World";
	}
}
