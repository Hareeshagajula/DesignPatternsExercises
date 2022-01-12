package com.epam.designpatterns.day6;

public class Demo {
	public static void main(String[] args) {
		Sandwich sandwich = new DressingDecorator(new ChickenDecorator(new PlainSandwich()));
		System.out.println(sandwich.make());
	}

}
