package com.dl.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dl.dao.HondaDao;
import com.dl.model.Honda;

public class Insert {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/client/applicationContext.xml");

		HondaDao hondaDao = (HondaDao) context.getBean("hondaDao");

		Honda honda = new Honda();
		honda.setId(1);
		honda.setBikeName("Honda CBR");
		honda.setBikeColor("Green");
		honda.setCc(300.00);
		

		
		honda.setId(2);
		honda.setBikeName("Honda CBR");
		honda.setBikeColor("Green");
		honda.setCc(300.00);
		
		
		
		
		

		hondaDao.create(honda);
		System.out.println(honda);

		context.close();
	}
}
