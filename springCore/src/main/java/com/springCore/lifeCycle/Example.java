package com.springCore.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String example;

	public String getExample() {
		return example;
	}

	public void setExample(String example) {
		System.out.println("Setting property of Example");
		this.example = example;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [example=" + example + "]";
	}

	@PostConstruct
	public void init() {
		System.out.println("Inside Example init()");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Inside Example destroy()");
	}

}
