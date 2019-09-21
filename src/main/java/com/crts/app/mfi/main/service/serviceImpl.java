package com.crts.app.mfi.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.mfi.main.model.PaymentAcknowledgeLetter;
import com.crts.app.mfi.main.repository.IpaymentAcknowledgeLetterRepository;

@Service
public class serviceImpl implements Iservice 
{
     @Autowired
     IpaymentAcknowledgeLetterRepository ial;

	@Override
	public void saveData(PaymentAcknowledgeLetter pal) 
	{
	     ial.save(pal);
	}
	

}
