package com.alternative;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlterRefresh {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver(); // Upcasting & dynamic

		driver.manage().window().maximize();

		driver.get("https://www.youtube.com");

		WebElement user = driver.findElement(By.xpath("//input[@autocapitalize='none']"));
		user.sendKeys("wwe");
		Thread.sleep(2000);

		
		//Refresh command
		//driver.navigate().refresh();
		
		//Get Current Url
		//driver.get(driver.getCurrentUrl());
		
	
		//JavascriptExecutor
		//JavascriptExecutor executor = (JavascriptExecutor) driver;
		//executor.executeScript("location.reload()");//history.go(0);
		
	    Robot robot = new Robot();
	    
	    robot.keyPress(KeyEvent.VK_F5);
	    robot.keyRelease(KeyEvent.VK_F5);
	    
		
		
		
		
		
		
	
	
	
	
	
	
	
	}

}