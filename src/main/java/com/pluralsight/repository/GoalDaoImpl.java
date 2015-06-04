package com.pluralsight.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pluralsight.model.Goal;

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

}
