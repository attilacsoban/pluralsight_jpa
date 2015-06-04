package com.pluralsight.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

	@SuppressWarnings("unchecked")
	public List<Goal> findAll() {
		Query q = em.createQuery("select g from Goal g");
		return q.getResultList();
	}

}
