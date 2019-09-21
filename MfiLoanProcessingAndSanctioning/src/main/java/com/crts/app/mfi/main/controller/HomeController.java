package com.crts.app.mfi.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.mfi.main.model.GuarantorDetails;
import com.crts.app.mfi.main.service.Iservice;

@RestController
public class HomeController {

	@Autowired
	Iservice sr;
	
	@RequestMapping(value="/savedata",method = RequestMethod.POST)
	public void saveDetails(@RequestBody GuarantorDetails gd)
	{
		sr.saveData(gd);
		System.out.println("inserted");
	}
	@RequestMapping(value = "/getall",method=RequestMethod.GET)
	public List<GuarantorDetails> getdata()
	{
		List<GuarantorDetails> glist=sr.getalldata();
		return glist;
		
	}
}
