package com.dc.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dc.entity.Movement;
import com.dc.repository.MovementRepository;
import com.dc.service.MovementService;

@Service
public class MovementServiceImpl implements MovementService {
	
	@Autowired
	private MovementRepository movementRepo;
	

	public Iterable<Movement> findAll() {
		return movementRepo.findAll();
	}

	public void save(Movement movement) {
		movementRepo.save(movement);	
	}

}
