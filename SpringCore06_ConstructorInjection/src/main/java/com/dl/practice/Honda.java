package com.dl.practice;

import java.io.Serializable;

//bean
public class Honda implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int vno;
	private String vname;
	
	public Honda() {
	}

	public int getVno() {
		return vno;
	}

	public void setVno(int vno) {
		this.vno = vno;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}
	
}
