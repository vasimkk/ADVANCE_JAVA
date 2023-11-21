package com.dl.client;

import java.util.List;

	import org.springframework.context.support.ClassPathXmlApplicationContext;

	import com.dl.dao.HondaDao;
	import com.dl.model.Honda;

	public class Sc {

	public static void main(String[] args) {
			
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/client/applicationContext.xml");
			
			HondaDao hondaDao = (HondaDao)context.getBean("hondaDao");
			
			
			List<Honda[]> Sc = hondaDao.getSc();
			for (Honda[] honda : Sc) {
				System.out.println(honda);
			}
	
	
	
	
	}
}