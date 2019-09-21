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
public class Iserviceimpl implements Iservice {

	@Autowired
	IBranchRepository br;
	@Autowired
	IDistrictRepository dr;
	@Autowired
	IRoleRepository rr;
	@Autowired
	IStateRepository sr;
	@Autowired
	IStatusRepository str;
	@Autowired
	ITalukaRepository tr;
	@Autowired
	IUserRepository ur;

	@Override
	public Branch insertBranch(Branch branch) {
		return br.save(branch);
	}

	@Override
	public District insertDistrict(District district) {
		return dr.save(district);
	}

	@Override
	public Role insertRole(Role role) {
		return rr.save(role);
	}

	@Override
	public State insertState(State state) {
		return sr.save(state);
	}

	@Override
	public Status insertStatus(Status status) {
		return str.save(status);
	}

	@Override
	public Taluka insertTaluka(Taluka taluka) {
		return tr.save(taluka);
	}

	@Override
	public User insertUser(User user) {
		return ur.save(user);
	}

}
