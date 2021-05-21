package com.aws.code.build;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Messages")
@RestController
public class MessageController {
	
	@GetMapping
	public String message() {
		
		return "Code Pipeline Implementation";
	}
 
}
