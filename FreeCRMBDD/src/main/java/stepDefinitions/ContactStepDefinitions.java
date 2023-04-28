/*package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactStepDefinitions {
	
	
	WebDriver driver;
	
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://classic.freecrm.com");
		driver.manage().window().maximize();
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() throws Throwable {
		String actualTitle = driver.getTitle();
		System.out.println("Login Page title ::"+ actualTitle);
		Assert.assertEquals("Free CRM - CRM software for customer relationship management, sales, and support.", actualTitle);
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(2000);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
	}
	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		 String title = driver.getTitle();
		 System.out.println("Home Page title ::"+ title);
		 Assert.assertEquals("CRMPRO",title );
	}
	
	
	@Then("^user moves to new contact page$")
	public void user_moves_to_new_contact_page() throws Throwable {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
		 
	}

	@Then("^user enters contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_contact_details_and_and(String arg1, String arg2, String arg3) throws Throwable {
		Select select = new Select(driver.findElement(By.name("title")));
		select.selectByVisibleText(arg1);
		
		driver.findElement(By.id("first_name")).sendKeys(arg2);
		driver.findElement(By.id("surname")).sendKeys(arg3);
		//driver.findElement(By.name("client_lookup")).sendKeys("comp");
		 driver.findElement(By.xpath("//input[@type='submit' and @value= 'Save']")).click();
	}
	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
			driver.quit();
	    
	}
}
*/
