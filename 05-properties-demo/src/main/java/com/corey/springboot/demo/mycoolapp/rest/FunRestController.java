package com.corey.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	
	// Inject properties for: coach.name and team.name
	
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	// Expose new endpoint for "teaminfo"
	
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		
		return "Coach: " + coachName + ", Team name: " + teamName;
	}
	
	// Expose "/" that returns "Hello World"
	
	@GetMapping("/")
	public String sayHello() {
		
		return "Hello World of Spring Boot! Time on server is " + LocalDateTime.now();
	}
	
	// Expose a new endpoint for "workout"
	@GetMapping("/workout")
	public String getDailyWorkout() {
		
		return "Do 100 push-ups!";
	}
	
	// Expose a new endpoint for "fortune"
		@GetMapping("/fortune")
		public String getDailyFortune() {
			
			return "Today will be a great day!";
		}

}
