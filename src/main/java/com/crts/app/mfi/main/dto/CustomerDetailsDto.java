package com.crts.app.mfi.main.dto;

import com.crts.app.mfi.main.model.BankDetails;
import com.crts.app.mfi.main.model.BusinessDetails;
import com.crts.app.mfi.main.model.CurrentLoanDetails;
import com.crts.app.mfi.main.model.GuarantorDetails;
import com.crts.app.mfi.main.model.LoanDetails;
import com.crts.app.mfi.main.model.PreviousLoanDetails;
import com.crts.app.mfi.main.model.documentsDetails;

public class CustomerDetailsDto
{
	private String customerCode;
	
	private String name;
	private String mobileNo;
	private String address;
	private  String emailId;
	
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	private  GuarantorDetails guarantordetails;
	private  BankDetails bankdetails;
	private BusinessDetails businessdetails;
	private CurrentLoanDetails currentloandetails;
	private documentsDetails documentdetails;
	private PreviousLoanDetails previousloandetails;
	
	/*
	 * public CustomerDetailsDto(String customercode,String name,String
	 * mobileNo,String address,String emailId, GuarantorDetails
	 * guarantordetails,BankDetails bankdetails, BusinessDetails businessdetails,
	 * CurrentLoanDetails currentloandetails ,documentsDetails
	 * documentdetails,PreviousLoanDetails previousloandetails ) {
	 * this.customerCode=customercode; this.name=name; this.mobileNo=mobileNo;
	 * this.address=address; this.emailId=emailId;
	 * this.guarantordetails=guarantordetails; this.bankdetails=bankdetails;
	 * this.businessdetails=businessdetails;
	 * this.currentloandetails=currentloandetails;
	 * this.documentdetails=documentdetails;
	 * this.previousloandetails=previousloandetails;
	 * 
	 * }
	 */

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}





	public GuarantorDetails getGuarantordetails() {
		return guarantordetails;
	}

	public void setGuarantordetails(GuarantorDetails guarantordetails) {
		this.guarantordetails = guarantordetails;
	}

	public BankDetails getBankdetails() {
		return bankdetails;
	}

	public void setBankdetails(BankDetails bankdetails) {
		this.bankdetails = bankdetails;
	}

	public BusinessDetails getBusinessdetails() {
		return businessdetails;
	}

	public void setBusinessdetails(BusinessDetails businessdetails) {
		this.businessdetails = businessdetails;
	}

	public CurrentLoanDetails getCurrentloandetails() {
		return currentloandetails;
	}

	public void setCurrentloandetails(CurrentLoanDetails currentloandetails) {
		this.currentloandetails = currentloandetails;
	}

	public documentsDetails getDocumentdetails() {
		return documentdetails;
	}

	public void setDocumentdetails(documentsDetails documentdetails) {
		this.documentdetails = documentdetails;
	}

	public PreviousLoanDetails getPreviousloandetails() {
		return previousloandetails;
	}

	public void setPreviousloandetails(PreviousLoanDetails previousloandetails) {
		this.previousloandetails = previousloandetails;
	}

	
}
