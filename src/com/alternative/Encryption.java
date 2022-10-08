package com.alternative;

import java.util.Base64;
import java.util.Base64.Decoder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver(); // Upcasting & dynamic

		driver.manage().window().maximize();

		driver.get("https://demo.nopcommerce.com/login");

		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("nandhakuamr.ec.engg@gmail.com");

		driver.findElement(By.id("Password")).sendKeys(decodeString("nadha619"));

		driver.findElement(By.xpath("//button[text()='Log in']")).click();	
	}
	static String	decodeString(String password)

	{

		byte[] decodeBytes = Base64.getDecoder().decode(password.getBytes());
		return(new String(decodeBytes));	



	}
}



