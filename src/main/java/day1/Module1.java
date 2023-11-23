package day1;

import org.testng.annotations.Test;

public class Module1 {
	
	@Test(enabled = false)
	public void test1()
	{
		System.out.println("test1 method....");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2 method....");
	}

}
