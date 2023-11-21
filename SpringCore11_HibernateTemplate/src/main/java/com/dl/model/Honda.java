package com.dl.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Honda {

	//when using jdbc and spring jdbc we have used primitive data for creating sql queries 
	//when using orm we create entity class and we provide mappings for creating tables
	//we use Java EE standard for doing ORM (Object Relation Mapping is JPA (Java Persistence API) specification
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String bikeName;
	private String bikeColor;
	private Double cc;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public String getBikeColor() {
		return bikeColor;
	}
	public void setBikeColor(String bikeColor) {
		this.bikeColor = bikeColor;
	}
	public Double getCc() {
		return cc;
	}
	public void setCc(Double cc) {
		this.cc = cc;
	}
	
	@Override
	public String toString() {
		return "Honda [id=" + id + ", bikeName=" + bikeName + ", bikeColor=" + bikeColor + ", cc=" + cc + "]";
	}
	
}
