package com.digitalgoldwallet.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digitalgoldwallet.demo.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer>{
	
}
