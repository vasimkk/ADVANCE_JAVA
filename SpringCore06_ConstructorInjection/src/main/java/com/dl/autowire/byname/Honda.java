package com.dl.autowire.byname;

public class Honda {

	private Models models;

	public Models getModels() {
		return models;
	}

	public void setModels(Models models) {
		this.models = models;
	}

	@Override
	public String toString() {
		return "Honda [models=" + models + "]";
	}
	
	
	
}
