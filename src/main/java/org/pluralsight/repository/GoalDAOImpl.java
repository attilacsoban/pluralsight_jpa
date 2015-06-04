package org.pluralsight.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Goal;

@Repository("goalDAOImpl")
public class GoalDAOImpl implements GoalDAO {

	@PersistenceContext
	private EntityManager em;
	
	public Goal save(Goal goal) {
		
		em.persist(goal);
		
		return goal;
	}

}
