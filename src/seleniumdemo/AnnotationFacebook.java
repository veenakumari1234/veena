package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationFacebook {
	WebDriver driver;
	@BeforeTest
	public void launchbrauser()
	{
	 
	
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void logincheck()
	{
		driver.findElement(By.id("email")).sendKeys("k.veena1@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("lizabhay");
		System.out.println("login success");

}

@AfterTest
public void closebrowser()
{
	driver.close();
}
}
