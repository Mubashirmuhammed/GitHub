/*package stepDefinitions;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

	

public class LoginStepDefinitions {
	
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

	@Then("^user enters \\\"([^\\\"]*)\\\" and \\\"([^\\\"]*)\\\"$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("username");
		driver.findElement(By.name("password")).sendKeys("password");
		Thread.sleep(2000);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException{
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
	}

	@Then("^user is on Homepage")
	public void user_is_on_Homepage() throws Throwable {
		 String title = driver.getTitle();
		 System.out.println("Home Page title ::"+ title);
		 Assert.assertEquals("CRMPRO",title );
	}
	
	@Then("^user quit$")
	public void user_quit() throws Throwable {
			driver.quit();
	    
	}

	
	
}
	
	
	
	*/
	
	
	
	
	

