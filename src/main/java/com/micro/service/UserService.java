package com.micro.service;

import org.springframework.stereotype.Service;

import com.micro.model.User;
import com.micro.repository.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepo;
	public UserService(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}
	public User addUser(User user) {
		User local = userRepo.save(user);
		return local;
	}
}
