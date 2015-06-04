package com.pluralsight.model;

//basic POJO for report with projection
public class GoalReport {

	private int goalMinutes;
	private int exerciseMinutes;
	private String exerciseActivity;
	
	/* projection works with constructor*/
	public GoalReport(int goalMinutes, int exerciseMinutes, String exerciseActivity) {
		super();
		this.goalMinutes = goalMinutes;
		this.exerciseMinutes = exerciseMinutes;
		this.exerciseActivity = exerciseActivity;
	}
	public String getExerciseActivity() {
		return exerciseActivity;
	}
	public int getExerciseMinutes() {
		return exerciseMinutes;
	}
	public int getGoalMinutes() {
		return goalMinutes;
	}
	public void setExerciseActivity(String exerciseActivity) {
		this.exerciseActivity = exerciseActivity;
	}
	public void setExerciseMinutes(int exerciseMinutes) {
		this.exerciseMinutes = exerciseMinutes;
	}
	public void setGoalMinutes(int goalMinutes) {
		this.goalMinutes = goalMinutes;
	}
	
	
}
