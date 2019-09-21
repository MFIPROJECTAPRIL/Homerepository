package com.crts.app.mfi.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.mfi.main.model.PaymentAcknowledgeLetter;
import com.crts.app.mfi.main.service.Iservice;

@RestController
public class HomeController 
{
	@Autowired
	Iservice is;
	
	@RequestMapping(value = "/")
    public String landingPage()
    {
    	return "Hello";
    }
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public void saveData(@RequestBody PaymentAcknowledgeLetter pal)
	{
	    	is.saveData(pal);
	}
}
