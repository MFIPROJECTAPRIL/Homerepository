package com.crts.app.mfi.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.mfi.main.dto.CustomerDetailsDto;
import com.crts.app.mfi.main.model.CustomerForm;


import com.crts.app.mfi.main.model.LoanDetails;
import com.crts.app.mfi.main.model.LoanDisbursementDetails;
import com.crts.app.mfi.main.service.Iservice;

@CrossOrigin("*")
@RestController
public class HomeController {

	@Autowired
	Iservice sr;
	
	
	@RequestMapping(value = "/savedataDto", method = RequestMethod.POST)
	public void savedata(@RequestBody CustomerForm cd)
	{
		sr.savedata(cd);
	}
		
		@RequestMapping(value = "/getalldata/{customerCode}",method = RequestMethod.GET)
		public CustomerDetailsDto getalldata(@PathVariable String customerCode)
		{ 
			CustomerDetailsDto cd=sr.getdata(customerCode);
			return cd;
			
		}
		
		@RequestMapping(value = "/savediscustomers", method = RequestMethod.POST)
		public void saveDisCustomers(@RequestBody LoanDisbursementDetails  ld)
		{
			
			sr.saveDisCustomers(ld);
		}
		
		

		@RequestMapping(value = "/getdiscustomers/{status}",method = RequestMethod.GET)
		public List<LoanDisbursementDetails> getDisCustomers(@PathVariable int status)
		{ 

			  System.out.println("in sanction");
			  if(status==18)
			  {
			  List<LoanDisbursementDetails> ld  =sr.getDisCustomers(status);
			  return ld;
			  }
			  
			return null;
			 
			
		}
		
		  @RequestMapping(value = "/getdisbursecus/{id}",method = RequestMethod.GET)
			public LoanDisbursementDetails getDisbursedCus(@PathVariable int id)
			{ 
			  LoanDisbursementDetails ld=sr.getDisbursedCustomers(id);
				return ld;
				
			}
	
		
		
		@RequestMapping(value = "/savesanctionloan", method = RequestMethod.POST)
		public void saveSanctionLoan(@RequestBody LoanDetails  sc)
		{
			
			sr.saveSanctionLoan(sc);
		}
	
	
	
	  @RequestMapping(value = "/getsanctionloan/{status}",method =  RequestMethod.GET)
	  public List<LoanDetails> getSanctionLoan(@PathVariable int status) 
	  { 
		  System.out.println("in sanction");
		  if(status==12)
		  {
		  List<LoanDetails> ld  =sr.getSanctionLoan(status);
		  return ld;
		  }
		  
		return null;
		 
	  }
	  
	  @RequestMapping(value = "/getsanctioncus/{id}",method = RequestMethod.GET)
		public LoanDetails getSanctionCus(@PathVariable int id)
		{ 
		  LoanDetails ld=sr.getSanctionCustomers(id);
			return ld;
			
		}
	  
	  
	 
}
