package com.crts.app.mfi.main.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.mfi.main.model.LoanDisbursementDetails;

@Repository
public interface LoanDisbursementRepo extends PagingAndSortingRepository<LoanDisbursementDetails, Integer> {

	List<LoanDisbursementDetails> findByStatus(int status);

}
