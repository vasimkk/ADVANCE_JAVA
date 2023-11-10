package com.dl.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.dl.model.Honda;

@Component("hondaDao")
public class HondaDaoImpl implements HondaDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insertRecord(Honda honda) {
		
		String sql = "insert into Honda values(?, ?, ?, ?)";
		int insert = jdbcTemplate.update(sql, honda.getId(), honda.getBikeColor(), honda.getBikeName(), honda.getCc());
		
		return insert;
	}

}
