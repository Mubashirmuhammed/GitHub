/*package stepDefinitions;


import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DealsmapStepDefinitions {
	
	WebDriver driver;
	
	
	@Given("user is already on Login Page")
	public void user_is_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe");	
		driver = new ChromeDriver(); 
		driver.get("https://classic.freecrm.com/index.html");
		driver.manage().window().maximize();
	}

	@When("title of login page is Free CRM")
	public void title_of_login_page_is_free_crm() {
		String actualTitle = driver.getTitle();
		System.out.println("Login Page title ::"+ actualTitle);
		Assert.assertEquals("Free CRM - CRM software for customer relationship management, sales, and support.", actualTitle);
	}

	@Then("^user enters username and password$")
	public void user_enters_userID_and_Passwrd(DataTable credentials) throws InterruptedException {
		
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			
			driver.findElement(By.name("username")).sendKeys(data.get("username"));
			driver.findElement(By.name("password")).sendKeys(data.get("password"));

					}
			}
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		js.executeScript("arguments[0].click();", loginBtn);
	
	}

	@Then("^user is on home page$")
	public void user_is_on_hopme_page() {
		String title = driver.getTitle();
		System.out.println("Home Page title ::" + title);
		Assert.assertEquals("CRMPRO", title);
		}

	@Then("^user moves to new deal page$")
	public void user_moves_to_new_deals_page() {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();

	}

	@Then("^user enters deal details$")
	public void user_enters_contacts_details(DataTable dealData) {

		for (Map<String, String> data : dealData.asMaps(String.class, String.class)) {

			driver.findElement(By.id("title")).sendKeys(data.get("title"));
			driver.findElement(By.id("amount")).sendKeys(data.get("amount"));
			driver.findElement(By.id("probability")).sendKeys(data.get("probability"));
			driver.findElement(By.id("commission")).sendKeys(data.get("commission"));
		
			driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click(); //save
			
			//move to new deal page: to help loop
			Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();

		}

		
	}

	@Then("^Close the browser$")
	public void close_the_browser() {
		driver.quit();
	}
}
*/