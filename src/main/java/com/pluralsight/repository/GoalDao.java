package com.pluralsight.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;

@Repository("goalDao")
public interface GoalDao extends JpaRepository<Goal, Long>{

	@Query("select new com.pluralsight.model.GoalReport(g.minutes,e.minutes,e.activity) "
				+ "from Goal g, Exercise e where g.id = e.goal.id")
	List<GoalReport> findAllGoalReports();

}
