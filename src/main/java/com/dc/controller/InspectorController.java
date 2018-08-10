package com.dc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dc.entity.Inspector;
import com.dc.service.InspectorService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/inspectors")
public class InspectorController {
	
	@Autowired
	private InspectorService insService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Iterable<Inspector>> getAllInspectors() {
		return new ResponseEntity<Iterable<Inspector>>(insService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{userName}")
	public ResponseEntity<Inspector> getUserById(@PathVariable("userName") String userName) {
	    Inspector inspectors = insService.findByUser(userName);
		return new ResponseEntity<Inspector>(inspectors, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Inspector> createInspector(@RequestBody Inspector inspector) {
		insService.save(inspector);
		return new ResponseEntity<Inspector>(inspector, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Inspector> updateInspector(@RequestBody Inspector inspector) {
		insService.save(inspector);
		return new ResponseEntity<Inspector>(inspector, HttpStatus.OK);
	}


}
