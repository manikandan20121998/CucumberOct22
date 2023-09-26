package org.stepdefinition;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.core.api.Scenario;
import io.cucumber.core.event.Status;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{
    @Before()
	public void BeforeScenario() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.trigana-air.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@After()
	public void AfterScenario(Scenario sc) throws IOException {

		System.out.println(".....AfterScenario....");
		System.out.println("ending................."+new Date());
		
		if (sc.isFailed()) {
			screenshotwithbyte(sc);
					}
	}
}
