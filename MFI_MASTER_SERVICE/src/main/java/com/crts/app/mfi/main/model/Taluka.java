package com.crts.app.mfi.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Taluka {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int talukaId;
	private String talukaName;
	private String talukaStatus;
	private int pinCode;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Branch branch;
	
	public int getTalukaId() {
		return talukaId;
	}
	public void setTalukaId(int talukaId) {
		this.talukaId = talukaId;
	}
	public String getTalukaName() {
		return talukaName;
	}
	public void setTalukaName(String talukaName) {
		this.talukaName = talukaName;
	}
	public String getTalukaStatus() {
		return talukaStatus;
	}
	public void setTalukaStatus(String talukaStatus) {
		this.talukaStatus = talukaStatus;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	/*
	 * public District getDistrict() { return district; } public void
	 * setDistrict(District district) { this.district = district; }
	 */
}
