package com.cg.fas.repository;

import org.springframework.data.repository.CrudRepository;

import com.cg.fas.entity.Admin;
import com.cg.fas.entity.Login;

public interface AdminRepository extends CrudRepository<Admin, Integer> 
{
	void save(Login login);
}
