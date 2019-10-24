package com.lti.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.CustomerDao;
import com.lti.entity.CustomerEntity;

@Service
public class CustomerService {
	@Autowired
	private CustomerDao customerDao;
	
	public List get(String u_email) {
		 System.out.println("now im here");
		List c1=  customerDao.fetch(u_email);
/*		Iterator i = c1.iterator();
		CustomerEntity c2 = (CustomerEntity) i.next();*/
		
		return c1;
	}
	
	public String reset(String oldPass,String newPass) {
		 System.out.println("now im here");
	   String s1= customerDao.reset(oldPass,newPass);
		return s1;
	}
	
	public void register(CustomerEntity customerEntity) {
		System.out.println("hii2");
		customerDao.save(customerEntity);
		System.out.println("hii3");
		//sending email code here
		}
}
