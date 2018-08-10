package com.dc.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dc.entity.Equipment;
import com.dc.repository.EquipmentRepository;
import com.dc.service.EquipmentService;

@Service
public class EquipmentServiceImpl implements EquipmentService {
	
	@Autowired
	private EquipmentRepository equipRepo;
	
	public Equipment findByCodigo(String codigo) {
		return equipRepo.findByCodigo(codigo);
	}

	public Iterable<Equipment> findAll() {
		return equipRepo.findAll();
	}

	public void save(Equipment equipment) {
		equipRepo.save(equipment);	
	}

}
