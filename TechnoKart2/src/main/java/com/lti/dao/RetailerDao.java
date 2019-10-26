package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.ProductEntity;

@Repository
public class RetailerDao {
	@PersistenceContext
	private EntityManager entityManager;
	

	public List fetch(String r_email) {
		 
		System.out.println("now im here");
		String ql = "select r.r_pass from RetailerEntity r where r.r_email =:em ";
		Query q = entityManager.createQuery(ql);
		System.out.println("now im here");
		q.setParameter("em", r_email);
		List c1 = q.getResultList();
		System.out.println(c1);
	     return c1;	
     }
	
	@Transactional
	public String reset(String oldPass,String newPass) {
		String s1=null;
		System.out.println("now im here");
		String ql = "update RetailerEntity set r_pass = :newPass where r_pass = :oldPass";
		Query q = entityManager.createQuery(ql);
		System.out.println("now im here");
		q.setParameter("newPass", newPass);
		q.setParameter("oldPass", oldPass);
		int result = q.executeUpdate();
		if( result==1)
		{
	      s1="SUCCESS";		
		}
		else
		{
	      s1="FAILURE";
		}
		return s1;
}

	@Transactional
	public void save(ProductEntity productEntity) {
		System.out.println("hii4");
		entityManager.persist(productEntity);
		//entityManager.merge(customerEntity);
		System.out.println("hi5");
	}
	
	@Transactional
	public void setImg(String pname, String imagetolink) {
		 
		System.out.println("now im in dao");
		String ql = "update ProductEntity set imagetolink = :image where p_name = :pn ";
		Query q = entityManager.createQuery(ql);
		System.out.println("now im here");
		q.setParameter("image",imagetolink);
		q.setParameter("pn", pname);
		int i=q.executeUpdate();
		
     }
	
	@Transactional
	public void remove(int id)
	{
		String ql = "delete from RetailerEntity r where r.r_id = :id";
		Query q = entityManager.createQuery(ql);
		q.setParameter("id", id);
		q.executeUpdate();
		System.out.println("Record Deleted");
	}
	
	public List fetchDetail() {
		System.out.println("now im here");
		String ql = "select r from RetailerEntity r ";
		Query q = entityManager.createQuery(ql);
		System.out.println("now im here");
		//q.setParameter("em", r_email);
		List c1 = q.getResultList();
		System.out.println(c1);
	     return c1;	
     }
	
	public List fetchProducts() {
		System.out.println("now im here");
		String ql = "select p from ProductEntity p";
		Query q = entityManager.createQuery(ql);
		System.out.println("now im here");
		//q.setParameter("em", r_email);
		List c1 = q.getResultList();
		System.out.println(c1);
	     return c1;	
     }
}
