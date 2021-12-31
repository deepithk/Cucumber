package com.mindtree.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "resources",
		glue = "com.mindtree.stepDefinationSteps")
public class TestRunner {

}