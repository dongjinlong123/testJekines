package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages= {"com.controller","com.service"})
@EnableAutoConfiguration
@EntityScan("com.entity")//扫描实体类
@EnableJpaRepositories("com.dao")//扫描dao ，注入容器
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
