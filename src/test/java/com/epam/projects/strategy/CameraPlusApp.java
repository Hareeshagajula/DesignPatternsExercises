package com.epam.projects.strategy;

public class CameraPlusApp implements PhoneCameraApp {

	@Override
	public void sharephotos(String medium) {
		System.out.println("sharing photos in Phone that has both internal camera and camera app");
		
	}

	@Override
	public void takephoto() {
		System.out.println("Taking photos in Phone that has both internal camera and camera app");
		
	}

	@Override
	public void editphoto() {
		System.out.println("Editing photos in Phone that has both internal camera and camera app");
		
	}

	@Override
	public void savephoto() {
		System.out.println("Saving photos in Phone that has both internal camera and camera app");
		
	}

}
