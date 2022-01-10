package com.epam.projects.factory;

public enum DriverType {
	CHROME("chrome"),
	FIREFOX("firefox"),
	IPHONE("DEV"),
	SAFARI("STAGING"),
	ANDROID("STAGING"),
	IE("PRODUCTION");
	  
	
	


private final String sectionOption;

DriverType(String sectionName) {
  this.sectionOption = sectionName;
}

public String getsectionName() {
  return this.sectionOption;
}

}
