package com.dl.objectref;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/objectref/applicationContext.xml");
		Honda bean = (Honda)context.getBean("honda");
		System.out.println(bean.getModel());
		context.close();
	}
}
