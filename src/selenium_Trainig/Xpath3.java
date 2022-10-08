package selenium_Trainig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath3{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	   System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ADMIN\\\\eclipse-workspace\\\\Selenium_Concepts\\\\Driver\\\\chromedriver.exe");
		
	   WebDriver driver =new ChromeDriver();
	   
	   driver.get("https://www.youtube.com/");
		
	   driver.manage().window().maximize();
		
	   WebElement user = driver.findElement(By.xpath("//input[@autocapitalize='none']"));
	   user.sendKeys("wwe");
	   Thread.sleep(2000);
	   
	   WebElement cck = driver.findElement(By.xpath("//button[contains(@id,'search-icon-legacy')]"));
	   cck.click();
	   Thread.sleep(2000);
	   
	   driver.navigate().to("https://www.cricket.com./");
	   Thread.sleep(2000);
	   
	   WebElement nandha =driver.findElement(By.xpath("//div[contains(text(),'Fantasy')]"));
	   nandha.click();
	   Thread.sleep(2000);
	   
	   driver.navigate().back();
	   
	   WebElement scl =driver.findElement(By.xpath("//div[text()='Schedule']"));
	   scl.click();
	   Thread.sleep(2000);
	   
	   WebElement live = driver.findElement(By.xpath("(//h2[@class='f6 fw5'])[2]"));
	   live.click();
	   Thread.sleep(2000);
	  
	

	   
		
	}

}