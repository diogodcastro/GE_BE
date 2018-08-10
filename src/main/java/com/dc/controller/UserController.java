package com.dc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dc.entity.Users;
import com.dc.service.UserService;


@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Iterable<Users>> getAllUsers() {
		return new ResponseEntity<Iterable<Users>>(userService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{userName}")
	public ResponseEntity<Users> getUserById(@PathVariable("userName") String userName) {
		Users users = userService.findByUserName(userName);
		return new ResponseEntity<Users>(users, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Users> createUsers(@RequestBody Users users) {
		userService.save(users);
		return new ResponseEntity<Users>(users, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Users> updateUsers(@RequestBody Users users) {
		userService.save(users);
		return new ResponseEntity<Users>(users, HttpStatus.OK);
	}

}
