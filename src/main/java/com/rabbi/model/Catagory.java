package com.rabbi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Catagory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String catagoryName;
	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getCatagoryName() {
		return catagoryName;
	}


	public void setCatagoryName(String catagoryName) {
		this.catagoryName = catagoryName;
	}


	@Override
	public String toString() {
		return "Catagory [id=" + id + ", catagoryName=" + catagoryName + "]";
	}
     
}
