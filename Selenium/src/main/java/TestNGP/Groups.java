package TestNGP;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups="sanity")
	public void test1()
	{
		System.out.println("This is from sanity1");
	}
	
	@Test(groups="regression")
	public void test2()
	{
		System.out.println("This is from regression");
	}
	
	@Test(groups="sanity")
	public void test3()
	{
		System.out.println("This is from sanity3");
	}

}
