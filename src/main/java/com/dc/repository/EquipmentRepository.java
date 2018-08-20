package com.dc.repository;

import org.springframework.data.repository.CrudRepository;

import com.dc.entity.Equipment;

public interface EquipmentRepository  extends CrudRepository<Equipment, Long> {
	
	public Iterable<Equipment> findAll();
	
	public Equipment findByCodigo(String codigo);
	

}
