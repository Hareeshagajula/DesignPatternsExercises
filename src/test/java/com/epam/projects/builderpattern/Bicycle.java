package com.epam.projects.builderpattern;


public class Bicycle {
	private String gears1;
	private String stands1;
	private String seats1;
	private String carrier1;
	//gears, double stands, double seats, carrier etc.
	

	private Bicycle(Builder builder) {
		this.gears1  = builder.gears;
		this.stands1 = builder.stands;
		this.seats1 = builder.seats;
		this.carrier1 = builder.carrier;
	}
	public static class Builder{
		private String gears;
		private String stands;
		private String seats;
		private String carrier;
		public Builder() {
			
		}
		public Builder gears(String gears) {
			this.gears = gears;
			return this;
		}
		public Builder stands(String stands) {
			this.stands = stands;
			return this;
		}
		public Builder seats(String seats) {
			this.seats = seats;
			return this;
		}
		public Builder carrier(String carrier) {
			this.carrier = carrier;
			return this;
		}
		public Bicycle build() {
			return new Bicycle(this);
		}
	}
	
	
}

