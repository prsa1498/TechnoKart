package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.entity.CartEntity;
import com.lti.entity.WishlistEntity;

@Repository
public class WishlistDao {
	@PersistenceContext
	private EntityManager entityManager;
	
	WishlistEntity wishlistEntity=null;
	public String addProd(int p_id, int u_id) {
		 
		System.out.println("now im here");
		wishlistEntity.setP_id(p_id);
		wishlistEntity.setU_id(u_id);
	return "Product added";
}
}
