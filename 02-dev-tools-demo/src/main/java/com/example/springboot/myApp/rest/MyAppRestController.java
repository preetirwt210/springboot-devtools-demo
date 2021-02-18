package com.example.springboot.myApp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyAppRestController {

	@Value("${coach.name}")
	 private String coachName;
	 
	@Value("${team.name}")
	 private String teamName;
	
	@GetMapping("/teamInfo")
	public String teamInfo() {
		return "Coach Name: " + coachName + ", Team Name: " + teamName;
	}
	@GetMapping("/")
	public String sayHello(){
		
		return "Hello World! Current Time and Date is : " + LocalDateTime.now();
	}
	
	
	@GetMapping("/workout")
	public String getDailyWorkout(){
		
		return "Run a hard 5km";
	}
	@GetMapping("/fortune")
	public String getDailyFortune(){
		
		return "This is your lucky day";
	}
	
}
