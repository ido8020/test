package com.rubypaper.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface EnrolRepository 
             extends CrudRepository<Enrol,String> 
                     , QuerydslPredicateExecutor<Enrol> {

	

	Optional<Enrol> findById(String str);

	Optional<Enrol> findById(EnrolPK enrol);


	
}
