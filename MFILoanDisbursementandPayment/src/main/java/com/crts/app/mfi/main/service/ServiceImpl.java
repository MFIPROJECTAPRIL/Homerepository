package com.crts.app.mfi.main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.mfi.main.model.LedgerDetails;
import com.crts.app.mfi.main.repository.IledgerDetailsRepository;

@Service
public class ServiceImpl implements Iservice {
	@Autowired
	IledgerDetailsRepository lr;

	@Override
	public void saveData(LedgerDetails l) {
		lr.save(l);
		
		
	}
	public List<LedgerDetails> getall()
	
	{
		
		 List<LedgerDetails> l=	(List<LedgerDetails>) lr.findAll();
		return l;
	}

}
