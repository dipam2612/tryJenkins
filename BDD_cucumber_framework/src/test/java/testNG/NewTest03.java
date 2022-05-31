package testNG;

import org.testng.annotations.Test;

public class NewTest03 {
	@Test
	public void abc() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("hello ram");
	}
	@Test
	public void ab() {
		System.out.println("hello shyam");
	}
	
}
/**
if testng class contains more dn one test method
 dn all the test method will be executed in
alphabetical order
*/