package com.crts.app.mfi.main.service;

import com.crts.app.mfi.main.model.Branch;
import com.crts.app.mfi.main.model.District;
import com.crts.app.mfi.main.model.Role;
import com.crts.app.mfi.main.model.State;
import com.crts.app.mfi.main.model.Status;
import com.crts.app.mfi.main.model.Taluka;
import com.crts.app.mfi.main.model.User;

public interface Iservice 
{
	public Branch insertBranch(Branch branch);
	public District insertDistrict(District district);
	public Role insertRole(Role role);
	public State insertState(State state);
	public Status insertStatus(Status status);
	public Taluka insertTaluka(Taluka taluka);
	public User insertUser(User user);

}
