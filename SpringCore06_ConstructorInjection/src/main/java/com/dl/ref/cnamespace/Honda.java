
package com.dl.ref.cnamespace;

public class Honda {

	private Models models;
	
	public Honda() {
		
	}

	public Honda(Models models) {
		this.models = models;
	}

	@Override
	public String toString() {
		return "Honda [models=" + models + "]";
	}
	
	
}