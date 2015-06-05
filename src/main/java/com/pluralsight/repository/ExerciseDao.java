package com.pluralsight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Exercise;

@Repository("exerciseDao")
public interface ExerciseDao extends JpaRepository<Exercise, Long> {
	
	/* 1. parameter mit szolgalunk ki, 2. param az elsodleges kulcsanak tipusa*/
	/* fater extend all of the basic function is aviable */
	
}
