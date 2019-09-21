package com.crts.app.mfi.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.mfi.main.model.Branch;
import com.crts.app.mfi.main.model.District;
import com.crts.app.mfi.main.model.Role;
import com.crts.app.mfi.main.model.State;
import com.crts.app.mfi.main.model.Status;
import com.crts.app.mfi.main.model.Taluka;
import com.crts.app.mfi.main.model.User;
import com.crts.app.mfi.main.repository.IBranchRepository;
import com.crts.app.mfi.main.repository.IDistrictRepository;
import com.crts.app.mfi.main.repository.IRoleRepository;
import com.crts.app.mfi.main.repository.IStateRepository;
import com.crts.app.mfi.main.repository.IStatusRepository;
import com.crts.app.mfi.main.repository.ITalukaRepository;
import com.crts.app.mfi.main.repository.IUserRepository;

@Service
public class Iserviceimpl implements Iservice{

	@Autowired
	IStateRepository sr;
	@Autowired
	IDistrictRepository dr;
	@Autowired
	ITalukaRepository tr;
	@Autowired
	IUserRepository ur;
	@Autowired
	IRoleRepository rr;
	@Autowired
	IStatusRepository str;
	@Autowired
	IBranchRepository br;
	
	@Override
	public State insertState(State s) {
		
		return sr.save(s);
	}

	@Override
	public District insertDistrict(District d) {
		
		return dr.save(d);
	}

	@Override
	public Taluka insertTaluka(Taluka t) {
		
		return tr.save(t);
	}

	@Override
	public Branch insertBranch(Branch b) {
		
		return br.save(b);
	}

	@Override
	public User insertUser(User u) {
		
		return ur.save(u);
	}

	@Override
	public Role insertRole(Role r) {
		
		return rr.save(r);
	}

	@Override
	public Status insertStatus(Status s) {
		
		return str.save(s);
	}

}
