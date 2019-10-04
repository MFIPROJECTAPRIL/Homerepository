package com.crts.app.mfi.main.service;

import java.util.List;

import com.crts.app.mfi.main.model.GuarantorDetails;
import com.crts.app.mfi.main.model.LoanDetails;

public interface Iservice {
	/*
	 * public void saveData(GuarantorDetails s); public List<GuarantorDetails>
	 * getalldata();
	 */
	public LoanDetails updateData(LoanDetails l);
	public List<LoanDetails> getall();
	public void save(LoanDetails e);

}
