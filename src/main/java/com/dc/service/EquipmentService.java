package com.dc.service;

import com.dc.entity.Equipment;

public interface EquipmentService {

	Equipment findByCodigo(String codigo);

	Iterable<Equipment> findAll();

	void save(Equipment equipment);
	
	
}
