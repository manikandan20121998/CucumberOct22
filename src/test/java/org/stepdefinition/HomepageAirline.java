package org.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.base.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomepageAirline extends BaseClass {
	
	//public BaseClass b;
	@Given("The user should be in airline login page")
	public void the_user_should_be_in_airline_login_page() {

	}
	@When("The user has enter from and to location")
	public void the_user_has_enter_from_and_to_location() throws InterruptedException, IOException {
		Thread.sleep(5000);
		WebDriver frame = driver.switchTo().frame(0);
		String currentUrl = frame.getCurrentUrl();
		String title = frame.getTitle();
		System.out.println(title);
		System.out.println(currentUrl);
	//	((JavascriptExecutor)driver).executeScript("window.open()");
		driver.switchTo().defaultContent();
//		WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));
//		home.click();
//		Thread.sleep(3000);
//		screenshottestng("airline");
		
		WebElement round = driver.findElement(By.id("lblRdRoundTrip"));
		round.click();
		WebElement from = driver.findElement(By.id("selOrigin"));
		Select s=new Select(from);
		s.selectByIndex(3);
//		WebElement cl = driver.findElement(By.xpath("//option[text()='Oksibil, Oksibil (OKL)']"));
//		cl.click();
		
		WebElement to = driver.findElement(By.id("selDestination"));
		Select s1=new Select(to);
		s1.selectByIndex(2);
//		WebElement cl2 = driver.findElement(By.xpath("(//option[@value='DJJ'])[2]"));
//		cl2.click();
	}
    @When("to select a adult,child,infant details")
    public void to_select_a_adult_child_infant_details() {
       WebElement adult = driver.findElement(By.id("selPaxAdult"));
       Select s=new Select(adult);
       s.selectByValue("2");
       
       WebElement child = driver.findElement(By.id("selPaxChild"));
       Select s1=new Select(child);
       s1.selectByVisibleText("3");
       
       WebElement infant = driver.findElement(By.id("selPaxInfant"));
       Select s2=new Select(infant);
       s2.selectByIndex(0);
    }
	@When("then click a search button")
	public void then_click_a_search_button() {
		WebElement ser = driver.findElement(By.id("btn_search_flight"));
		ser.click();
//		Alert sim = driver.switchTo().alert();
//		sim.dismiss();
	}
	 @When("click date of departure")
	    public void click_date_of_departure() throws InterruptedException {
		 Thread.sleep(3000);
	    	WebElement d = driver.findElement(By.id("cal_departure_icon"));
	    	d.click();
		    WebElement date1 = driver.findElement(By.xpath("//input[@value='12']"));
		    date1.click();
	     
	       WebElement d1 = driver.findElement(By.id("cal_return_icon"));
	       d1.click();
	       WebElement date2 = driver.findElement(By.xpath("//input[@value='15']"));
	       date2.click();
	       
	       WebElement ser = driver.findElement(By.id("btn_search_flight"));
	       ser.click();
	       Thread.sleep(2000);
	       WebElement bill = driver.findElement(By.id("div_flight_details"));
	       System.out.println(bill.getText());
	       WebElement confirm = driver.findElement(By.id("chk_agreement"));
	       JavascriptExecutor je=(JavascriptExecutor)driver;
	       je.executeScript("arguments[0].scrollIntoView(false)", confirm);
	       confirm.click();
	       WebElement last = driver.findElement(By.id("btn_continue"));
	       je.executeScript("arguments[0].scrollIntoView(false)", last);
	       Thread.sleep(10000);
	       last.click();
	       Thread.sleep(3000);
	       Alert alert = driver.switchTo().alert();
	       alert.accept();
	 }  
	         
	@Then("The user should be see a Flight list")
	public void the_user_should_be_see_a_Flight_list() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("done");
		driver.close();
	}
	//scenario second
	@Given("The user should be in airline page")
	public void the_user_should_be_in_airline_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
	   
		driver=new ChromeDriver();
		driver.get("http://www.trigana-air.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}

	@When("to click our branches button")
	public void to_click_our_branches_button() {
       WebElement cl = driver.findElement(By.xpath("//button[text()='Our Branch']"));
       cl.click();
	}

	@When("to take screenshot on first page what we see")
	public void to_take_screenshot_on_first_page_what_we_see() throws IOException, InterruptedException {
		Thread.sleep(3000);
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshot\\ourbranches.png");
		FileUtils.copyFile(src, des);
	}

	@When("then scroll down then take another one screenshot")
	public void then_scroll_down_then_take_another_one_screenshot() throws IOException {
	    WebElement close = driver.findElement(By.xpath("(//button[text()='Close'])[7]"));
	    JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("arguments[0].scrollIntoView(true)", close);
	    TakesScreenshot tk=(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshot\\ourbranches2.png");
		FileUtils.copyFile(src, des);
	}

	@When("then click a close button")
	public void then_click_a_close_button() {
		 WebElement close = driver.findElement(By.xpath("(//button[text()='Close'])[7]"));
		 close.click();
	}
	//third
	@Given("to go airline page")
	public void to_go_airline_page() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI MADDY\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
	//  WebDriverManager.chromedriver().version("107").setup();
		 driver=new ChromeDriver();
	   driver.get("http://www.trigana-air.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	@When("to click and take pic on that particular picture")
	public void to_click_and_take_pic_on_that_particular_picture() throws IOException, InterruptedException {
	    WebElement air = driver.findElement(By.xpath("(//img[@class='img-responsive'])[9]"));
	    JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("arguments[0].scrollIntoView(true)", air);
		air.click();
		Thread.sleep(3000);
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshot\\airpic.png");
		FileUtils.copyFile(src, des);
	}
	
}
