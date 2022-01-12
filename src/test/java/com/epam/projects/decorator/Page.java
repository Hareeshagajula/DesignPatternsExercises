package com.epam.projects.decorator;

public class Page implements Widget {

	Widget pagerank;
	public Page (Widget rank) {
		this.pagerank = rank;
	}
	@Override
	public String setRank() {
		
		return pagerank.setRank();
	}
	


}
