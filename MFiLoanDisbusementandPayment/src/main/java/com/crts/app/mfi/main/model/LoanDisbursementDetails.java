package com.crts.app.mfi.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class LoanDisbursementDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String loanDisbursementId;
    private String accountHolderName;
    private String customerAccountNo;
    private String loanNumber;
    private String ifsCode;
    @OneToOne(cascade = CascadeType.ALL)
    private MFIBankDetails mfiAccountNo;
    private String date;
    private String disbursedBy;
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoanDisbursementId() {
		return loanDisbursementId;
	}
	public void setLoanDisbursementId(String loanDisbursementId) {
		this.loanDisbursementId = loanDisbursementId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getCustomerAccountNo() {
		return customerAccountNo;
	}
	public void setCustomerAccountNo(String customerAccountNo) {
		this.customerAccountNo = customerAccountNo;
	}
	public String getLoanNumber() {
		return loanNumber;
	}
	public void setLoanNumber(String loanNumber) {
		this.loanNumber = loanNumber;
	}
	public String getIfsCode() {
		return ifsCode;
	}
	public void setIfsCode(String ifsCode) {
		this.ifsCode = ifsCode;
	}
	public MFIBankDetails getMfiAccountNo() {
		return mfiAccountNo;
	}
	public void setMfiAccountNo(MFIBankDetails mfiAccountNo) {
		this.mfiAccountNo = mfiAccountNo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDisbursedBy() {
		return disbursedBy;
	}
	public void setDisbursedBy(String disbursedBy) {
		this.disbursedBy = disbursedBy;
	}
	
}
