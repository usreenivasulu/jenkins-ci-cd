package com.java.tech.cloud.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest
class JenkinsCiCdApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testGreetingsEndpoint() throws Exception {
		String name ="Sreenivasulu urimindi";
		mockMvc.perform(MockMvcRequestBuilders.get("/greetings/{name}",name))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().string("Hello "+name + "Congratuallations you have successfully completed jenkins CI CD Demo pipeline"));
		
	}

}
