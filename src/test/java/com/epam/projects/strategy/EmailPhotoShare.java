package com.epam.projects.strategy;

public class EmailPhotoShare implements PhotoShare {

	@Override
	public void sharephotos(String medium) {
		System.out.println("Sharing photos through email");
		
	}

	

}
