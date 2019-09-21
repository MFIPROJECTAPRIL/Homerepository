package com.crts.app.mfi.main.service;

import java.util.List;

import com.crts.app.mfi.main.model.GuarantorDetails;

public interface Iservice {
	public void saveData(GuarantorDetails s);
	public List<GuarantorDetails> getalldata();

}
