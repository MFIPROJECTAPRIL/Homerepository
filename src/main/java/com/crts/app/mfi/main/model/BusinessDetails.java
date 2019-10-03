package com.crts.app.mfi.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class BusinessDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String businessType,customerName,businessAddress;
	private float netIncome;
	private int numberOfFamilyMembers,dependentMembers;
	private float familyIncome;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getBusinessAddress() {
		return businessAddress;
	}
	public void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;
	}
	public float getNetIncome() {
		return netIncome;
	}
	public void setNetIncome(float netIncome) {
		this.netIncome = netIncome;
	}
	public int getNumberOfFamilyMembers() {
		return numberOfFamilyMembers;
	}
	public void setNumberOfFamilyMembers(int numberOfFamilyMembers) {
		this.numberOfFamilyMembers = numberOfFamilyMembers;
	}
	public int getDependentMembers() {
		return dependentMembers;
	}
	public void setDependentMembers(int dependentMembers) {
		this.dependentMembers = dependentMembers;
	}
	public float getFamilyIncome() {
		return familyIncome;
	}
	public void setFamilyIncome(float familyIncome) {
		this.familyIncome = familyIncome;
	}
	
	@ManyToOne
	@JoinColumn(name="c_id")
	private CustomerForm customerList;
	public CustomerForm getCustomer() {
		return customerList;
	}
	public void setCustomer(CustomerForm customerList) {
		this.customerList = customerList;
	}

}
