package com.dc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dc.entity.Movement;
import com.dc.service.MovementService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/movement")
public class MovementController {
	
	@Autowired
	private MovementService movementService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Iterable<Movement>> getAllMovements() {
		return new ResponseEntity<Iterable<Movement>>(movementService.findAll(), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Movement> createMovement(@RequestBody Movement movement) {
		movementService.save(movement);
		return new ResponseEntity<Movement>(movement, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Movement> updateMovement(@RequestBody Movement movement) {
		movementService.save(movement);
		return new ResponseEntity<Movement>(movement, HttpStatus.OK);
	}

}
