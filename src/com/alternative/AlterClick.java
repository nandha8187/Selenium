package com.alternative;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlterClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver(); // Upcasting & dynamic

		driver.manage().window().maximize();

		driver.navigate().to("https://www.youtube.com");

		WebElement user = driver.findElement(By.xpath("//input[@autocapitalize='none']"));
		user.sendKeys("wwe");
		Thread.sleep(2000);


		WebElement searchContext = driver.findElement(By.id("search-icon-legacy"));
		
		searchContext.sendKeys(Keys.ENTER);


	}

}