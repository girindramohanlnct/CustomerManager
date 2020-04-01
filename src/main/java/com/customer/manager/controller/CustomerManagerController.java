package com.customer.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.manager.Dao.BaseDAO;
import com.customer.manager.Dao.GenericDAOImpl;
import com.customer.manager.entity.Door;

@RestController
public class CustomerManagerController {
	
	@Autowired(required=false)
	private GenericDAOImpl<?> genericDAOImpl;
	
	@Autowired(required=false)
	private BaseDAO baseDao;
	
	@GetMapping("/hello")
	public Door greet() {
		System.out.println("Hello user");
		Door d = new Door();
		d.setId("mohan");
		baseDao.getHibernateSession().save(d);
		return d;
	}

}
