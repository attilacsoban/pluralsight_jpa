package com.pluralsight.repository;

import java.util.List;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;

public interface GoalDao {

	Goal save(Goal goal);

	List<Goal> findAll();

	List<GoalReport> findAllGoalReports();
	
}
