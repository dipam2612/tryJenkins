package backendPages_webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class ActiTimeLoginPage extends SeleniumUtility {

	WebDriver driver;
	public ActiTimeLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	private WebElement username;

	@FindBy(name = "pwd")
	private WebElement pwd;

	@FindBy(id = "loginButton")
	private WebElement loginbtn;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public void loginIntoActitme(String userid,String password) {
		typeInput(username, userid);
		typeInput(pwd,password);
		clickOnElement(loginbtn);
	}
	
}
