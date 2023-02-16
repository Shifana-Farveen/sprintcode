 package com.tns.Userservice;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class  User_service_controller
{
	@Autowired(required=true)
	private  User_Service service;
	
	@GetMapping("/ Userservice")
	public java.util.List<User> list()
	{
		return service.listAll();
	}
	
	@GetMapping("/ Userservice/{u_id}")
	public ResponseEntity< User> get(@PathVariable Integer U_id)
	{
		try
		{
			 User us=service.get(U_id);
return new ResponseEntity<User>( us,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/ userservice")
	public void add(@RequestBody User us)
	{
		service.save(us);
}
	
	@PutMapping("/ userservice/{s_id}")
	public ResponseEntity<?> update(@RequestBody  User  us, @PathVariable Integer U_id)
	{
		 User existus=service.get(U_id);
		service.save(existus);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/ userservice/{u_id}")
	public void delete(@PathVariable Integer u_id)
	{
		service.delete(u_id);
	}
}