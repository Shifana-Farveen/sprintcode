 package com.tns. Userservice;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class User_Service 
{
	@Autowired
	private  User_Service_Repository repo;
	
	public List<User> listAll()
	{
		return repo.findAll();
	}
	
	public void save(User us)
	{
		repo.save(us);
	}
	public User get(Integer u_id)
	{
		return repo.findById(u_id).get();
	}
	public void delete(Integer u_id)
	{
		repo.deleteById(u_id);
	}
	
}