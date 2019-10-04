package com.crts.app.mfi.main.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class CustomerForm {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String customerCode;
	private String name;
	private String mobileNo;
	private String address;
	private String emailId;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="g_id")
	private GuarantorDetails guarantordetails;
	
	
	public GuarantorDetails getGuarantordetails() {
		return guarantordetails;
	}
	public void setGuarantordetails(GuarantorDetails guarantordetails) {
		this.guarantordetails = guarantordetails;
	}


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="bank_id")
	private BankDetails bankdetails ;
	
	public BankDetails getBankdetails() {
		return bankdetails;
	}
	public void setBankdetails(BankDetails bankdetails) {
		this.bankdetails = bankdetails;
	}


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="currentloan_id")
	private CurrentLoanDetails currentloandetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="document_id")
	private documentsDetails documentdetails;
	

	public CurrentLoanDetails getCurrentloandetails() {
		return currentloandetails;
	}
	public void setCurrentloandetails(CurrentLoanDetails currentloandetails) {
		this.currentloandetails = currentloandetails;
	}
	
	public BusinessDetails getBusinessDetails() {
		return businessDetails;
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
	public void setBusinessDetails(BusinessDetails businessDetails) {
		this.businessDetails = businessDetails;
	}
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="previousloandetails_id")
	private PreviousLoanDetails previousloandetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="business_id")
	private BusinessDetails businessDetails;
	
	
}
