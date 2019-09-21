package com.crts.app.mfi.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.mfi.main.repository.ILoanDisbustmentAndDetailsRepository;
import com.crts.app.mfi.main.repository.IMfiDetailsRepository;
import com.crts.app.mfi.main.repository.IPaymentDetailsRepository;
import com.crts.app.mfi.main.repository.IledgerRepository;

@Service
public class ServiceImpl implements Iservice
{
	@Autowired
	IledgerRepository lr;
	@Autowired
	ILoanDisbustmentAndDetailsRepository ll;
	@Autowired
	IMfiDetailsRepository ml;
	@Autowired
	IPaymentDetailsRepository pr;
}
