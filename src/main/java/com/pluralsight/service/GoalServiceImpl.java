package com.pluralsight.service;

import org.pluralsight.repository.GoalDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Goal;

@Service("goalService")
public class GoalServiceImpl implements GoalService {

	@Autowired
	private GoalDao goalDao;
	
	public Goal save(Goal goal) {
		System.out.println("aaaaaaaaaaaaaa");
		goalDao.save(goal);
		
		return goal;
	}

}
