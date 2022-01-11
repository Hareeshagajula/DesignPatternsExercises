package com.epam.projects.day4;

public class LunchMenu {
	private String Starter;
	private String mainCourse;
	private String dessert;
	
//	public LunchMenu(String starter,String maincourse,String dessert) {
//		this.Starter = starter;
//		this.mainCourse = maincourse;
//		this.dessert = dessert;
//	}
//	
//	public LunchMenu(String starter) {
//		this.Starter = starter;
//		
//	}
//	public LunchMenu(String starter,String maincourse) {
//		this.Starter = starter;
//		this.mainCourse = maincourse;
//		
//	}
	private LunchMenu(Builder builder) {
		this.Starter  = builder.Starter;
		this.mainCourse = builder.mainCourse;
		this.dessert = builder.dessert;
	}
	public static class Builder{
		private String Starter;
		private String mainCourse;
		private String dessert;
		public Builder() {
			
		}
		public Builder starter(String starter) {
			this.Starter = starter;
			return this;
		}
		public Builder mainCourse(String mainCourse) {
			this.mainCourse = mainCourse;
			return this;
		}
		public Builder dessert(String dessert) {
			this.dessert = dessert;
			return this;
		}
		public LunchMenu build() {
			return new LunchMenu(this);
		}
	}
	
	public String getStarter() {
		return Starter;
	}
	
	public String getMainCourse() {
		return mainCourse;
	}
	
	public String getDessert() {
		return dessert;
	}
	
}
