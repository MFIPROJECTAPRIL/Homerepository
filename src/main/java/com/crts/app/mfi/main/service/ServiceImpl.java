package com.crts.app.mfi.main.service;



import java.util.List;
import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crts.app.mfi.main.dto.CustomerDetailsDto;
import com.crts.app.mfi.main.model.CustomerForm;

import com.crts.app.mfi.main.model.LoanDetails;
import com.crts.app.mfi.main.model.LoanDisbursementDetails;

import com.crts.app.mfi.main.repository.CustomerRepo;
import com.crts.app.mfi.main.repository.HomeRepository;
import com.crts.app.mfi.main.repository.LoanDisbursementRepo;
import com.crts.app.mfi.main.repository.SanctionCusRepository;

@Service
public class ServiceImpl implements Iservice {

	@Autowired
	HomeRepository hr;
	
	@Autowired
	CustomerRepo cr;
	
	@Autowired
	SanctionCusRepository scr;
	
	@Autowired
	LoanDisbursementRepo ldr;
	
	@Override
	public void savedata(CustomerForm cd) 
	{
		
		cr.save(cd);
		
	}

	@Override
	public CustomerDetailsDto getdata(String customerCode) 
	{
		System.out.println("callleddd!!!");
		CustomerForm c= cr.findByCustomerCode(customerCode);
        ModelMapper m=new ModelMapper();
		CustomerDetailsDto cd1=m.map(c, CustomerDetailsDto.class);
		return cd1;
	}

	
	@Override
	public List<LoanDetails> getSanctionLoan(int status) 
	{
		List<LoanDetails> lds=scr.findByStatus(status);
		return lds;
	}

	@Override
	public void saveSanctionLoan(LoanDetails sc)
	{
		scr.save(sc);
		
	}

	@Override
	public LoanDetails getSanctionCustomers(int id) 
	{
		Optional<LoanDetails> ld=scr.findById(id);
		LoanDetails lds=ld.get();
		return lds;
	}

	@Override
	public void saveDisCustomers(LoanDisbursementDetails ld) 
	{
	ldr.save(ld);
		
	}

	@Override
	public List<LoanDisbursementDetails> getDisCustomers(int status) 
	{
		List<LoanDisbursementDetails> ld=ldr.findByStatus(status);
		return ld;
		
		
	}

	@Override
	public LoanDisbursementDetails getDisbursedCustomers(int id) 
	{
		Optional<LoanDisbursementDetails> ldd=ldr.findById(id);
		LoanDisbursementDetails ld=ldd.get();
		return ld;
	}

	
	

}
