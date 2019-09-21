package com.crts.app.mfi.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.mfi.main.model.LedgerDetails;
import com.crts.app.mfi.main.repository.IledgerDetailsRepository;

@Service
public class ServiceImple implements Iservice 
{

	@Autowired
	IledgerDetailsRepository ild;
	@Override
	public void savedata(LedgerDetails ld) 
	{
		ild.save(ld);
		
	}

}
