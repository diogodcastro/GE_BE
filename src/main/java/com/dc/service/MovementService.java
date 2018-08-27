package com.dc.service;

import com.dc.entity.Movement;

public interface MovementService {
	
	Iterable<Movement> findAll();

	void save(Movement movement);
	

}
