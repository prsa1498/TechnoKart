package com.lti.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class ProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pid")
	@SequenceGenerator(name="pid",  sequenceName="prod_seq", allocationSize=1)
	@Column(name="p_id")
	private int p_id;
	
	@Column(name="p_name")
	private String p_name;
	
	@Column(name="p_brand")
	private String p_brand;
	
	@Column(name="p_category")
	private String p_category;
	
	@Column(name="p_details")
	private String p_details;
	
	@Column(name="p_price")
	private int p_price;
	
	@Column(name="imagetolink")
	private String imagetolink;
 

	public String getImagetolink() {
		return imagetolink;
	}

	public void setImagetolink(String imagetolink) {
		this.imagetolink = imagetolink;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getP_brand() {
		return p_brand;
	}

	public void setP_brand(String p_brand) {
		this.p_brand = p_brand;
	}

	public String getP_category() {
		return p_category;
	}

	public void setP_category(String p_category) {
		this.p_category = p_category;
	}

	public String getP_details() {
		return p_details;
	}

	public void setP_details(String p_details) {
		this.p_details = p_details;
	}

	public int getP_price() {
		return p_price;
	}

	public void setP_price(int p_price) {
		this.p_price = p_price;
	}
	
}
