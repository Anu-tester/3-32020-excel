package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"C:/Users/Anu/projects3_1/exceldata/excel/src/main/java/features/login.feature"},
	glue= {"/src/main/java/stepDefinitions/TestCases.java"},
		dryRun = false,
		monochrome = true
		)
	public class TestRunner {

	} 

