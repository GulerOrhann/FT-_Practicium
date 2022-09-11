package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Service.UserService;

@Controller
public class UserController {
 
	@Autowired
	 private UserService userService;
	
	
	@GetMapping("/userListesi")
	public String showAllUser(Model model) {
		model.addAttribute("userList",userService.getAllUsers());
		return "users";
	}
}
