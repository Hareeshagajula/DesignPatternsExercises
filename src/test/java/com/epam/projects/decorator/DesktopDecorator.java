package com.epam.projects.decorator;

public class DesktopDecorator extends Page {

	public DesktopDecorator(Widget rank) {
		super(rank);
		
	}
	
	@Override
	public String setRank() {
		return pagerank.setRank() + addDesktopSize();
	}
	private String addDesktopSize() {
		return "Resolution size for Desktop: **";
	}

}
