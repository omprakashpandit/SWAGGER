package com.pak;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(value = "/api",method = RequestMethod.GET)
	public String sayHello() {
		return "Swagger Hello World";
	}
}
