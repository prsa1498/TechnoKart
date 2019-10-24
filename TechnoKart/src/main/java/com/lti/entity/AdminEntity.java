package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="admin")
public class AdminEntity {
    @Id
	@Column(name="a_email")
	private String a_email;
	
	@Column(name="a_pass")
	private String a_pass;

	public String getA_email() {
		return a_email;
	}

	public void setA_email(String a_email) {
		this.a_email = a_email;
	}

	public String getA_pass() {
		return a_pass;
	}

	public void setA_pass(String a_pass) {
		this.a_pass = a_pass;
	}
}
