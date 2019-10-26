package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.entity.CartEntity;

@Repository
public class CartDao {
	@PersistenceContext
	private EntityManager entityManager;
	CartEntity cartEntity=null;
	public String addProd(int p_id, int u_id) {
		 
		System.out.println("now im here");
		cartEntity.setP_id(p_id);
		cartEntity.setU_id(u_id);
	return "Product added";
}
}
