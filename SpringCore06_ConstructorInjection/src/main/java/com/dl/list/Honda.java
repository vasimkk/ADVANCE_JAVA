
package com.dl.list;

import java.util.List;

public class Honda {

	private String sname;
	private List<String> models;
	
	public Honda() {
		
	}

	public Honda(String sname, List<String> models) {
		this.sname = sname;
		this.models = models;
	}

	@Override
	public String toString() {
		return "Honda [sname=" + sname + ", models=" + models + "]";
	}
	
	
}