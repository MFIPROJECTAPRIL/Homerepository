package com.crts.app.mfi.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LedgerDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String loanNo;
	private String emiDueDate;
	private String emiPaidDate;
	private float emiAmount;
	private float emiPaidAmount;
	private float balanceAmount;
	private float closingAmount;
	private float interestAmount;
	private float principalAmount;
	private float charges;
	private int status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(String loanNo) {
		this.loanNo = loanNo;
	}
	public String getEmiDueDate() {
		return emiDueDate;
	}
	public void setEmiDueDate(String emiDueDate) {
		this.emiDueDate = emiDueDate;
	}
	public String getEmiPaidDate() {
		return emiPaidDate;
	}
	public void setEmiPaidDate(String emiPaidDate) {
		this.emiPaidDate = emiPaidDate;
	}
	public float getEmiAmount() {
		return emiAmount;
	}
	public void setEmiAmount(float emiAmount) {
		this.emiAmount = emiAmount;
	}
	public float getEmiPaidAmount() {
		return emiPaidAmount;
	}
	public void setEmiPaidAmount(float emiPaidAmount) {
		this.emiPaidAmount = emiPaidAmount;
	}
	public float getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(float balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	public float getClosingAmount() {
		return closingAmount;
	}
	public void setClosingAmount(float closingAmount) {
		this.closingAmount = closingAmount;
	}
	public float getInterestAmount() {
		return interestAmount;
	}
	public void setInterestAmount(float interestAmount) {
		this.interestAmount = interestAmount;
	}
	public float getPrincipalAmount() {
		return principalAmount;
	}
	public void setPrincipalAmount(float principalAmount) {
		this.principalAmount = principalAmount;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
	
	
}
