package com.Nathalie.CodingController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodingController {

@RequestMapping(value = "/coding", method = RequestMethod.GET)
	public String hello() {
		return "Hello Coding Dojo!";
	}

	@RequestMapping(value = "/coding/python", method = RequestMethod.GET)
	private String awesome() {
		return "Python/Django was awesome";
	}
	
	@RequestMapping(value = "/coding/java", method = RequestMethod.GET)
	private String better() {
		return "Java/Spring is better";
	}
}