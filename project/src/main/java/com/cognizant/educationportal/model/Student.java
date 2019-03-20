package com.cognizant.educationportal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_Info")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id",unique=true, nullable=false)
	int id;
	@Column(name="stud_first_name" , nullable=false)
	String firstName;
	@Column(name="stud_last_name", nullable=false)
	String lastName;
	@Column(name="stud_password", nullable=false)
	String password;
	@Column(name="stud_email", nullable=false)
	String email;
	@Column(name="stud_contact", nullable=false)
	String contact;
	@Column(name="stud_date", nullable=false)
	String date;
	@Column(name="stud_guardian")
	String guardian;
	@Column(name="stud_payment", nullable=false)
	String payment;
	public Student() {
		
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getGuardian() {
		return guardian;
	}
	public void setGuardian(String guardian) {
		this.guardian = guardian;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	
	@Override
	public String toString()
	{
		return id+" "+firstName+" "+lastName+" "+contact+" "+email+" "+password+" "+guardian+" "+payment;
	}
}
