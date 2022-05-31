package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.SeleniumUtility;

public class Test_vTigerLoginPage extends SeleniumUtility{
	
	WebDriver driver;
	String Appurl ;
	
	@Given("^User has a valid application URL$")
	public void user_has_a_valid_application_URL() {
	 Appurl="https://demo.vtiger.com/vtigercrm/index.php" ;
	
	}

	@When("User hits a login page url")
	public void user_hits_a_login_page_url() {
	driver=setUp("chrome",Appurl);	
	}

	@Then("User should reach to login page with title {string}")
	public void user_should_reach_to_login_page_with_title(String string) {
	String etitle=driver.getTitle(); 
	Assert.assertEquals(string, etitle, "User not reached to login page");
	}

	@Then("close the browser for vtiger")
	public void close_the_browser_for_vtiger() {
	   driver.close();
	}
	
	@Given("User has a valid application URL {string}")
	public void user_has_a_valid_application_url(String appurl) {
	Appurl=appurl;
	}
	
	@Given("^User has a valid application URL(.+)$")
	public void user_has_a_valid_application_URL(String url) {
	Appurl=url;	
	}

	@And("Enter the username as {string}")
	public void Enter_the_username_as(String string1 ) {
	WebElement uID=driver.findElement(By.id("username")) ;
	typeInput(uID,string1);
	}
	
	@And("^Enter the username as (.+)$")
	public void Enter_the_username(String string2 ) {
	WebElement uID=driver.findElement(By.id("username")) ;
	typeInput(uID,string2);
	}
	
	@And("Enter the password as {string}")
	public void Enter_the_password_as(String string3 ) {
	WebElement pwd=driver.findElement(By.id("password")) ;
	typeInput(pwd,string3);
	}
	
	@And("^Enter the password as (.+)$")
	public void Enter_the_password(String string4 ) {
	WebElement pwd=driver.findElement(By.id("password")) ;
	typeInput(pwd,string4);
	}

	@And("^Click on Signin button$")
	public void click_on_signin_button() {
		WebElement signInButton=driver.findElement(By.xpath("//button[text()='Sign in']"));
		clickOnElement(signInButton);
	}
	
	@Then("User should reach to home page with title {string}")
	public void user_should_remain_in_login_page_with(String pagetitle) {
		Assert.assertEquals(getCurrentTitleOfApplication(), pagetitle,"User not reached to "+pagetitle+"page");

	}

	@Then("^User should remain in login page with title (.+)$")
	public void user_should_remain_in_login_page_with_title(String pagetitle) {
		Assert.assertEquals(getCurrentTitleOfApplication(), pagetitle,"User not reached to "+pagetitle+"page");

	}

}
