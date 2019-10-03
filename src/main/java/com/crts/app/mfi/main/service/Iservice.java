package com.crts.app.mfi.main.service;



import java.util.List;

import com.crts.app.mfi.main.dto.CustomerDetailsDto;
import com.crts.app.mfi.main.model.CustomerForm;
import com.crts.app.mfi.main.model.LoanDetails;
import com.crts.app.mfi.main.model.LoanDisbursementDetails;



public interface Iservice 
{
	
	public void savedata(CustomerForm cd);

	public CustomerDetailsDto getdata(String customerCode);

	public List<LoanDetails> getSanctionLoan(int status);

	public void saveSanctionLoan(LoanDetails sc);

	public LoanDetails getSanctionCustomers(int id);

	public void saveDisCustomers(LoanDisbursementDetails ld);

	public List<LoanDisbursementDetails> getDisCustomers(int status);

	public LoanDisbursementDetails getDisbursedCustomers(int id);

	

}
