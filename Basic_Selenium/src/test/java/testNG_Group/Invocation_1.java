package testNG_Group;

import org.testng.annotations.Test;

public class Invocation_1 {
	@Test(groups="smoke")
	public void test1() {
		System.out.println("Hi");
	}
	@Test
	public void test2() {
		System.out.println("Java");
	}

}
