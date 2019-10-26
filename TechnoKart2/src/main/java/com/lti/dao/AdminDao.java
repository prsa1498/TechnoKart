package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.RetailerEntity;


@Repository
public class AdminDao {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void save(RetailerEntity retailerEntity) {
		System.out.println("hii4");
		entityManager.persist(retailerEntity);
		//entityManager.merge(customerEntity);
		System.out.println("hi5");
	}
	
	@Transactional
	public String reset(String oldPass,String newPass) {
		String s1=null;
		System.out.println("now im here");
		String ql = "update AdminEntity set a_pass = :newPass where a_pass = :oldPass";
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
	
	public List fetch(String a_email) 
	{	 
		System.out.println("now im here");
		String ql = "select a.a_pass from AdminEntity a where a.a_email =:em ";
		Query q = entityManager.createQuery(ql);
		System.out.println("now im here");
		q.setParameter("em", a_email);
		List c1 = q.getResultList();
		System.out.println(c1);
	     return c1;	
    }

	public void remove(String r_name) {
		String ql = "delete a from RetailerEntity a where a.r_name =:nm ";
		Query q = entityManager.createQuery(ql);
		System.out.println("now im here");
		q.setParameter("nm", r_name);
		int i= q.executeUpdate();
		System.out.println(i+ " rows deleted.");
	}
}
