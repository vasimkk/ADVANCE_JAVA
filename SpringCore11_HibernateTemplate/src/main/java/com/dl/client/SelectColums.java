package com.dl.client;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dl.dao.HondaDao;
import com.dl.model.Honda;

public class SelectColums {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/client/applicationContext.xml");

		HondaDao hondaDao = (HondaDao) context.getBean("hondaDao");

		List<Honda[]> allColumns = hondaDao.getAllColumns();
		 Object[] array = allColumns.toArray();
		 for (Object object : array) {
			System.out.println(object);
		}

		context.close();
	}
}
