package com.crts.app.mfi.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PreviousLoanDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String bankName,branchName,previousLoanCaseNumber,previousLoanDate;
	private float loanAmount,emiAmount,outstandingAmount;
    private int previousLoanStatus,tenure;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getPreviousLoanCaseNumber() {
		return previousLoanCaseNumber;
	}
	public void setPreviousLoanCaseNumber(String previousLoanCaseNumber) {
		this.previousLoanCaseNumber = previousLoanCaseNumber;
	}
	public String getPreviousLoanDate() {
		return previousLoanDate;
	}
	public void setPreviousLoanDate(String previousLoanDate) {
		this.previousLoanDate = previousLoanDate;
	}
	public float getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}
	public float getEmiAmount() {
		return emiAmount;
	}
	public void setEmiAmount(float emiAmount) {
		this.emiAmount = emiAmount;
	}
	public float getOutstandingAmount() {
		return outstandingAmount;
	}
	public void setOutstandingAmount(float outstandingAmount) {
		this.outstandingAmount = outstandingAmount;
	}
	public int getPreviousLoanStatus() {
		return previousLoanStatus;
	}
	public void setPreviousLoanStatus(int previousLoanStatus) {
		this.previousLoanStatus = previousLoanStatus;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
    
}
