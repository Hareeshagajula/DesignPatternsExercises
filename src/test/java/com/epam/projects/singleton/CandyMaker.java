package com.epam.projects.singleton;

public class CandyMaker {

	private static boolean empty = true;
	private static boolean boiled = false;

	private CandyMaker() {
		empty = true;
		boiled = false;
	}

	//get status of the mix if it is empty
	static boolean getEmptyStatus() {

		synchronized (CandyMaker.class) {
			return empty;
		}
	}

	//get status of the mix if it is boiled
	static boolean getBoiledStatus() {

		synchronized (CandyMaker.class) {
			return boiled;
		}
	}

	//
	// to fill the boiler it must be empty, and once its full,
	// we set the empty and boiled flags
	static void fill() {

		if (empty==true) {
			synchronized (CandyMaker.class) {
				if (empty == true) {
					empty = false;
					boiled = false;
					// fill the candyMaker with milk and choclate mix
					System.out.println("Choclate Mix is ready or filled: Empty value:" + empty+"-Boiled value:" +boiled);
					
				}
			}
			
		}

	}

	// To drain the boiler, it must be full(non-empty) and also boiled.
	// once it is drained, we set the empty back to true
	static void drain() {
		if (empty == false && boiled == true) {
			synchronized (CandyMaker.class) {
				if (empty == false && boiled == true) {
					// drain the boiled milk and chocolate
					empty = true;
					System.out.println("Choclate Mix is drained: Empty value:" + empty+"-Boiled value:" +boiled);
				}
			}
			
		}
	}

	// to boil the mixture the boiler has to be full and not already boiled.
	// once its boiled we set the boiled flag to true
	static void boil() {
		if (empty==false && boiled==false) {
			synchronized (CandyMaker.class) {
				if (empty==false && boiled==false) {
					// bring the content to boil
					boiled = true;
					System.out.println("Choclate Mix is boiled: Empty value:" + empty+"-Boiled value:" +boiled);
				}
			}
			
		}
	}

}
