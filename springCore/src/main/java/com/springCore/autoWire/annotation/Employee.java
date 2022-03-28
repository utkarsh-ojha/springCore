package com.springCore.autoWire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	//@Autowired => This will check by type, if @Qualifier("myadd")is used with @autowire 
	// then it will search by name.
	@Autowired
	@Qualifier("myadd")
	private Address address;

	public Address getAddress() {
		return address;
	}

	//check by address
//	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

//	@Autowired
	public Employee(Address address) {
		super();
		System.out.println("Inside constructor");
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
