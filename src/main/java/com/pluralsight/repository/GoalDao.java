package com.pluralsight.repository;

import java.util.List;

import com.pluralsight.model.Goal;

public interface GoalDao {

	Goal save(Goal goal);

	List<Goal> findAll();
	
}
