package com.springCore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springCore/ref/refConfig.xml");
		A obj = (A) context.getBean("aaref");
		System.out.println(obj.getX());
		System.out.println(obj.getOb().getY());
	}

}
