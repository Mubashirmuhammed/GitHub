/*package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DealsStepDefinitions {
WebDriver driver;
	
	
	@Given("^User is allready on Login page$")
	public void user_is_already_on_Login_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe");	
		driver = new ChromeDriver(); 
		driver.get("https://classic.freecrm.com/index.html");
		driver.manage().window().maximize();
	}

	@When("^Title is FreeCRM$")
	public void title_of_login_page_is() {
		String actualTitle = driver.getTitle();
		System.out.println("Login Page title ::"+ actualTitle);
		Assert.assertEquals("Free CRM - CRM software for customer relationship management, sales, and support.", actualTitle);
	}

	@Then("^user enters username and password$")
	public void user_enters_userID_and_Passwrd(DataTable credentials) throws InterruptedException {
		List<List<String>> data = credentials.asLists();
		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
		Thread.sleep(2000);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException{
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
	}
	@Then("user is on home page")
	public void user_is_on_home_page() {
		 String title = driver.getTitle();
		 System.out.println("Home Page title ::"+ title);
		 Assert.assertEquals("CRMPRO",title );
	}
	
	@Then("^user moves to new deal page$")
	public void user_moves_to_new_deal_page() {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
		
		}
	 @Then("^user enters deal details$")
	 public void user_enters_contacts_details(DataTable dealData){
		 List<List<String>> dealValues =  dealData.asLists();
		 driver.findElement(By.id("title")).sendKeys(dealValues.get(0).get(0));
		 driver.findElement(By.id("amount")).sendKeys(dealValues.get(0).get(1));
		 driver.findElement(By.id("probability")).sendKeys(dealValues.get(0).get(2));
		 driver.findElement(By.id("commission")).sendKeys(dealValues.get(0).get(3));
	 }
	
	
	 @Then("Close the browser")
	 public void close_the_browser() {
			driver.quit();
	    
	}
	
	
	
}
*/