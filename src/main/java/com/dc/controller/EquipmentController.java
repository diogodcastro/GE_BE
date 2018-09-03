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

import com.dc.entity.Equipment;
import com.dc.service.EquipmentService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/equipment")
public class EquipmentController {
	
	@Autowired
	private EquipmentService equipService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Iterable<Equipment>> getAllEquipments() {
		return new ResponseEntity<Iterable<Equipment>>(equipService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<Equipment> getEquipmentById(@PathVariable("codigo") String codigo) {
	    Equipment equipment = equipService.findByCodigo(codigo);
		return new ResponseEntity<Equipment>(equipment, HttpStatus.OK);
	}
	
	@GetMapping("/ativo/{ativo}")
	public ResponseEntity<Iterable<Equipment>> getEquipmentByAtivo(@PathVariable("ativo") boolean ativo) { 
		return new ResponseEntity<Iterable<Equipment>>(equipService.findByAtivo(ativo), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Equipment> createEquipment(@RequestBody Equipment equipment) {
		equipService.save(equipment);
		return new ResponseEntity<Equipment>(equipment, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/inspect")
	public ResponseEntity<Iterable<Equipment>> doInspect(@RequestBody Iterable<Equipment> equipments) {
		equipService.doInspection(equipments);
		return new ResponseEntity<Iterable<Equipment>>(equipments, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Equipment> updateEquipment(@RequestBody Equipment equipment) {
		equipService.save(equipment);
		return new ResponseEntity<Equipment>(equipment, HttpStatus.OK);
	}

}
