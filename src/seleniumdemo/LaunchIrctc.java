package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
public class LaunchIrctc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
	   // WebElement element = driver.findElement(By.xpath("/html/body/app-root/app-home/app-header/div[2]/div[2]/div[2]/nav/ul/li[6]/a"));
	WebElement element = driver.findElement(By.xpath("/html/body/app-root/app-home/app-header/div[2]/div[2]/div[2]/nav/ul/li[6]/a"));
		Actions actions = new Actions(driver);
	 actions.moveToElement(element).build().perform();
	 WebElement element1 = driver.findElement(By.cssSelector("li.menu-list:nth-child(6) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1) > span:nth-child(1)"));
	 element1.click();
}
}