package com.Nathalie.ninjagold;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GoldNinjaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoldNinjaApplication.class, args);
	}

}
