package com.dl.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.dl.model.Honda;

@Component("hondaDao")
public class HondaDaoImpl implements HondaDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public int create(Honda honda) {
		
		Integer i = (Integer)hibernateTemplate.save(honda);
		
		return i;
	}
	
	@Transactional
	public void update(Honda honda) {
		
		hibernateTemplate.update(honda);
	}

	@Transactional
	public void delete(Honda honda) {
		
		hibernateTemplate.delete(honda);
	}

	@Transactional
	public List<Honda> getAllVechiles() {
		
		return (List<Honda>) hibernateTemplate.find("from Honda");
	}

	@Transactional
	public List<Honda[]> getAllColumns() {
		
		return (List<Honda[]>) hibernateTemplate.find("select bikeColor from Honda");
	}

	@Override
	public List<Honda[]> getSc() {
		return (List<Honda[]>) hibernateTemplate.find("select id from Honda");

	}

}
