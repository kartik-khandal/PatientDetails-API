package com.abccompany.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PatientDetails {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Long contact;
	public PatientDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PatientDetails(Integer id, String name, Long contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "PatientDetails [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}
	
	
	}
	

