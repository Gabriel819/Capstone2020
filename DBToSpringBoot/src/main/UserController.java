package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController{
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/MAJOR_INFO")
	public List<MAJOR_INFO> userlist2() {
		System.out.println("Connected");
		List<MAJOR_INFO> list = userRepository.findAll();
		return list;
	}
}
