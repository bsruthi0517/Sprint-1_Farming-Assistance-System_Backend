package com.cg.fas.service;

import org.springframework.stereotype.Service;

import com.cg.fas.dto.LoginDto;
@Service
public interface AdminService {
	public LoginDto login(LoginDto loginDTO);
}
