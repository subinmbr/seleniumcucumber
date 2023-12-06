package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchStepDef {
	WebDriver driver;
	
	@Given("User is on Google Home Page")
	public void user_is_on_google_home_page() {
	 driver= new ChromeDriver()   ;
	 driver.get("https://www.google.co.in/");
	  
	}
	@When("User search Java Tutorial")
	public void user_search_java_tutorial() {
	WebElement src= 	driver.findElement(By.id("APjFqb"));
	src.sendKeys("java tutorial");
	src.sendKeys(Keys.ENTER);
	    
	}
	@Then("Should display Java Result page")
	public void should_display_java_result_page() {
		//System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "java tutorial - Google Search");
		
	   
	}
	
	@When("User search Selenium Tutorial")
	public void user_search_selenium_tutorial() {
		WebElement src= 	driver.findElement(By.id("APjFqb"));
		src.sendKeys("Selenium tutorial");
		src.sendKeys(Keys.ENTER);
	}
	@Then("Should display Selenium Result page")
	public void should_display_selenium_result_page() {
		Assert.assertEquals(driver.getTitle(), "Selenium tutorials - Google Search");
		  
	}
	
	
	@After
	
	public void attachScenario(Scenario scenario) {
		
		if(scenario.isFailed()) {
			
			TakesScreenshot screen = (TakesScreenshot)driver;
			byte[]imgBytes = screen.getScreenshotAs(OutputType.BYTES);
			scenario.attach(imgBytes, "image/png", "ScreenImage");
			
		}
	}
	

}