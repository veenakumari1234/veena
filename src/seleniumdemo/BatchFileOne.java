package seleniumdemo;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class BatchFileOne {
	public class SkipTestCase {
		@Test
		public void testone()
		{
			System.out.println("My First Test Case");
			
		}
		@Test
		public void testtwo() throws Exception
		{
			System.out.println("My @nd Test Case");
			throw new SkipException("message");
		}
		@Test(dependsOnMethods="testtwo")
		public void testthree()
		{
			System.out.println("My Third Test Case");
		}

	}
}
