package com.crts.app.mfi.main.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.mfi.main.model.Taluka;

@Repository
public interface ITalukaRepository extends PagingAndSortingRepository<Taluka, Integer>{

}
