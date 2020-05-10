package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	public WebDriver driver;
	@Given("^User should be in login page$")
	public void openLoginPage() {
		/*
		 * driver = new ChromeDriver(); driver.get("http://localhost/login.do");
		 */
		System.out.println("Login page got opened");
	}
	@When("^User logs in with vallid username and password$")
	public void loginWithValidUnAndPw() throws InterruptedException {
		/*
		 * driver.findElement(By.id("username")).sendKeys("admin");
		 * driver.findElement(By.name("pwd")).sendKeys("manager");
		 * driver.findElement(By.xpath("//div[.='Login ']")).click();
		 * Thread.sleep(2000);
		 */
		System.out.println("logging in");
		System.out.println("Changes made in the GitDemo folder...");
	}
	@Then("^Homepage should be displayed$")
	public void verifyHomePage() {
		//System.out.println(driver.getTitle());
		System.out.println("landed in page");
	}
	@And("^All the contents of homepage should be displayed$")
	public void verifyContents() {
		System.out.println("All the contents are displayed");
	}
	
	 @When("^User logs in with (.+) and (.+)$")
	    public void user_logs_in_with_and(String username, String password)  {
		 System.out.println(username);
		System.out.println(password);
	 }
	
}
