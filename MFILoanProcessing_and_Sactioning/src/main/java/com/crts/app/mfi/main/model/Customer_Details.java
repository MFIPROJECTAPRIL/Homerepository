package com.crts.app.mfi.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Customer_Details {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	private String firstname;
	private String middlename;
	private String lastname;
	private String mobileNo;
	private String address;
	private String emailId;
	private String dateofbirth;
	private String gender;
	private String primaryId;
	private String secondaryId;
	private String secondaryIdType;
	private int primaryIdStatus;
	private int secondaryIdstatus;
	private String cibilReport;
	private String cibilScore;
	private String cibilDate;
	private int cibilStatus;
	private int customerDetailStatus;

	@JoinColumn(name = "enquiryId" )
	private Enquiry enquiry;
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
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

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPrimaryId() {
		return primaryId;
	}

	public void setPrimaryId(String primaryId) {
		this.primaryId = primaryId;
	}

	public String getSecondaryId() {
		return secondaryId;
	}

	public void setSecondaryId(String secondaryId) {
		this.secondaryId = secondaryId;
	}

	public String getSecondaryIdType() {
		return secondaryIdType;
	}

	public void setSecondaryIdType(String secondaryIdType) {
		this.secondaryIdType = secondaryIdType;
	}

	public int getPrimaryIdStatus() {
		return primaryIdStatus;
	}

	public void setPrimaryIdStatus(int primaryIdStatus) {
		this.primaryIdStatus = primaryIdStatus;
	}

	public int getSecondaryIdstatus() {
		return secondaryIdstatus;
	}

	public void setSecondaryIdstatus(int secondaryIdstatus) {
		this.secondaryIdstatus = secondaryIdstatus;
	}

	public String getCibilReport() {
		return cibilReport;
	}

	public void setCibilReport(String cibilReport) {
		this.cibilReport = cibilReport;
	}

	public String getCibilScore() {
		return cibilScore;
	}

	public void setCibilScore(String cibilScore) {
		this.cibilScore = cibilScore;
	}

	public String getCibilDate() {
		return cibilDate;
	}

	public void setCibilDate(String cibilDate) {
		this.cibilDate = cibilDate;
	}

	public int getCibilStatus() {
		return cibilStatus;
	}

	public void setCibilStatus(int cibilStatus) {
		this.cibilStatus = cibilStatus;
	}

	public int getCustomerDetailStatus() {
		return customerDetailStatus;
	}

	public void setCustomerDetailStatus(int customerDetailStatus) {
		this.customerDetailStatus = customerDetailStatus;
	}

}
