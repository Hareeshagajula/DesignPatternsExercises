package com.epam.projects.day5;

public class ReportGenerationContext {
	private ReportGeneration reportGenerator;

	public void setReportGenerator(ReportGeneration rGenerator) {
		this.reportGenerator = rGenerator;
	}

	public void generateRequiredReport(String reportType) {
		reportGenerator.GenerateReport(reportType);
	}

}
