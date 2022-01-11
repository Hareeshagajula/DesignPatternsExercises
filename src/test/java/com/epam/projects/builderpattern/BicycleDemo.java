package com.epam.projects.builderpattern;

public class BicycleDemo {
	public Bicycle getBicycleReady(String[] args) {

		Bicycle.Builder builder = new Bicycle.Builder().gears("3").stands("2").seats("1").carrier("1");
		Bicycle bc = builder.build();
		return bc;

	}
}