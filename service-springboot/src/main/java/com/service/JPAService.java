package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.JPADao;
import com.entity.DemoEntity;

@Service("jPAService")
public class JPAService {
	@Autowired
	private JPADao jPADao;
	public List<DemoEntity> getList(){
		return jPADao.findAll();
	}
}
