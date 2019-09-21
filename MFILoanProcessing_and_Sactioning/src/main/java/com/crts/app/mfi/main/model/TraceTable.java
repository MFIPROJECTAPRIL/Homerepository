package com.crts.app.mfi.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TraceTable {

	@Id
	private int enquiryCustomerTraceId;
	private int enquiryId;
	private int loanType;
	private int customerId;
	private int TraceId;

	public int getEnquiryCustomerTraceId() {
		return enquiryCustomerTraceId;
	}

	public void setEnquiryCustomerTraceId(int enquiryCustomerTraceId) {
		this.enquiryCustomerTraceId = enquiryCustomerTraceId;
	}

	public int getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(int enquiryId) {
		this.enquiryId = enquiryId;
	}

	public int getLoanType() {
		return loanType;
	}

	public void setLoanType(int loanType) {
		this.loanType = loanType;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getTraceId() {
		return TraceId;
	}

	public void setTraceId(int traceId) {
		TraceId = traceId;
	}

}
