package com.dl.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.dl.dao.HondaDao;
import com.dl.model.Honda;

public class Insert {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/client/applicationContext.xml");
		HondaDao dao = (HondaDao)context.getBean("hondaDao");
		
		Honda honda = new Honda();
		honda.setId(3);
		honda.setBikeName("Honda CBR");
		honda.setBikeColor("Black");
		honda.setCc(1000.00);
		
		int insertRecord = dao.insertRecord(honda);
		System.out.println("Record Saved in DB: " + insertRecord);
		
		Honda h2 = new Honda();
		h2.setId(4);
		h2.setBikeName("hhh");
		h2.setBikeColor("Black");
		h2.setCc(200.00);
		
		int insert2 = dao.insertRecord(h2);
		System.out.println("Record Saved in DB: " + insert2);
		
		context.close();
	}
}
