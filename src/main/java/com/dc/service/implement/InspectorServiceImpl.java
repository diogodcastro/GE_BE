package com.dc.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dc.entity.Inspector;
import com.dc.entity.Users;
import com.dc.repository.InspectorRepository;
import com.dc.service.InspectorService;

@Service
public class InspectorServiceImpl implements InspectorService {
	
	@Autowired 
	private InspectorRepository repo;
	
	
	public Inspector findByUser(String username){
		Users us = new Users();
		us.setUsername(username);
		return repo.findByUsers(us);
	}


	public Iterable<Inspector> findAll() {
		return repo.findAll();
	}


	public void save(Inspector inspector) {
		repo.save(inspector);	
	}
	
	

}
