package com.crts.app.mfi.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class LoanDisbustmentDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String loanDisbustmentid;
	private String loanNumber;
	private String customerAccountno;
	private String Ifscode;
	private String accountHoldername;
	@OneToOne(cascade = CascadeType.ALL)
	private MfiDetails mfiaccountno;
	private String date;
	private int status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoanDisbustmentid() {
		return loanDisbustmentid;
	}
	public void setLoanDisbustmentid(String loanDisbustmentid) {
		this.loanDisbustmentid = loanDisbustmentid;
	}
	public String getLoanNumber() {
		return loanNumber;
	}
	public void setLoanNumber(String loanNumber) {
		this.loanNumber = loanNumber;
	}
	public String getCustomerAccountno() {
		return customerAccountno;
	}
	public void setCustomerAccountno(String customerAccountno) {
		this.customerAccountno = customerAccountno;
	}
	public String getIfscode() {
		return Ifscode;
	}
	public void setIfscode(String ifscode) {
		Ifscode = ifscode;
	}
	public String getAccountHoldername() {
		return accountHoldername;
	}
	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}
	public MfiDetails getMfiaccountno() {
		return mfiaccountno;
	}
	public void setMfiaccountno(MfiDetails mfiaccountno) {
		this.mfiaccountno = mfiaccountno;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
