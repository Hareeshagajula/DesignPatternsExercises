package com.epam.projects.mypattern;

public class TestPattern {
	
	public static void main(String[] args) {
		long timeBefore=0;
		long timeAfter =0;
		timeBefore = System.currentTimeMillis();
		IamAPattern iObj = IamAPattern.getInstance();
		timeAfter = System.currentTimeMillis();
		//System.out.println(iObj);
	}

}
