package com.crts.app.mfi.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.mfi.main.model.LedgerDetails;
import com.crts.app.mfi.main.service.Iservice;

@RestController
public class HomeController {
@Autowired
Iservice is;
	@RequestMapping("/")
	public String LandingPage()
	{
		return "Hello";
		
	}
	@RequestMapping(value="reg", method=RequestMethod.POST)
	public LedgerDetails savedata(@RequestBody LedgerDetails ld) {
		is.savedata(ld);
		return ld;
		
	}
}
