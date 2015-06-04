package com.pluralsight.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Range;

@Entity // alap entity annotaciot hasznaljuk, ha cserelni szeretnem a providert, ne kelljen ezt is modositani
@Table(name=Goal.TABLE_NAME)
public class Goal {

	public final static String TABLE_NAME = "goals";
	public final static String FIELD_MINUTES = "MINUTES";
	public final static String FIELD_ID = "GOAL_ID";
	
	@Id
	@GeneratedValue
	@Column(name = Goal.FIELD_ID)
	private Long id;
	
	@Range(min = 1, max = 120)
	@Column(name = Goal.FIELD_MINUTES)
	private int minutes;

	public long getId() {
		return id;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
}
