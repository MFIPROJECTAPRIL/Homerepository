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
public class HomeController 
{
	@Autowired
	Iservice si;
	
	
	@RequestMapping("/branch")
	public Branch saveBranch(@RequestBody Branch branch)
	{
		
		return si.insertBranch(branch);
	}
	
	@RequestMapping("/district")
	public District saveDistrict(@RequestBody District district)
	{
		return si.insertDistrict(district);
	}

	@RequestMapping("/role")
	public Role saveRole(@RequestBody Role role)
	{
		return si.insertRole(role);
	}
	
	@RequestMapping("/state")
	public State saveState(@RequestBody State state)
	{
		return si.insertState(state);
	}
	
	@RequestMapping("/status")
	public Status saveStatus(@RequestBody Status status)
	{
		return si.insertStatus(status);
	}
	
	@RequestMapping("/taluka")
	public Taluka saveTaluka(@RequestBody Taluka taluka)
	{
		return si.insertTaluka(taluka);
	}
	
	@RequestMapping("/user")
	public User saveUser(@RequestBody User user)
	{
		return si.insertUser(user);
	}
	
	
	

}
