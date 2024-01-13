package StepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Demo1 {
	
	WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jagdamb\\Desktop\\chromedriver.exe");

		 driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
		Thread.sleep(5000);

	    
	}

	@When("user enter valid credentails")
	public void user_enter_valid_credentails() throws InterruptedException {
		
		Thread.sleep(5000);		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();

	   
	}

	@Then("user validate home page title")
	public void user_validate_home_page_title() {
		
		String actualTitle = driver.getTitle();

	   
	}


}
