package com.dl.dao;

import com.dl.model.Honda;

public interface HondaDao {

	public int insertRecord(Honda honda);
	public int updateRecord(Honda honda);
	public int delete(int  i);
	
}
