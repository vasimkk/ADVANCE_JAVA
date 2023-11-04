package com.dl.ambiguities;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/ambiguities/applicationContext.xml");
		Student bean = (Student)context.getBean("student");
		System.out.println(bean);
		context.close();
		
	}
}
