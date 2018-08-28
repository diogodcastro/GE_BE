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

import com.dc.entity.EquipmentsInfo;
import com.dc.service.EquipmentsInfoService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/equipmentsInfo")
public class EquipmentsInfoController {
	
	@Autowired
	private EquipmentsInfoService equipInfoService;

	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Iterable<EquipmentsInfo>> getAllEquipments() {
		return new ResponseEntity<Iterable<EquipmentsInfo>>(equipInfoService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{equipamento}")
	public ResponseEntity<EquipmentsInfo> getEquipmentById(@PathVariable("equipamento") String equipamento) {
		EquipmentsInfo equipment = equipInfoService.findByEquipamento(equipamento);
		return new ResponseEntity<EquipmentsInfo>(equipment, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<EquipmentsInfo> createEquipment(@RequestBody EquipmentsInfo equipment) {
		equipInfoService.save(equipment);
		return new ResponseEntity<EquipmentsInfo>(equipment, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<EquipmentsInfo> updateEquipment(@RequestBody EquipmentsInfo equipment) {
		equipInfoService.save(equipment);
		return new ResponseEntity<EquipmentsInfo>(equipment, HttpStatus.OK);
	}
	
}
