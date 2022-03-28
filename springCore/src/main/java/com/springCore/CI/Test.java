package com.springCore.CI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/CI/ciConfig.xml");
//		Person p = (Person) context.getBean("personn");
//		System.out.println(p);
		
		Addition q = (Addition) context.getBean("add");
		System.out.println(q);
		
		
		Addition r = (Addition) context.getBean("addd");
		System.out.println(r);
		
	}

}
