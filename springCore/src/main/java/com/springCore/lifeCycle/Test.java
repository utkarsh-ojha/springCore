package com.springCore.lifeCycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/lifeCycle/config.xml");
//		registerShutdownHook is available in AbstractApplicationContext 
//		and this unable call to destroy method of life cycle. but destroy need to be config in xml config.
		context.registerShutdownHook();
		
//		Samosa s = (Samosa) context.getBean("samo");
//		System.out.println(s);
//	
////		With interface help InitializingBean, DisposableBean
//		Pepsi p = (Pepsi) context.getBean("pep");
//		System.out.println(p);
	
		Example e = (Example) context.getBean("exp");
		System.out.println(e);
	}

}
