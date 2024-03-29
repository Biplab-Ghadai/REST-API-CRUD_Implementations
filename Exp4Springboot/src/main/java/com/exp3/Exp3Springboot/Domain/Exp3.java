package com.exp3.Exp3Springboot.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Experiment3_info")
public class Exp3 {
	
	
	@Id
	private String id;
	private String name;
	private String address;
	private String salary;
	
	
	public Exp3() {
		super();
	}


	public Exp3(String id, String name, String address, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Exp3 [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
