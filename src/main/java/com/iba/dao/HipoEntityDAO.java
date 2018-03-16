package com.iba.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iba.persistance.HipoEntity;

/**
 * 
 * Using Spring Data JPA library for Database services <br/>
 * Reference: https://projects.spring.io/spring-data-jpa/
 * 
 *
 */
@Repository("hipoEntityDao")
public interface HipoEntityDAO extends CrudRepository<HipoEntity, Long> {

}
