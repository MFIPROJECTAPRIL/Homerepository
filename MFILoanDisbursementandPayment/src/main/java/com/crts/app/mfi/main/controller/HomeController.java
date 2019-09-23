package com.crts.app.mfi.main.controller;

import java.util.List;

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
	public String landingPage()
	{
		return "hello";
	}
	@RequestMapping(value = "/savedData",method = RequestMethod.POST)
	public void save(@RequestBody LedgerDetails l )
	{
		is.saveData(l);
	}
	@RequestMapping(value = "/getall",method = RequestMethod.GET)
	public  List<LedgerDetails> getall()
	{
		return is.getall();
		
	}

}
