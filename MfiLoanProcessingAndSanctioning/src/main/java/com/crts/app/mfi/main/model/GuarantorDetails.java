package com.crts.app.mfi.main.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class GuarantorDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name,address,occupation,applicantRelation,dateOfBirth,mobileNumber,idProofNumber,idProofType,date,gender;
    private int status;
    private String guarantorAdharCard,guarantorPanCard;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getApplicantRelation() {
		return applicantRelation;
	}
	public void setApplicantRelation(String applicantRelation) {
		this.applicantRelation = applicantRelation;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getIdProofNumber() {
		return idProofNumber;
	}
	public void setIdProofNumber(String idProofNumber) {
		this.idProofNumber = idProofNumber;
	}
	public String getIdProofType() {
		return idProofType;
	}
	public void setIdProofType(String idProofType) {
		this.idProofType = idProofType;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getGuarantorAdharCard() {
		return guarantorAdharCard;
	}
	public void setGuarantorAdharCard(String guarantorAdharCard) {
		this.guarantorAdharCard = guarantorAdharCard;
	}
	public String getGuarantorPanCard() {
		return guarantorPanCard;
	}
	public void setGuarantorPanCard(String guarantorPanCard) {
		this.guarantorPanCard = guarantorPanCard;
	}
	
	
}
