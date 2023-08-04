package testNG;

import org.testng.annotations.Test;

public class Priority_TestNG {
	@Test
	public void test1() {
		System.out.println("Hi test1");
	}
	@Test(enabled=false)
	public void test2() {
		System.out.println("Hi test2");
	}
	@Test(priority =-1,invocationCount=2)
	public void test3() {
		System.out.println("Hi test3");
	}
	
}
