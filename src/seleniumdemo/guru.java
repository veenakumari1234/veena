package seleniumdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
WebElement empid=driver.findElement(By.name("cusid"));
empid.sendKeys("12345");
WebElement button=driver.findElement(By.name("submit"));
button.click();
Alert obj=driver.switchTo().alert();
Thread.sleep(5000);
obj.accept();
	}

}
 