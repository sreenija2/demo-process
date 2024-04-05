package com.digitalgoldwallet.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalgoldwallet.demo.dao.UserRepository;
import com.digitalgoldwallet.demo.model.Users;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userDao;
	
	@Override
	public List<Users> getAllUsers() {
		return userDao.findAll();
	}

}
