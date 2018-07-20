package com.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.DemoEntity;
/**
 * 必须要集成JpaRepository
 * @author 90411
 *
 */
public interface JPADao extends JpaRepository<DemoEntity, Serializable> {

}
