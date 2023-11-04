package com.dl.innerbeans.setterinjection;

public class Honda {

	HondaCars hondaCars;
	
	public Honda() {
		
	}

	public Honda(HondaCars hondaCars) {
		super();
		this.hondaCars = hondaCars;
	}

	public HondaCars getHondaCars() {
		return hondaCars;
	}

	public void setHondaCars(HondaCars hondaCars) {
		this.hondaCars = hondaCars;
	}

	@Override
	public String toString() {
		return "Honda [hondaCars=" + hondaCars + "]";
	}
	
}

