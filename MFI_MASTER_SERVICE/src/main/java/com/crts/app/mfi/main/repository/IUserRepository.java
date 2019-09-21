package com.crts.app.mfi.main.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.mfi.main.model.User;

@Repository
public interface IUserRepository extends PagingAndSortingRepository<User, Integer>{

}
