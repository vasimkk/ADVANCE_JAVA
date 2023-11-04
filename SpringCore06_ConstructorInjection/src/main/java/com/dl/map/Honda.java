package com.dl.map;

import java.util.Map;

public class Honda {

	private String sname;
	private Map<Integer, String> models;

	public Honda() {
	}

	public Honda(String sname, Map<Integer, String> models) {
		this.sname = sname;
		this.models = models;
	}

	@Override
	public String toString() {
		return "Honda [sname=" + sname + ", models=" + models + "]";
	}

}
