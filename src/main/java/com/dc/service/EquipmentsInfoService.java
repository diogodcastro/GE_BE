package com.dc.service;

import com.dc.entity.EquipmentsInfo;

public interface EquipmentsInfoService {
	
	EquipmentsInfo findByEquipamento(String equipamento);

	Iterable<EquipmentsInfo> findAll();

	void save(EquipmentsInfo equipment);

}
