package com.app.core;

import java.time.LocalDate;
public class Voulenteers{
	private Integer Id;
	private String name;
	private Boolean isAvailable;
	private LocalDate DOB;
	public Voulenteers(int id, String name, Boolean isAvailable, LocalDate dOB) {
		super();
		Id = id;
		this.name = name;
		this.isAvailable = isAvailable;
		DOB = dOB;
	}
	@Override
	public String toString() {
		return "Voulenteers [Id=" + Id + ", name=" + name + ", isAvailable=" + isAvailable + ", DOB=" + DOB + "]";
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getIsAvailable() {
		return isAvailable;
	}
	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public LocalDate getDOB() {
		return DOB;
	}
	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}

}