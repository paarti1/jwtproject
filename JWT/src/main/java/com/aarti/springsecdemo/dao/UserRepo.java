package com.aarti.springsecdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aarti.springsecdemo.model.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	User findByUsername(String username);
}
