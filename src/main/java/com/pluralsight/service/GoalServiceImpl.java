package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.pluralsight.model.Goal;
import com.pluralsight.repository.GoalDao;

@Service("goalService")
public class GoalServiceImpl implements GoalService {

	@Autowired
	private GoalDao goalDao;
	
	public GoalDao getGoalDao() {
		return goalDao;
	}

	public void setGoalDao(GoalDao goalDao) {
		this.goalDao = goalDao;
	}

	@Transactional(value="transactionManager",propagation = Propagation.REQUIRED)
	public Goal save(Goal goal) {
		return goalDao.save(goal);
	}

	public List<Goal> findAll() {
		return goalDao.findAll();
		
	}

}
