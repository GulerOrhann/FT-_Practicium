package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepository;
import java.util.Optional;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public List<User> getAllUsers() {
		return userRepo.findAll();

	}
	public User getUserByid(long id) {
		Optional<User> optional = userRepo.findById(id);
		User user =null;
		if(optional.isPresent()) {
			user = optional.get();
		}else {
			throw new RuntimeException(" Invalid id :: " + id);
		}
		return user;
	}
 
	public void deleteUser(long id)  {
		this.userRepo.deleteById(id);
	}
	
	public void saveUser(User user) {
		this.userRepo.save(user);
	}
}
