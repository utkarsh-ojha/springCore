package com.springCore.CI;

public class Person {

	private String name;
	private int id;
	private Certi cert;
	
	public Person(String name, int id, Certi cert) {
		super();
		this.name = name;
		this.id = id;
		this.cert = cert;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", cert=" + cert + "]";
	}

	
	
}
