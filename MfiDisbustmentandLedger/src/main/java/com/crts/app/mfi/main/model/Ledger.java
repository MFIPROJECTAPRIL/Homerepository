package com.crts.app.mfi.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ledger {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String loanno;
	private String  emiduedate;
	private String empipaiddate;
	private float emipaidamount;
	private float emiamount;
	private float balanceAmout;
	private float closingamount;
	private float interestAmount;
	private float principleamount;
	private float Charges;
	private int status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoanno() {
		return loanno;
	}
	public void setLoanno(String loanno) {
		this.loanno = loanno;
	}
	public String getEmiduedate() {
		return emiduedate;
	}
	public void setEmiduedate(String emiduedate) {
		this.emiduedate = emiduedate;
	}
	public String getEmpipaiddate() {
		return empipaiddate;
	}
	public void setEmpipaiddate(String empipaiddate) {
		this.empipaiddate = empipaiddate;
	}
	public float getEmipaidamount() {
		return emipaidamount;
	}
	public void setEmipaidamount(float emipaidamount) {
		this.emipaidamount = emipaidamount;
	}
	public float getEmiamount() {
		return emiamount;
	}
	public void setEmiamount(float emiamount) {
		this.emiamount = emiamount;
	}
	public float getBalanceAmout() {
		return balanceAmout;
	}
	public void setBalanceAmout(float balanceAmout) {
		this.balanceAmout = balanceAmout;
	}
	public float getClosingamount() {
		return closingamount;
	}
	public void setClosingamount(float closingamount) {
		this.closingamount = closingamount;
	}
	public float getInterestAmount() {
		return interestAmount;
	}
	public void setInterestAmount(float interestAmount) {
		this.interestAmount = interestAmount;
	}
	public float getPrincipleamount() {
		return principleamount;
	}
	public void setPrincipleamount(float principleamount) {
		this.principleamount = principleamount;
	}
	public float getCharges() {
		return Charges;
	}
	public void setCharges(float charges) {
		Charges = charges;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
