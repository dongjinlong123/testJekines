package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service("jdbcTemplateService")
public class JdbcTemplateService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	/**
	 * 使用jdbc模板
	 * @return
	 */
	public Integer getCount() {
		String sql = "select count(1) from demo";
		Integer i = jdbcTemplate.queryForObject(sql, Integer.class);
		return i;	
	}
}
