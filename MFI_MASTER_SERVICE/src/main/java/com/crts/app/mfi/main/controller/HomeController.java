package com.crts.app.mfi.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.mfi.main.model.Branch;
import com.crts.app.mfi.main.model.District;
import com.crts.app.mfi.main.model.Role;
import com.crts.app.mfi.main.model.State;
import com.crts.app.mfi.main.model.Status;
import com.crts.app.mfi.main.model.Taluka;
import com.crts.app.mfi.main.model.User;
import com.crts.app.mfi.main.service.Iservice;

@CrossOrigin("*")
@RestController
public class HomeController {

	@Autowired
	Iservice si;
	
	@RequestMapping("/state")
	public State saveState(@RequestBody State s)
	{
		
		return si.insertState(s);
	}
	
	@RequestMapping("/district")
	public District saveDistrict(@RequestBody District d)
	{
		
		return si.insertDistrict(d);
	}
	
	
	@RequestMapping("/taluka")
	public Taluka saveTaluka(@RequestBody Taluka t)
	{
		
		return si.insertTaluka(t);
	}
	
	@RequestMapping("/branch")
	public Branch saveBranch(@RequestBody Branch b)
	{
		return si.insertBranch(b);
	}
	
	@RequestMapping("/user")
	public User saveUser(@RequestBody User u)
	{
		
		return si.insertUser(u);
	}
	
	@RequestMapping("/role")
	public Role saveRole(@RequestBody Role r)
	{
		return si.insertRole(r);
	}
	
	@RequestMapping("/status")
	public Status saveStatus(@RequestBody Status s)
	{
		
		return si.insertStatus(s);
	}
}
