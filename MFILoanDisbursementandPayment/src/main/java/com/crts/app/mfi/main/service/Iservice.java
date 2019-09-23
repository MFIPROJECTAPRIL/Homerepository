package com.crts.app.mfi.main.service;

import java.util.List;

import com.crts.app.mfi.main.model.LedgerDetails;

public interface Iservice {
	public void saveData(LedgerDetails l);
	public List<LedgerDetails> getall();

}
