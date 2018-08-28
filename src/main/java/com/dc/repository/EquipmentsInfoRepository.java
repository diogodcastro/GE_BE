package com.dc.repository;

import org.springframework.data.repository.CrudRepository;

import com.dc.entity.EquipmentsInfo;

public interface EquipmentsInfoRepository extends CrudRepository<EquipmentsInfo, Long>  {

	
	public Iterable<EquipmentsInfo> findAll();
	
	public EquipmentsInfo findByEquipamento(String equipamento);
}
