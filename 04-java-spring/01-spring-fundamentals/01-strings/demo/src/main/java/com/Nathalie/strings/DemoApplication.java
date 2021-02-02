package com.Nathalie.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String hello() {
		return "Hello client.  How are you doing?";
	}
	@RequestMapping("/random")
	public String spring() {
		return "Spring Boot is great. So easy to repond with strings!";
	}

}
