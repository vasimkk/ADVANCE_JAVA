package com.dl.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/list/applicationContext.xml");
		Honda bean = (Honda)context.getBean("honda");
		System.out.println(bean);
		context.close();
	}

}

