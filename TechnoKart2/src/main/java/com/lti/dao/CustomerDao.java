package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.entity.CustomerEntity;

@Repository
public class CustomerDao {
	@PersistenceContext
	private EntityManager entityManager;
	
	public Object fetch(String u_email) {
		 
			System.out.println("now im here");
			String ql = "select c from CustomerEntity c where c.u_email =:em ";
			Query q = entityManager.createQuery(ql);
			System.out.println("now im here");
			q.setParameter("em", u_email);
			/*CustomerEntity customerEntity= (CustomerEntity)q.getSingleResult();
			System.out.println(customerEntity);*/

			System.out.println("qwert");
		return q.getSingleResult();
	}
	
	@Transactional
	public String reset(String oldPass,String newPass) {
		String s1=null;
		System.out.println("now im here");
		String ql = "update CustomerEntity set u_pass = :newPass where u_pass = :oldPass";
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
	public void save(CustomerEntity customerEntity) {
		System.out.println("hii4");
		entityManager.persist(customerEntity);
		//entityManager.merge(customerEntity);
		System.out.println("hi5");
	}

	@Transactional
	public String change(String u_add, String u_pass) {
		String ql = "update CustomerEntity set u_pass = :newPass where u_add = :address";
		Query q = entityManager.createQuery(ql);
		System.out.println("now im here");
		q.setParameter("newPass", u_pass);
		q.setParameter("address", u_add);
		int result = q.executeUpdate();
		String s1;
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
	
}
