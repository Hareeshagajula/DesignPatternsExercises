package com.epam.designpatterns.day6;

public class ChickenDecorator extends SandwichDecorator {

	public ChickenDecorator(Sandwich customSandwich) {
		super(customSandwich);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String make() {
		return customSandwich.make() + addDressing();
	}
	private String addDressing() {
		return "add roasted chicken";
	}

}
