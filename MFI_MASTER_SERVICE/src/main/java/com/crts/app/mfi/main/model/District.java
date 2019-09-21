package com.crts.app.mfi.main.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class District {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int districtId;
	private String districtName;
	private int districtStatus;
	
	

	@OneToMany(cascade = CascadeType.ALL)
	private List<Taluka> taluka;
	


	public List<Taluka> getTaluka() {
		return taluka;
	}

	public void setTaluka(List<Taluka> taluka) {
		this.taluka = taluka;
	}

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public int getDistrictStatus() {
		return districtStatus;
	}

	public void setDistrictStatus(int districtStatus) {
		this.districtStatus = districtStatus;
	}

	}
