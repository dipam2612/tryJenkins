package backendPages_webpage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class GoogleSearch extends SeleniumUtility{

	WebDriver driver;
	public GoogleSearch(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="q")
	private WebElement searchInputField;

	public WebElement getSearchInputField() {
		return searchInputField;
	}

	public void searchText(String text) {

		typeInput(searchInputField, text);
		getActiveElement().sendKeys(Keys.ENTER);
	}

	public String searchedResultPageTitle() {
		return getCurrentTitleOfApplication();
	}
	
}
