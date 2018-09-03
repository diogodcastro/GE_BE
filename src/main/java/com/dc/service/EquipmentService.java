package com.dc.service;

import java.util.Date;

import com.dc.entity.Equipment;

public interface EquipmentService {

	Equipment findByCodigo(String codigo);

	Iterable<Equipment> findAll();
	
	Iterable<Equipment> findByAtivo(boolean ativo);
	
	Iterable<Equipment> findByProximaInspecaoLessThan(Date date);
	 
	void doInspection(Iterable<Equipment> equip) ;

	void save(Equipment equipment);
	
	
}
