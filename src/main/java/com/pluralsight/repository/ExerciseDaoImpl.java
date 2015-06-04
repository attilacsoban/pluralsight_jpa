package com.pluralsight.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Exercise;

@Repository("exerciseDao")
public class ExerciseDaoImpl implements ExerciseDao {

	@PersistenceContext
	private EntityManager em;
	
	public Exercise save(Exercise ex) {
		em.persist(ex);
		em.flush();
		return ex;
	}

}
