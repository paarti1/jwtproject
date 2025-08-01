package com.aarti.springsecdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.aarti.springsecdemo.dao.UserRepo;
import com.aarti.springsecdemo.model.User;

@Service
public class UserService {
	
@Autowired
	private UserRepo repo;
private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);

	public User saveUser(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		System.out.println(user.getPassword());
	return repo.save(user) ;
		
	}
}
