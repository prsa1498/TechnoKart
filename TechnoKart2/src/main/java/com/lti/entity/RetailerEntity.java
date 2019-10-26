package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="retailer")
public class RetailerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rid")
	@SequenceGenerator(name="rid",  sequenceName="ret_seq", allocationSize=1)
	@Column(name="r_id")
	private int r_id;
	
	@Column(name="r_name")
	private String r_name;
	
	@Column(name="r_email")
	private String r_email;
	
	@Column(name="r_pass")
	private String r_pass;

	public int getR_id() {
		return r_id;
	}

	public void setR_id(int r_id) {
		this.r_id = r_id;
	}

	public String getR_name() {
		return r_name;
	}

	public void setR_name(String r_name) {
		this.r_name = r_name;
	}

	public String getR_email() {
		return r_email;
	}

	public void setR_email(String r_email) {
		this.r_email = r_email;
	}

	public String getR_pass() {
		return r_pass;
	}

	public void setR_pass(String r_pass) {
		this.r_pass = r_pass;
	}

	
}
