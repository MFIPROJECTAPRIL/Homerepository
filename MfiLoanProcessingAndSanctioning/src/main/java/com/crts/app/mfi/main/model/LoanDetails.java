package com.crts.app.mfi.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoanDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String loanNumber,applicationId,loanSanctionDate;
	private float loanAmount,interestAmount,emiAmount,insuranceAmount,processingCharges,roi,loanTotalAmount,documentCharges,naukarCharges;
	private int status,tenure;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoanNumber() {
		return loanNumber;
	}
	public void setLoanNumber(String loanNumber) {
		this.loanNumber = loanNumber;
	}
	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	public String getLoanSanctionDate() {
		return loanSanctionDate;
	}
	public void setLoanSanctionDate(String loanSanctionDate) {
		this.loanSanctionDate = loanSanctionDate;
	}
	public float getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}
	public float getInterestAmount() {
		return interestAmount;
	}
	public void setInterestAmount(float interestAmount) {
		this.interestAmount = interestAmount;
	}
	public float getEmiAmount() {
		return emiAmount;
	}
	public void setEmiAmount(float emiAmount) {
		this.emiAmount = emiAmount;
	}
	public float getInsuranceAmount() {
		return insuranceAmount;
	}
	public void setInsuranceAmount(float insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}
	public float getProcessingCharges() {
		return processingCharges;
	}
	public void setProcessingCharges(float processingCharges) {
		this.processingCharges = processingCharges;
	}
	public float getRoi() {
		return roi;
	}
	public void setRoi(float roi) {
		this.roi = roi;
	}
	public float getLoanTotalAmount() {
		return loanTotalAmount;
	}
	public void setLoanTotalAmount(float loanTotalAmount) {
		this.loanTotalAmount = loanTotalAmount;
	}
	public float getDocumentCharges() {
		return documentCharges;
	}
	public void setDocumentCharges(float documentCharges) {
		this.documentCharges = documentCharges;
	}
	public float getNaukarCharges() {
		return naukarCharges;
	}
	public void setNaukarCharges(float naukarCharges) {
		this.naukarCharges = naukarCharges;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	

}
