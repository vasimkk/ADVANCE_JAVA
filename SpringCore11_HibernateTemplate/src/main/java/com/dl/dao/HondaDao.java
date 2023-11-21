package com.dl.dao;

import java.util.List;

import com.dl.model.Honda;

public interface HondaDao {

	public int create(Honda honda);
	public void update(Honda honda);
	public void delete(Honda honda);
	
	public List<Honda> getAllVechiles();
	public List<Honda[]> getAllColumns();
	public List<Honda[]> getSc();
}
