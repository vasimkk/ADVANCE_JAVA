
package com.dl.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringClient {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/set/applicationContext.xml");
		Honda h = (Honda)context.getBean("honda");
		System.out.println(h.getSname());
		System.out.println(h.getModels());
		context.close();
		
	}
}
