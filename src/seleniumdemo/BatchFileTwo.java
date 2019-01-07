package seleniumdemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BatchFileTwo {
	String actualTitle = "veena";
	String expectedTitle = "Abhay";
	String actualName = "golu";
	String excpectedName ="ipshita";
	
	@Test
	public void method1()
	{
		System.out.println("Before Assert");
		
		Assert.assertEquals(actualTitle , expectedTitle);
		System.out.println("After Assert");
		
		
	}
	
	@Test
	public void method2()
	{
		
		Assert.assertEquals(actualTitle , expectedTitle);
	}

	@Test
	public void method3()
	{
		System.out.println("Pass");
	}

}

