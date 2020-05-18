package com.qintess.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qintess.workshopmongo.domain.User;
import com.qintess.workshopmongo.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	public UserRepository repository;
	
	
	public List<User> findAll(){
		return repository.findAll();
	}
}
