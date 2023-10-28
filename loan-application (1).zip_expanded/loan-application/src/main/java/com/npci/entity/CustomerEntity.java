package com.npci.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer" )
public class CustomerEntity {
	
	@Column(name = "customer_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int customer_id;
	
	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "email_id")
	private String email_id;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "phone")
	private long phone;
	
	@Column(name = "pan")
	private String pan;

	public CustomerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerEntity(int customer_id, String firstname, String lastname, String email_id, String password,
			long phone, String pan) {
		super();
		this.customer_id = customer_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email_id = email_id;
		this.password = password;
		this.phone = phone;
		this.pan = pan;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	@Override
	public String toString() {
		return "CustomerEntity [customer_id=" + customer_id + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", email_id=" + email_id + ", password=" + password + ", phone=" + phone + ", pan=" + pan + "]";
	}

	

}
