package com.epam.projects.day5;

public class Demo {
	public static void main(String[] args) {
		ReportGenerationContext context = new ReportGenerationContext();
		context.setReportGenerator(new XmlReportGenerator());
		context.generateRequiredReport("Xml");
	}

}
