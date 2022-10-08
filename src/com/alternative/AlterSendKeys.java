package com.alternative;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlterSendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver(); // Upcasting & dynamic

		driver.manage().window().maximize();

		driver.navigate().to("https://www.youtube.com");

		WebElement user = driver.findElement(By.xpath("//input[@autocapitalize='none']"));


		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].value='wwe';", user);	
		
	
	
	
	
	
	}

}