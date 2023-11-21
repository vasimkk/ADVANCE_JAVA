package com.dl.client;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dl.dao.HondaDao;
import com.dl.model.Honda;

public class Select {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/client/applicationContext.xml");
		
		HondaDao hondaDao = (HondaDao)context.getBean("hondaDao");
		
		List<Honda> allVechiles = hondaDao.getAllVechiles();
		for (Honda honda : allVechiles) {
			System.out.println(honda);
		}
		
		context.close();
	}
}