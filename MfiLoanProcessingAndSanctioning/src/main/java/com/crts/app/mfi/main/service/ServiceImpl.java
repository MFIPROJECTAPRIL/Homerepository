package com.crts.app.mfi.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.mfi.main.model.GuarantorDetails;
import com.crts.app.mfi.main.repository.HomeRepository;

@Service
public class ServiceImpl implements Iservice {

	@Autowired
	HomeRepository hr;
	
	@Override
	public void saveData(GuarantorDetails s) {
		hr.save(s);
		
	}

	@Override
	public List<GuarantorDetails> getalldata() {
	List<GuarantorDetails> glist=	(List<GuarantorDetails>) hr.findAll();
		return glist;
	}

}
