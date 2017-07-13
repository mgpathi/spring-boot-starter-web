package com.tta.att.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoviesController {

	@RequestMapping("/movies")
	String getMovie(){
		return "Spyder";
	}
	@RequestMapping("/plays")
	String getPlay(){
		return "Cricket";
	}
	@RequestMapping("/events")
	String getEvent(){
		return "SAREGAMA";
	}
}
