package com.dc.service;

import com.dc.entity.Users;

public interface UserService {
	
	Users findByUserName(String userName);

	Iterable<Users> findAll();

	void save(Users user);

}
