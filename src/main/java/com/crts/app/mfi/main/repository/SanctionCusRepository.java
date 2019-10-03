package com.crts.app.mfi.main.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.mfi.main.model.LoanDetails;


@Repository
public interface SanctionCusRepository extends PagingAndSortingRepository<LoanDetails, Integer> 
{

	List<LoanDetails> findByStatus(int status);

}
