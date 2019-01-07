package seleniumdemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
String actualTitle = "veena";
String expectedTitle = "Abhay";
SoftAssert softassert = new SoftAssert();

@Test
public void method1()
{
	System.out.println("Before Assert");
	softassert.assertEquals(actualTitle , expectedTitle);
	//Assert.assertEquals(actualTitle , expectedTitle);
	System.out.println("After Assert");
	softassert.assertAll();
	
}
}
