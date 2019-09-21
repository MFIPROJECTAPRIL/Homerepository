package com.crts.app.mfi.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PaymentDetailes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String loanno;
	private String paymentancknowlegeletter;
	private String date;
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
	public String getPaymentancknowlegeletter() {
		return paymentancknowlegeletter;
	}
	public void setPaymentancknowlegeletter(String paymentancknowlegeletter) {
		this.paymentancknowlegeletter = paymentancknowlegeletter;
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
