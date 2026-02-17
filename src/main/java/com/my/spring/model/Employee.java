package com.my.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private int id;
	
	private String name,gender;
	
	
	private Address address;
	
	

	public Employee() {
		super();
		System.out.println("const.called ");
	}



	public Employee(int id, String name, String gender, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
		
	}




	



	

	public Address getAddress() {
		return address;
	}


	@Autowired
	public void setAddress(Address address) {
		System.out.println("setter call address");
		this.address = address;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("setter call id");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setter call name");
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		System.out.println("setter call gender");
		this.gender = gender;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}



	


	



	



	
	
	
	
	
	
	
	

}