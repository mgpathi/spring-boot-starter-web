package com.tta.att.Controller;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
@RestController
@EnableAutoConfiguration
@ComponentScan("com")
public class Application {
	
	@RequestMapping("/")
	String home(){
		System.out.println("Hello Ganapathi..! How are you?");
		return "Hello Ganapathi";
	}
	@RequestMapping("/scenario")
	String Door(){
		return "<html><h1>Hello Swathi..</h1></html>";
	}
	public static void main(String args[]) throws Exception{
		SpringApplication.run(Application.class, args);
	}

}
