package online;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckoDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Concepts\\Driver\\geckodriver.exe");

		WebDriver driver= new FirefoxDriver(); // Upcasting & dynamic

		driver.manage().window().maximize();

		driver.get("http://www.youtube.com");
		
		WebElement searchContext = driver.findElement(By.xpath("//input[@id='search']"));
        searchContext.sendKeys("wwe wrestlemania 2022");
		
		WebElement clickButton = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		clickButton.click();
       
		Thread.sleep(5000);
		WebElement play = driver.findElement(By.id("video-title"));

		play.click();










	}

}