package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.neo4j.ogm.annotation.GraphId;

@Entity //JPA indication
public class Customer {

	@GraphId
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstName, lastName;

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Customer(String f, String l) {
		firstName = f;
		lastName = l;
	}

	protected Customer() { //need for JPA
	}

	@Override
	public String toString() {
		return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id, firstName, lastName);
	}

}
