package com.dc.service;

import com.dc.entity.Users;

public interface UserService {
	
	Users findByUsername(String username);

	Iterable<Users> findAll();

	void save(Users user);

}
