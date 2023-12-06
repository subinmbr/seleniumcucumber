package stepDefs;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;

	
	
	@Given("User is on login screen")
	public void user_is_on_login_screen() {
		 driver= new ChromeDriver()   ;
		 driver.get("https://the-internet.herokuapp.com/login");
	}
//	@When("Enters credentials {string} and {string}")
//	public void enters_credentials_and(String Usernme, String pwd) {
//	
//		driver.findElement(By.id("username")).sendKeys(Usernme);
//		driver.findElement(By.id("password")).sendKeys(pwd);
//		driver.findElement(By.className("fa-2x")).click();;
//		
//	}
	
	//using data table as lists
	
//	@When("Enters credentials")
//	public void enters_credentials(DataTable dataTable) {
//		
//		
//		List<List<String>>  users    = dataTable.asLists();
//		String Usernme =  users.get(0).get(0);
//		String pwd = users.get(0).get(1);
//		
//		driver.findElement(By.id("username")).sendKeys(Usernme);
//		driver.findElement(By.id("password")).sendKeys(pwd);
//		driver.findElement(By.className("fa-2x")).click();;
//		
//		
//		
//	   
//	}
	
	
	
	//using data table as maps
	
	@When("Enters credentials")
	public void enters_credentials(DataTable dataTable) {
		
		
		List<Map<String,String>>  users    = dataTable.asMaps();
		String Usernme =  users.get(0).get("username");
		
		String pwd = users.get(0).get("password");
		
		driver.findElement(By.id("username")).sendKeys(Usernme);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("fa-2x")).click();;
		
		
		
	   
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Then("Success message is displayed")
	public void success_message_is_displayed() {
		
		driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
		
		driver.quit();
		
	   
	}
	
	
}
