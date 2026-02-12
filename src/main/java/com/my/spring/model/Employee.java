package com.my.spring.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	private int id;
	
	private String name,gender;
	
	
	private Address address;
	
	private List<Integer> mylist;
	
	private Set<Integer> setOfContacts;
	
	private Map<Integer,String> map;

	public Employee() {
		super();
		System.out.println("const.called ");
	}



	public Employee(int id, String name, String gender, Address address, List<Integer> mylist, Set<Integer> set,
			Map<Integer, String> map) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.mylist = mylist;
		this.setOfContacts = set;
		this.map = map;
	}




	



	public List<Integer> getMylist() {
		return mylist;
	}



	public void setMylist(List<Integer> mylist) {
		System.out.println("setter call mylist");
		this.mylist = mylist;
	}

       
	


	public Set<Integer> getSetOfContacts() {
		return setOfContacts;
	}



	public void setSetOfContacts(Set<Integer> setOfContacts) {
		System.out.println("setter call set");
		this.setOfContacts = setOfContacts;
	}



	public Map<Integer, String> getMap() {
		return map;
	}



	public void setMap(Map<Integer, String> map) {
		System.out.println("setter call map");
		this.map = map;
	}



	public Address getAddress() {
		return address;
	}



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
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + ", mylist="
				+ mylist + ", setOfContacts=" + setOfContacts + ", map=" + map + "]";
	}



	



	



	
	
	
	
	
	
	
	

}