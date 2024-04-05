package com.digitalgoldwallet.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalgoldwallet.demo.model.Users;
import com.digitalgoldwallet.demo.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserRestController {
	
	@Autowired(required=false)
	UserService userServ;
	
	@GetMapping(produces="application/json")
	List<Users> getAllUsers(){
		List<Users> usersList = userServ.getAllUsers();
		return usersList;
	}
}
