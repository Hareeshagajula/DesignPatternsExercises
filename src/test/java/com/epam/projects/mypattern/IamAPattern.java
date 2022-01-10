package com.epam.projects.mypattern;

public class IamAPattern {
	// private static IamAPattern patternInstance=null;
	private static IamAPattern patternInstance = new IamAPattern();

	//
	private IamAPattern() {
		if (patternInstance == null) {
			throw new RuntimeException("This is not supposed");
		}

		System.out.println("Instance is 3");
	}

	static IamAPattern getInstance() {
//		if(patternInstance==null) {
//			patternInstance= new IamAPattern();
//		}
		if (patternInstance == null) {
			synchronized (IamAPattern.class) {
				if (patternInstance == null) {
					patternInstance = new IamAPattern();
				}
			}
		}
		return patternInstance;
	}

}
