package com.dl.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dl.dao.HondaDao;

public class Delete {

	public static void main(String[] args) {
	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/client/applicationContext.xml");
		HondaDao dao = (HondaDao)context.getBean("hondaDao");
	
             int deleteRecord = dao.delete(1);
			System.out.println("Delete Record from Database " + deleteRecord);
			
			

	}

}
