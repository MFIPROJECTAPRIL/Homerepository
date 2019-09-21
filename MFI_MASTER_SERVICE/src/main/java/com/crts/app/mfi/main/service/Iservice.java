package com.crts.app.mfi.main.service;

import com.crts.app.mfi.main.model.Branch;
import com.crts.app.mfi.main.model.District;
import com.crts.app.mfi.main.model.Role;
import com.crts.app.mfi.main.model.State;
import com.crts.app.mfi.main.model.Status;
import com.crts.app.mfi.main.model.Taluka;
import com.crts.app.mfi.main.model.User;

public interface Iservice {

	
	public State insertState(State s);
	public District insertDistrict(District d);
	public Taluka insertTaluka(Taluka t);
	public Branch insertBranch(Branch b);
	public User  insertUser(User u);
	public Role insertRole(Role r);
	public Status insertStatus(Status s);
	
}
