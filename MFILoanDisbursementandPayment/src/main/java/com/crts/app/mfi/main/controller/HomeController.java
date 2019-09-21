package com.crts.app.mfi.main.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.crts.app.mfi.main.service.Iservice;

@RestController
public class HomeController {

	@Autowired
	Iservice iss;
	
	@RequestMapping("/")
	public String LandingPage()
	{
		System.out.println("Startttttt");
		return "Hello";
		
	}
	

}
