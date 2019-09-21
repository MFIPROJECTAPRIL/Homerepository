package com.crts.app.mfi.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.mfi.main.model.Enquiry;
import com.crts.app.mfi.main.repository.ILoanRepository;

@Service
public class Serviceimpl implements Iservice {

	@Autowired
	ILoanRepository il;

	@Override
	public Enquiry savedata(Enquiry enquiry) {
		il.save(enquiry);
		return enquiry;
	}

}
