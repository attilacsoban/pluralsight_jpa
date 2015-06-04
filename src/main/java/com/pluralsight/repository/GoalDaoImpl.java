package com.pluralsight.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;

@Repository("goalDao")
public class GoalDaoImpl implements GoalDao {

	@PersistenceContext(unitName="punit")
	private EntityManager em;
	
	@Transactional
	public Goal save(Goal goal) {
		System.out.println("bbbbbbbbbbbbbbbbbbbbbbb");
		em.persist(goal);
		em.flush();
		
		return goal;
	}

	public List<Goal> findAll() {
		//Query q = em.createQuery("select g from Goal g");
		TypedQuery<Goal> q = em.createNamedQuery(Goal.FIND_ALL_GOALS,Goal.class);
		return q.getResultList();
	}

	public List<GoalReport> findAllGoalReports() {
//		Query q = em.createQuery("select new com.pluralsight.model.GoalReport(g.minutes,e.minutes,e.activity) "
//				+ "from Goal g, Exercise e where g.id = e.goal.id");
		TypedQuery<GoalReport> q = em.createNamedQuery(Goal.FIND_GOAL_REPORTS,GoalReport.class);
		return q.getResultList();
	}

}
 