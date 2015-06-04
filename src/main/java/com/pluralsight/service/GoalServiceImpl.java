package com.pluralsight.service;

import org.pluralsight.repository.GoalDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Goal;

@Service("soalService")
public class GoalServiceImpl implements GoalService {

	@Autowired
	private GoalDAO goalDAO;
	
	public Goal save(Goal goal) {
		
		goalDAO.save(goal);
		
		return goal;
	}

}
