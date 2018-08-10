package com.dc.repository;

import org.springframework.data.repository.CrudRepository;

import com.dc.entity.Inspector;
import com.dc.entity.Users;

public interface InspectorRepository extends CrudRepository<Inspector, Long>{

	public Iterable<Inspector> findAll();
	
	public Inspector findByUsers(Users user);

}
