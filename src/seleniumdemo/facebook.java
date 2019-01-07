package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
String a = driver.getTitle();
System.out.println(a);
//driver.findElement(By.id(""email"")).sendkeys(a);	
driver.findElement(By.id("email")).sendKeys("abcd");
driver.findElement(By.xpath("//*[@id='u_0_j']")).sendKeys("fhhg");
driver.findElement(By.name("lastname")).sendKeys("abcd");
//driver.findElement((By.)
	}
}
