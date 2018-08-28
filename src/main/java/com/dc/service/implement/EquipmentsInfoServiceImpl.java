package com.dc.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dc.entity.EquipmentsInfo;
import com.dc.repository.EquipmentsInfoRepository;
import com.dc.service.EquipmentsInfoService;

@Service
public class EquipmentsInfoServiceImpl implements EquipmentsInfoService {

	@Autowired
	private EquipmentsInfoRepository equipInfoRepo;
	
	public EquipmentsInfo findByEquipamento(String equipamento) {
		return equipInfoRepo.findByEquipamento(equipamento);
	}

	public Iterable<EquipmentsInfo> findAll() {
		return equipInfoRepo.findAll();
	}

	public void save(EquipmentsInfo equipment) {
		equipInfoRepo.save(equipment);	
	}
}
