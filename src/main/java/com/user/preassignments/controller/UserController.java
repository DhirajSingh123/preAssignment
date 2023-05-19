package com.user.preassignments.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.preassignments.models.Users;
import com.user.preassignments.services.UserServices;

@RestController
public class UserController {

	@Autowired
	UserServices services;
	
	

	@PostMapping("/saveUser")
	public String setEmployee(@RequestBody Users user) {

		return services.saveUsers(user);
	}
	
	@PutMapping("/updateUsers/{userName}")
	public String updateUser(@RequestBody Users user,@PathVariable("userName") Integer userId) {

		return services.updateUser(user,userId);	
	}
	
	@GetMapping("/sortedUser")
	public List<Users> sorteduser () {
	
		return services.getSorteduser();
	}
	
	

}
