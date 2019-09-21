package com.crts.app.mfi.main.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Enquiry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String enquiryId;

	@OneToMany(cascade = CascadeType.ALL)
	private Set<Customer_Details> customerdetails = new HashSet<>();
	private String enquiryDate;
	private int Status;
	private String enquiryType;
	private String groupCode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(String enquiryId) {
		this.enquiryId = enquiryId;
	}

	public Set<Customer_Details> getCustomerdetails() {
		return customerdetails;
	}

	public void setCustomerdetails(Set<Customer_Details> customerdetails) {
		this.customerdetails = customerdetails;
	}
	public Set<Customer_Details> getCustomerdetail() {
		return customerdetails;
	}

	public void setCustomerdetail(Set<Customer_Details> customerdetail) {
		this.customerdetails = customerdetail;
	}

	public String getEnquiryDate() {
		return enquiryDate;
	}

	public void setEnquiryDate(String enquiryDate) {
		this.enquiryDate = enquiryDate;
	}

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

	public String getEnquiryType() {
		return enquiryType;
	}

	public void setEnquiryType(String enquiryType) {
		this.enquiryType = enquiryType;
	}

	public String getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

}
