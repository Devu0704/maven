package com.app.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {
	
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;

	//Expose "/" endpoint
	@GetMapping("/")
	public String getData()
	{
		return "Hello World !!! Time on Server is " + LocalDateTime.now();
	}
	
	@GetMapping("/teamInfo")
	public String teamInfo()
	{
		return "Coach Name = " + coachName + "\nTeam Name = " + teamName;
	}

}
