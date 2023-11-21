package com.dl.client;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dl.dao.HondaDao;
import com.dl.model.Honda;

public class Update {

public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/client/applicationContext.xml");
		
		HondaDao hondaDao = (HondaDao)context.getBean("hondaDao");
		
		Honda honda = new Honda();
		honda.setId(2);
		honda.setBikeName("Honda Dio");
		honda.setBikeColor("Black");
		honda.setCc(200.00);
		
		
		hondaDao.update(honda);
		System.out.println(honda);
		
		context.close();
	}
}
