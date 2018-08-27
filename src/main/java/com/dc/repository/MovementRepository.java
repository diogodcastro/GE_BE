package com.dc.repository;

import org.springframework.data.repository.CrudRepository;

import com.dc.entity.Movement;

public interface MovementRepository extends CrudRepository<Movement, Long> {

	public Iterable<Movement> findAll();
}
