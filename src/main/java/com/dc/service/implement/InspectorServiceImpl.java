package com.dc.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dc.entity.Inspector;
import com.dc.repository.InspectorRepository;
import com.dc.service.InspectorService;

@Service
public class InspectorServiceImpl implements InspectorService {
	
	@Autowired 
	private InspectorRepository repo;
	
	
	public Inspector findByUser(String username){
		return repo.findByUsers_username(username);
	}
	


	public Iterable<Inspector> findAll() {
		return repo.findAll();
	}


	public void save(Inspector inspector) {
		repo.save(inspector);	
	}
	
	

}
