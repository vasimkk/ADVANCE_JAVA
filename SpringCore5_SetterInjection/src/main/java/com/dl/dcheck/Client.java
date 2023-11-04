package com.dl.dcheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/dcheck/applicationContext.xml");
		Honda bean = (Honda)context.getBean("honda");
		System.out.println(bean.getVno());
		System.out.println(bean.getModels());
		context.close();
	}
}
