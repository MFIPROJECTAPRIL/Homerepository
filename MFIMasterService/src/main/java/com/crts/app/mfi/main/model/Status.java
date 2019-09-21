package com.crts.app.mfi.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Status 
{
	@Id
	private int statusId;
	private String statusCode;
	private String statusDescription;
	
	
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusDescription() {
		return statusDescription;
	}
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}
	
	

}
