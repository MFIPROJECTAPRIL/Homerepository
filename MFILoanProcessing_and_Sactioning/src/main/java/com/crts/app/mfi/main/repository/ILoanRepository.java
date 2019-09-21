package com.crts.app.mfi.main.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.mfi.main.model.Enquiry;

@Repository
public interface ILoanRepository extends PagingAndSortingRepository<Enquiry, Integer>{

}
