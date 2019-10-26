package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="wishlist")
public class WishlistEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "wid")
	@SequenceGenerator(name="wid",  sequenceName="wish_seq", allocationSize=1)
	@Column(name="w_id")
	private int w_id;
	
	@Column (name="p_id")
	private int p_id;
	@Column (name="u_id")
	private int u_id;
	
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
}
