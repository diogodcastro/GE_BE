package com.dc.repository;

import org.springframework.data.repository.CrudRepository;

import com.dc.entity.Users;

public interface UserRepository extends CrudRepository<Users, Long>{
	
	public Iterable<Users> findAll();
	
	public Users findByUsername(String username);

}
