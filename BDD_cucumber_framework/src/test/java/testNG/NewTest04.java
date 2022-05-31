package testNG;

import org.testng.annotations.Test;

public class NewTest04 {
	@Test
	public void tc8() {
		displayDetails();
		System.out.println("Hello, I am TC8 from NewTest04 class");
	}

	@Test
	public void tc7() {
		System.out.println("Hello, I am TC7 from NewTest04 class");
		displayDetails();
	}
	
	void displayDetails() {
		System.out.println("I am display method of NewTest04 class");
	}
}
