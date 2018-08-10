package com.dc.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dc.entity.Users;
import com.dc.repository.UserRepository;
import com.dc.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired 
	private UserRepository repo;

	public Users findByUserName(String userName) {
		return repo.findByUserName(userName);
	}

	public Iterable<Users> findAll() {
		return repo.findAll();
	}

	public void save(Users users) {
		repo.save(users);	
	}

}
