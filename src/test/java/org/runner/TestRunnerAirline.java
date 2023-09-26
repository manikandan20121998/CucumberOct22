package org.runner;

import java.io.IOException;

import org.base.BaseClass;
import org.base.JVMReport;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="org.stepdefinition",monochrome=true,
tags="@E2E",dryRun=false,

		plugin= {"pretty",
				"pretty:pretty.txt",
				"usage:usage.txt",
				"html:src\\test\\resources\\Reports\\html",
				"json:src\\test\\resources\\Reports\\JsonReport\\jsonrep.json",
				"junit:src\\test\\resources\\Reports\\JunitReport\\junitrep.xml",
				"rerun:src\\test\\resources\\Reports\\failedScenario.txt"
		}
		)
public class TestRunnerAirline {	
@AfterClass
public static void generate() {

	JVMReport.generateReport("src\\test\\resources\\Reports\\JsonReport\\jsonrep.json");
	System.out.println("done...................");
}
	
	
}
