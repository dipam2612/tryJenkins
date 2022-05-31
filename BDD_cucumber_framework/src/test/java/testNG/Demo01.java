package testNG;

import org.testng.annotations.Test;

public class Demo01 {
	@Test(invocationCount=5)
	public void test01() {
		System.out.println("Hello, I am dipam");
	}

}
