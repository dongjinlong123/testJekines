package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.JPAService;
import com.service.JdbcTemplateService;

@RestController
public class HelloController {
	@Autowired
	@Qualifier(value="jdbcTemplateService")
	private JdbcTemplateService jdbcTemplateService;
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello springboot";
	}
	/**
	 * springboot + jdbcTemplate
	 * @return
	 */
	@RequestMapping("/jdbcTemplate")
	public String jdbcTemplate() {
		return "获取的数量为"+jdbcTemplateService.getCount();
	}
	@Autowired
	@Qualifier(value="jPAService")
	private JPAService jPAService;
	/**
	 * springboot + jpa
	 * @return
	 */
	@RequestMapping("/jpa")
	public String jpa() {
		return "获取的数量为"+jPAService.getList();
	}
}
