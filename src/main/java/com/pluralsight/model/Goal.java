package com.pluralsight.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Range;

@Entity // alap entity annotaciot hasznaljuk, ha cserelni szeretnem a providert, ne kelljen ezt is modositani
@Table(name=Goal.TABLE_NAME)
@NamedQueries({
	@NamedQuery(name = Goal.FIND_GOAL_REPORTS,query = "select new com.pluralsight.model.GoalReport(g.minutes,e.minutes,e.activity) "
				+ "from Goal g, Exercise e where g.id = e.goal.id"),
				@NamedQuery(name = Goal.FIND_ALL_GOALS, query = "select g from Goal g")
})
public class Goal {

	public final static String TABLE_NAME = "goals";
	public final static String FIELD_MINUTES = "MINUTES";
	public final static String FIELD_ID = "GOAL_ID";
	public final static String FIND_GOAL_REPORTS = "findGoalReports";
	public final static String FIND_ALL_GOALS = "findAllGoals";
	
	@Id
	@GeneratedValue
	@Column(name = Goal.FIELD_ID)
	private Long id;
	
	@Range(min = 1, max = 120)
	@Column(name = Goal.FIELD_MINUTES)
	private int minutes;
	
	/* lazy initialization exception gyakori hiba kelll csinalni valamit,
	 * openentitymanagerviewfiler calss kell web.xml-be implementalunk megakadalyozza h 
	 * bezarja a sessiont a req-resp ciklusban kitolja a jpa session idejet, h visszaerjen a respons adat
	 * ha lazy fetchet hasznalok
	 * filtert kell alkalmazni ennyi a web.xml ben
	 *  */
	@OneToMany(mappedBy = "goal",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Exercise> exercises = new ArrayList<Exercise>();
	
	

	public List<Exercise> getExercises() {
		return exercises;
	}

	public void setExercises(List<Exercise> exercises) {
		this.exercises = exercises;
	}

	public Long getId() {
		return id;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
}
