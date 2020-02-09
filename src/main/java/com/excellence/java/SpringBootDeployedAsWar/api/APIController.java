package com.excellence.java.SpringBootDeployedAsWar.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APIController {
	
	@GetMapping(path="/greet", produces = MediaType.APPLICATION_JSON_VALUE)
	public String greeting() {
		return "Spring boot application deployed as war!";
	}

}
