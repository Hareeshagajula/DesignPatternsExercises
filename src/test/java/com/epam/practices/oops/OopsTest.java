package com.epam.practices.oops;

abstract class Flower {
	int price;

	abstract void getPrice();
}

class Rose extends Flower {
	int price = 1;

	public void getPrice() {
		System.out.println("Price of the flower: Rose in $->" + price);
	}
}

class Jasmine extends Flower {
	int price = 2;

	public void getPrice() {
		System.out.println("Price of the flower: Jasmine in $->" + price);
	}

}

class Lily extends Flower {
	int price = 3;

	public void getPrice() {
		System.out.println("Price of the flower: Lily in $->" + price);
	}

}
//
public class OopsTest {

	public static void main(String[] args) {
		Flower f = new Rose();
		f.getPrice();
		
		Flower j = new Jasmine();
		j.getPrice();
		
		Flower l = new Lily();
		l.getPrice();
		
		System.out.println("") ; //interface implement & calculating bouquet

	}

}
