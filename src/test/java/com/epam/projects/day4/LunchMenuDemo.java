package com.epam.projects.day4;

public class LunchMenuDemo {
	public LunchMenu getLunchMenu(String[] args) {
//		LunchMenu lunchMenu = new LunchMenu("","","");
	
		LunchMenu.Builder builder = new LunchMenu.Builder().starter("vegroll")
				.mainCourse("roti curry").dessert("icecream");
		LunchMenu lunchMenu =builder.build();
		return lunchMenu;
		
		}
}
