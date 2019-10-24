package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.lti.dao.RetailerDao;
import com.lti.entity.ProductEntity;

@Service
public class RetailerService {

	@Autowired
	private RetailerDao retailerDao;
	
	public void register(ProductEntity productEntity) {
		System.out.println("hii2");
		retailerDao.save(productEntity);
		System.out.println("hii3");
		//sending email code here
	}
	
	public String reset(String oldPass,String newPass) {
		 System.out.println("now im here");
	   String s1= retailerDao.reset(oldPass,newPass);
		return s1;
	}
	
	public List get(String r_email) {
		 System.out.println("now im here");
		List c1=  retailerDao.fetch(r_email);
/*		Iterator i = c1.iterator();
		CustomerEntity c2 = (CustomerEntity) i.next();*/
		
		return c1;
	}
}
