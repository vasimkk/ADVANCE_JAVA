package com.dl.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dl.dao.HondaDao;
import com.dl.model.Honda;

public class Update {

	public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/client/applicationContext.xml");
		
		HondaDao dao = (HondaDao)context.getBean("hondaDao");
		
		Honda honda = new Honda();
		honda.setId(2);
		honda.setBikeName("Honda Twin");
		honda.setBikeColor("red");
		honda.setCc(800.00d);
		
		int updateRecord = dao.updateRecord(honda);
		System.out.println("Record Update: " + updateRecord);
		
		context.close();

	}

}
