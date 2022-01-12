package com.epam.projects.decorator;

public class MobileDecorator extends Page {

	public MobileDecorator(Widget rank) {
		super(rank);
		
	}
	
	@Override
	public String setRank() {
		return pagerank.setRank() + addMobileSize();
	}
	private String addMobileSize() {
		return "Mobile Resolution per page:";
	}

}
