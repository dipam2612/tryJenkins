package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import backendPages_webpage.GoogleSearch;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import utilities.SeleniumUtility;

public class Test_googleSearchPage extends SeleniumUtility{

	static WebDriver driver;
	GoogleSearch getGoogleSearchPage;
	
	@Given("^User is already in Google search page$") 
	//^.....$ usko aap static bana rahe ho iske aage and pichein kuch bhi nhi aayega
	public void user_is_already_in_Google_search_page() {
		driver= setUp("chrome", "https://www.google.com");			
		getGoogleSearchPage=new GoogleSearch(driver);
	}

	@When("user types {string} in search input field and clicks on search button")
	public void user_types_in_search_input_field_and_clicks_on_search_button(String name) {
		getGoogleSearchPage.searchText(name);
	}

	@Then("user gets search result page with the title {string}")
	public void user_gets_search_result_page_with_the_title(String title) {
		System.out.println(driver.getTitle());
		System.out.println("EX: "+ title);
		Assert.assertEquals(getGoogleSearchPage.searchedResultPageTitle(), title);
	}

	@Then("^close the opened browser$")
	public void close_the_opened_browser() {
		cleanUp();
	}
	
	@When("^user types (.+) in search input field, clicks on search button$")
	public void user_types_in_search_input_field_clicks_on_search_button(String texttobesearched) {
		//driver.findElement(By.name("q")).sendKeys(texttobesearched,Keys.ENTER);
		getGoogleSearchPage.searchText(texttobesearched);
	}
	
	@Then("^user reached to search result page with the title (.+)$")
	public void user_reached_to_search_result_page_with_the_title(String expectedtitle){
		System.out.println(driver.getTitle());
		System.out.println("EX: "+expectedtitle);
		Assert.assertEquals(getGoogleSearchPage.searchedResultPageTitle(), expectedtitle);
	}

//	@When("user types Selenium {double} in search input field, clicks on search button")
//	public void user_types_Selenium_in_search_input_field_clicks_on_search_button(Double double1) {
//		// Write code here that turns the phrase above into concrete actions
//		
//	}
//
//	@Then("user reached to search result page with the title Selenium {double} - Google Search")
//	public void user_reached_to_search_result_page_with_the_title_Selenium_Google_Search(Double double1) {
//		// Write code here that turns the phrase above into concrete actions
//		
//	}
//
//	@When("user types maruti share in search input field, clicks on search button")
//	public void user_types_maruti_share_in_search_input_field_clicks_on_search_button() {
//		// Write code here that turns the phrase above into concrete actions
//		
//	}
//
//	@Then("user reached to search result page with the title maruti share - Google Search")
//	public void user_reached_to_search_result_page_with_the_title_maruti_share_Google_Search() {
//		// Write code here that turns the phrase above into concrete actions
//		
//	}


}
