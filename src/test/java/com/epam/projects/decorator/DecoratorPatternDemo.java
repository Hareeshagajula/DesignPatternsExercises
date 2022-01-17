package com.epam.projects.decorator;

public class DecoratorPatternDemo {

	// Main driver method
	public static void main(String[] args) {

		Widget desktopApp = new DesktopApp();

		Widget pagesDesktop = new PageDecorator(new DesktopApp());

		Widget pagesMobile = new PageDecorator(new MobileApp());
		
		//Get Page Rank for Desktop
		System.out.println("Desktop rank:");
		desktopApp.getRank();
		System.out.println("Desktop rank:");
		pagesDesktop.getRank();

		//Get Page Rank for Mobile
		System.out.println("Mobile rank:");
     	pagesMobile.getRank();

	}
}