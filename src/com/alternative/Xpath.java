package com.alternative;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver(); // Upcasting & dynamic

		driver.manage().window().maximize();

		driver.navigate().to("https://www.google.com");
		
		WebElement detail = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        detail.sendKeys("google");
        
        
        
		
		
		
		












	}

}