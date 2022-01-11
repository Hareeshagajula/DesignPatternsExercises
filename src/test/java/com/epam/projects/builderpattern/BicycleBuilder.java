package com.epam.projects.builderpattern;

public class BicycleBuilder
implements CycleBuilder {
	private int seats;
	private int stands;
	private int carrier;
	private int gears;
	

	@Override
	public void setSeats(int seatCount) {
		// TODO Auto-generated method stub
		System.out.println("Seats count:" +seatCount);
		
	}

	@Override
	public void setStands(int stands) {
		// TODO Auto-generated method stub
		System.out.println("stands count:" +stands);
		
	}

	@Override
	public void setGears(int gears) {
		// TODO Auto-generated method stub
		System.out.println("gears count:" +gears);
	}

	@Override
	public void setCarrier(int carrier) {
		// TODO Auto-generated method stub
		System.out.println("carrier count:" +carrier);
	}
	public CycleBuilder build() {
		return this;
	}

}
