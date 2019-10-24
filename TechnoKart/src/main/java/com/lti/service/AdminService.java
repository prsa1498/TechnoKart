package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.AdminDao;
import com.lti.entity.RetailerEntity;

@Service
public class AdminService {

	@Autowired
	private AdminDao adminDao;
	
	public void register(RetailerEntity retailerEntity) {
		System.out.println("hii2");
		adminDao.save(retailerEntity);
		System.out.println("hii3");
		//sending email code here
	}
	
	public String reset(String oldPass,String newPass) {
		 System.out.println("now im here");
	   String s1= adminDao.reset(oldPass,newPass);
		return s1;
	}
	
	public List get(String a_email) {
		 System.out.println("now im here");
		List c1=  adminDao.fetch(a_email);
/*		Iterator i = c1.iterator();
		CustomerEntity c2 = (CustomerEntity) i.next();*/
		
		return c1;
	}
}
