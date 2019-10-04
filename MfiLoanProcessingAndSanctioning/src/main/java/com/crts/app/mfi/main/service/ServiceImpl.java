package com.crts.app.mfi.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.crts.app.mfi.main.model.GuarantorDetails;
import com.crts.app.mfi.main.model.LoanDetails;
import com.crts.app.mfi.main.repository.Iloandetailsrepository;

@Service
public class ServiceImpl implements Iservice {

	@Autowired
	Iloandetailsrepository hr;
	/*
	 * @Override public void saveData(GuarantorDetails s) { hr.save(s);
	 * 
	 * }
	 * 
	 * @Override public List<GuarantorDetails> getalldata() { List<GuarantorDetails>
	 * glist= (List<GuarantorDetails>) hr.findAll(); return glist; }
	 */

	@Override
	public LoanDetails updateData(LoanDetails l) {
		// TODO Auto-generated method stub
		return hr.save(l);

	}

	@Override
	public List<LoanDetails> getall() {
		// TODO Auto-generated method stub
		return (List<LoanDetails>) hr.findAll();
	}

	@Override
	public void save(LoanDetails e) {
		// TODO Auto-generated method stub
		hr.save(e);
	}

}
