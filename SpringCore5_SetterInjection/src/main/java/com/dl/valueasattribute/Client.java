package com.dl.valueasattribute;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/valueasattribute/applicationContext.xml");
		Honda honda = (Honda)context.getBean("honda");
		System.out.println(honda.getVno());
		System.out.println(honda.getVname());
		context.close();
		
	}
}