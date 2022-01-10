package com.epam.projects.singleton;

public class TestPattern {
	
	public static void main(String[] args) {
		long timeBefore=0;
		long timeAfter =0;
		
		timeBefore = System.currentTimeMillis();
		System.out.println("Time before:" +timeBefore);
		System.out.println("Empty status:" +CandyMaker.getEmptyStatus());
		System.out.println("Boiled status:" +CandyMaker.getBoiledStatus());
		CandyMaker.fill();
		CandyMaker.boil();
		CandyMaker.drain();
		System.out.println("Empty status:" +CandyMaker.getEmptyStatus());
		System.out.println("Boiled status:" +CandyMaker.getBoiledStatus());
		timeAfter = System.currentTimeMillis();
		System.out.println("Time before:" +timeAfter);
		//System.out.println(iObj);
	}

}
