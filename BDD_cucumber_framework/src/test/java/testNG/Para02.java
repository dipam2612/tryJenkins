package testNG;

import org.testng.annotations.Test;

public class Para02 {

	@Test(priority=1)
	public void login() {
		System.out.println("Hello, I am login");
	}
	@Test(priority=2)
	public void sendEmail() {
		System.out.println("Hello, I am sendmail");
	}
	@Test(priority=3)
	public void logout() {
		System.out.println("Hello, I am logout");
	}
}

/**

By Default each @Test has priority as 0
lowest priority will get executed first
*/