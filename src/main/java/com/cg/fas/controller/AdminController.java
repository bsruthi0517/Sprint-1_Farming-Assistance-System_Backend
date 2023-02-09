package com.cg.fas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fas.dto.LoginDto;
import com.cg.fas.service.AdminService;
@RestController
@RequestMapping("Admin")
public class AdminController {
	@Autowired
	private AdminService adminService;
	//http://localhost:9000/Admin/login
	@PostMapping("/login")
	public LoginDto login(LoginDto loginDTO) {
	return adminService.login(loginDTO);
}
}
