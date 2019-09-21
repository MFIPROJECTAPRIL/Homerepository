package com.crts.app.mfi.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role 
{
	@Id
	private int roleId;
	private String roleName;
	private int status;
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	

}
