package com.dl.pcnamespace;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/pcnamespace/applicationContext.xml");
		Location bean = (Location)context.getBean("location");
		System.out.println(bean);
		context.close();
		
	}
}

