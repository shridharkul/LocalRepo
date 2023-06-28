package com.hibernate.onetonemapping.to1mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class Address {

	@Id
	@Column(name = "Id")
	String id;

	@Column(name = "City")
	String city;

	@OneToOne
	@JoinColumn(name = "Eid")
	Employee1 employee1;

	public Address() {

	}

	public Address(String id, String city, Employee1 employee1) {

		this.id = id;
		this.city = city;
		this.employee1 = employee1;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return this.id + " " + this.city;
	}

	public Employee1 getEmployee1() {
		return employee1;
	}

	public void setEmployee1(Employee1 employee1) {
		this.employee1 = employee1;
	}

}
