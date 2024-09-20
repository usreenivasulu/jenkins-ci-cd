package com.java.tech.cloud.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsCiCdApplication {

	@GetMapping("/greet")
	public String greeting() {
		String greet = "Hello!!!!Congratuallations you have successfully completed jenkins CI CD Demo pipeline";
		return greet;
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsCiCdApplication.class, args);
	}

}
