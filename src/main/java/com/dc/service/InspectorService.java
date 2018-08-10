package com.dc.service;

import com.dc.entity.Inspector;

public interface InspectorService {
	
	Inspector findByUser(String user);

	Iterable<Inspector> findAll();

	void save(Inspector inspector);

}
