package com.cg.fas.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fas.dto.LoginDto;
import com.cg.fas.entity.Login;
import com.cg.fas.repository.AdminRepository;
import com.cg.fas.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	private AdminRepository repository;
	@Override
	public LoginDto login(LoginDto loginDTO) {
	Login login = new Login();
	BeanUtils.copyProperties(loginDTO, login);
	repository.save(login);
	return loginDTO;
}
}
