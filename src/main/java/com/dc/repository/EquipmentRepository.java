package com.dc.repository;

import java.util.Date;

import org.springframework.data.repository.CrudRepository;

import com.dc.entity.Equipment;

public interface EquipmentRepository  extends CrudRepository<Equipment, Long> {
	
	public Iterable<Equipment> findAll();

	
	public Iterable<Equipment> findByAtivo(boolean ativo);
	
	public Iterable<Equipment> findByProximaInspecaoLessThanAndInspecaoValidaTrue(Date date);

	
	public Equipment findByCodigo(String codigo);
	

}
