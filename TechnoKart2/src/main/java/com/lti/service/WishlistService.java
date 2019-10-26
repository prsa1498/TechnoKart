package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.CartDao;
import com.lti.dao.WishlistDao;

@Service
public class WishlistService {

	@Autowired
	private WishlistDao wishlistDao;
	
	public String addProd(int p_id, int u_id)
	{
		String s1= wishlistDao.addProd(p_id,u_id);
		return s1;
	}
}
