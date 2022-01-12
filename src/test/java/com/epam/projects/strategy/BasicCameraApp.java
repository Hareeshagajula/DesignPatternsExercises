package com.epam.projects.strategy;

public class BasicCameraApp implements PhoneCameraApp {

	@Override
	public void sharephotos(String medium) {
		System.out.println("sharing photos in Phone that has only camera app");
		
	}

	@Override
	public void takephoto() {
		System.out.println("taking photos in Phone that has only camera app");

		
	}

	@Override
	public void editphoto() {
		System.out.println("editing photos in Phone that has only camera app");

		
	}

	@Override
	public void savephoto() {
		System.out.println("save photos in Phone that has only camera app");

		
	}

}
