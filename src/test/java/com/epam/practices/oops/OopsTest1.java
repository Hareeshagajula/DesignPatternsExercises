package com.epam.practices.oops;

class Home {
	// variables
	final boolean switchstatus = false;
	int powerunit = 0;
	int funit, lunit, tvunit = 0;

	/*
	 * get appliance status
	 */
	public void getApplianceInfo(String appliance, boolean switchstatus) {
		if (switchstatus == true) {
			switch (appliance) {
			case "FAN":
				powerunit = 1;
				funit = powerunit;
				break;
			case "LIGHT":
				powerunit = 2;
				lunit = powerunit;
				break;
			case "TV":
				powerunit = 3;
				tvunit = powerunit;
				break;
			default:
				break;
			}
		} else {
			powerunit = 0;
		}

	}

	/*
	 * get total power consumption
	 */
	public void getTotalConsumption() {

		int sum = 0;
		sum = funit + lunit + tvunit;
		System.out.println("Total consumption of power at this load:" + sum);
	}
}
	

	public class OopsTest1 {
		public static void main(String[] args) {
			Home h = new Home();
			h.getApplianceInfo("FAN", true);
			h.getApplianceInfo("LIGHT", false);
			h.getApplianceInfo("TV", true);
			h.getTotalConsumption();
			

		}
	}
//we could have used different approach - interface or class creation for appliance with getters

