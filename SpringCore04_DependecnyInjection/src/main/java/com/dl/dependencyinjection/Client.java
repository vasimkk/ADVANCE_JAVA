package com.dl.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/dependencyinjection/applicationContext.xml");
//		Brand b1 = (Brand)context.getBean("bikes");
//		Brand b2 = (Brand)context.getBean("cars");
		
		Brand b1 = context.getBean("bikes", Brand.class);
		Brand b2 = context.getBean("cars", Brand.class);
		System.out.println(b1.Honda());
		System.out.println(b2.Honda());
		
		context.close();
		
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/dl/dependencyinjection/applicationContext.xml");
////		Brand b1 = (Brand)context.getBean("bikes");
////		Brand b2 = (Brand)context.getBean("cars");
//		
//		Brand b1 = context.getBean("bikes", Brand.class);
//		Brand b2 = context.getBean("cars", Brand.class);
//		System.out.println(b1.Honda());
//		System.out.println(b2.Honda());
//			
//		((AbstractApplicationContext) context).close();
	}
}
