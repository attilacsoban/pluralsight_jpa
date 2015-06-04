package com.pluralsight.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = Exercise.TABLE_NAME)
public class Exercise {
	
	public final static String TABLE_NAME = "exercise";
	public final static String FIELD_ID = "ID";
	public final static String FIELD_MINUTES = "MINUTES";
	
	
	@Id
	@GeneratedValue
	@Column(name = Exercise.FIELD_ID)
	private Long id;
	
	@Range(min = 1, max = 120)
	@Column(name = Exercise.FIELD_MINUTES)
	private int minutes;

	@NotNull
	private String activity;
	
	@ManyToOne
	private Goal goal;

	public Goal getGoal() {
		return goal;
	}

	public void setGoal(Goal goal) {
		this.goal = goal;
	}

	public String getActivity() {
		return activity;
	}
	
	public Long getId() {
		return id;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
}
