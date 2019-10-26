package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@Table(name="customer")
public class CustomerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "uid")
	@SequenceGenerator(name="uid",  sequenceName="cust_seq", allocationSize=1)
	@Column(name="u_id")
    private int u_id;
	
	@Column(name="u_name")
	private String u_name;
	
	@Column(name="u_add")
	private String u_add;
	
	@Column(name="u_mob")
	private int u_mob;
	
	@Column(name="u_email")
	private String u_email;
	
	@Column(name="u_pass")
	private String u_pass;
	
	
	public int getU_id() {
		return u_id;
	}
	
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getU_add() {
		return u_add;
	}
	public void setU_add(String u_add) {
		this.u_add = u_add;
	}
	public int getU_mob() {
		return u_mob;
	}
	public void setU_mob(int u_mob) {
		this.u_mob = u_mob;
	}
	public String getU_email() {
		return u_email;
	}
	public void setU_email(String u_email) {
		this.u_email = u_email;
	}
	public String getU_pass() {
		return u_pass;
	}
	public void setU_pass(String u_pass) {
		this.u_pass = u_pass;
	}


	@Override
	public String toString() {
		return "CustomerEntity [u_email=" + u_email + ", u_pass=" + u_pass + "]";
	}
}
