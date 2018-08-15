package com.developerstack.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.developerstack.model.UserDetails;

public interface UserDao  {
	
	
	UserDetails findUserByEmail(String email);

}
