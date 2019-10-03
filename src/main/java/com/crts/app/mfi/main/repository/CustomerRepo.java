package com.crts.app.mfi.main.repository;



import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.mfi.main.model.CustomerForm;

@Repository
public interface CustomerRepo extends PagingAndSortingRepository<CustomerForm, Integer>{

	CustomerForm findByCustomerCode(String customerCode);

	

}
