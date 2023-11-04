package com.dl.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringClient {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/map/applicationContext.xml");
		Honda h = (Honda)context.getBean("honda");
		System.out.println(h.getSname());
		System.out.println(h.getModels());
		context.close();
		
		FileSystemXmlApplicationContext context2 = new FileSystemXmlApplicationContext("/Users/admin/Documents/sajeed/AdvanceJava16/SpringCore05_SetterInjection/src/main/java/com/dl/map/applicationContext.xml");
		Honda h1 = (Honda)context2.getBean("honda");
		System.out.println(h1.getSname());
		System.out.println(h1.getModels());
		context2.close();
		
	}
}
