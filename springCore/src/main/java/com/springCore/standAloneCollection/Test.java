package com.springCore.standAloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/standAloneCollection/aloneConfig.xml");
		Person p = context.getBean("person1", Person.class);
		System.out.println(p);

	}

}
