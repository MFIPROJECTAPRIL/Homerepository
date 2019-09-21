package com.crts.app.mfi.main.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.mfi.main.model.Branch;

@Repository
public interface IBranchRepository extends PagingAndSortingRepository<Branch, Integer>{

}
