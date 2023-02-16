package com.tns. Userservice;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User
{
	private Integer U_id;
	private String U_name;
	private Integer U_password;
	
	public  User() 
	{
		super();
	}
	
	public  User(Integer u_id, String u_name, Integer u_password)
	{
		super();
		U_id = u_id;
		U_name = u_name;
		U_password= u_password;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getU_id() {
		return U_id;
	}
	public void setU_id(Integer u_id) {
		U_id = u_id;
	}
	public String getU_name() {
		return U_name;
	}
	public void setU_name(String u_name)
	{
		U_name = u_name;
	}
	public Integer getU_password() {
		return U_id;
	}
	public void setU_password(Integer u_password) {
		U_id = u_password;
	}
	@Override
	public String toString()
	{
		return "User[User id:"+U_id+"  User name:"+U_name+"]";
	}
}