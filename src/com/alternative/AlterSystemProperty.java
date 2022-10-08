package com.alternative;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlterSystemProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		
        WebDriver driver= new ChromeDriver(); // Upcasting & dynamic

		driver.get("https://www.google.com");

		driver.manage().window().maximize();





	}

}