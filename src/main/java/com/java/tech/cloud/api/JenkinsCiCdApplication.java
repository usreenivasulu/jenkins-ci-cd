package com.java.tech.cloud.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsCiCdApplication {
	
	@GetMapping("/greetings/{name}")
	public String greetings(@PathVariable String name) {
		name = name.split(" ")[0];
		return "Hello "+name + "Congratuallations you have successfully completed jenkins CI CD Demo pipeline";
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsCiCdApplication.class, args);
	}

}
