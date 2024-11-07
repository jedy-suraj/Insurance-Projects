package com.insuranceproject.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insuranceproject.model.User;
import com.insuranceproject.repository.UserRepository;
import com.insuranceproject.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	//inject user repository
	@Autowired
	private UserRepository userRepository;
	@Override
	public User saveUSer(User user) {
		User user1=userRepository.save(user);
		return user1;
	}

}
