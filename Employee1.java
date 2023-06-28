package com.hibernate.onetonemapping.to1mapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employee1")
public class Employee1 {

	@Id
	@Column(name = "Eid")
	String id;

	@Column(name = "Name")
	String name;

	@Column(name = "Salary")
	String salary;

	@Column(name = "Gender")
	String gender;

	@Column(name = "Age")
	String age;

	@OneToOne(mappedBy = "employee1", cascade = CascadeType.ALL)
	Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee1() {

	}

	public Employee1(String id, String name, String salary, String gender, String age) {

		this.id = id;
		this.name = name;
		this.salary = salary;
		this.gender = gender;
		this.age = age;

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

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return this.id + " " + this.name + " " + this.salary + " " + this.gender + " " + this.age;
	}
}
