package com.springCore.autoWire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/autoWire/annotation/config.xml");
		Employee e = context.getBean("empAuto", Employee.class);
		System.out.println(e);
	}

}
