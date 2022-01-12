package com.epam.projects.decorator;

public class WidgetDecorator implements Widget{

	@Override
	public String setRank() {
		System.out.println("Rank for this Page is:6");
		return "6";
	}

}
