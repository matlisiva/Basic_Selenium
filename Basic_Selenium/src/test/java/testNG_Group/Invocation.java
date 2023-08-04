package testNG_Group;

import org.testng.annotations.Test;

public class Invocation {
	@Test
	public void test1() {
		System.out.println("Hello");
	}
	@Test(groups="smoke")
	public void test2() {
		System.out.println("Selenium");
	}

}
