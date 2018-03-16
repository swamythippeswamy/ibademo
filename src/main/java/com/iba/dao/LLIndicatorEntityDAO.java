package com.iba.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iba.persistance.LLIndicatorEntity;

/**
 * 
 * Using Spring Data JPA library for Database services <br/>
 * Reference: https://projects.spring.io/spring-data-jpa/
 * 
 *
 */
@Repository
public interface LLIndicatorEntityDAO extends CrudRepository<LLIndicatorEntity, Long> {

	@Override
	List<LLIndicatorEntity> findAll();
}
