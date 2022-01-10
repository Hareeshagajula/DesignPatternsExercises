package com.epam.projects.day4;

public class LunchMenu {
	private String Starter;
	private String mainCourse;
	private String dessert;
	
	public LunchMenu(String starter) {
		this.Starter = starter;
	}
	
	public String getStarter() {
		return Starter;
	}
	public void setStarter(String starter) {
		Starter = starter;
	}
	public String getMainCourse() {
		return mainCourse;
	}
	public void setMainCourse(String mainCourse) {
		this.mainCourse = mainCourse;
	}
	public String getDessert() {
		return dessert;
	}
	public void setDessert(String dessert) {
		this.dessert = dessert;
	}
	
}
