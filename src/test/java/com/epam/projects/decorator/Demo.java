package com.epam.projects.decorator;

public class Demo {
	public static void main(String[] args) {
		
		Widget w = new MobileDecorator(new Page(new WidgetDecorator()));
		System.out.println(w.setRank());
		
		Widget w1 = new DesktopDecorator(new Page(new WidgetDecorator()));
		System.out.println(w1.setRank());
	}

}
