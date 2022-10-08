package com.projects;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class RunnerClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		ChromeOptions ch = new ChromeOptions();
			
		ch.addArguments("Incognito");         
				
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Concepts\\Driver1\\chromedriver.exe");
		   
	    WebDriver driver= new ChromeDriver(ch);

		driver.manage().window().maximize();
	    
	    driver.get("https://adactinhotelapp.com");	
	
	   //driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
	   
	   //driver.findElement(By.name("username")).sendKeys("nandha619");
	   
	  //driver.findElement(By.name("password")).sendKeys("10070318");
	   
	  //driver.findElement(By.xpath("//input[@id=\"re_password\"]")).sendKeys("10070318");
	   
	  //driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys("NANDHA KUMAR");
	   
	  //driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("nandharaina0310@gmail.com");
	
      //Thread.sleep(10000);
       
      //driver.findElement(By.xpath("//input[@type='checkbox']")).click();
       
      //driver.findElement(By.id("Submit")).click();
       
      //verification email parts
       
      WebElement user = driver.findElement(By.id("username"));
      user.sendKeys("nandha619");
      
      
      
      WebElement pass = driver.findElement(By.id("password"));
      pass.sendKeys("RQ7221");
      
      driver.findElement(By.id("login")).click();
      
      WebElement place = driver.findElement(By.xpath("//select[@name='location']"));
      place.click();
      
      Select s = new Select(place);
      
      s.selectByVisibleText("Melbourne");
      
      WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
      hotel.click();
      
      Select s1 =new Select(hotel);
      
      s1.selectByVisibleText("Hotel Sunshine");
      
      WebElement type = driver.findElement(By.xpath("//select[@name='room_type']"));
      
      Select s2 =new Select(type);
      
      s2.selectByIndex(4);
      
      WebElement rooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
      
      Select s3 =new Select(rooms);
    		  
      s3.selectByIndex(1);		  
      
      WebElement checkin = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
      
      checkin.clear();
      
      checkin.sendKeys("02/02/2022");
      
      WebElement checkout = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
      
      checkout.clear();
      
      checkout.sendKeys("04/02/2022");
      
      WebElement adults = driver.findElement(By.xpath("//select[@name='adult_room']"));
      
      Select s4 =new Select(adults);
      
      s4.selectByIndex(2);
      
      WebElement child = driver.findElement(By.xpath("(//select[@class='search_combobox'])[6]"));
      
      Select s8 =new Select(child);
      
      s8.selectByIndex(3);
      
      driver.findElement(By.id("Submit")).click();
      
      driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
      
      driver.findElement(By.id("continue")).click();
      
      driver.findElement(By.name("first_name")).sendKeys("NANDHA");
      
      driver.findElement(By.name("last_name")).sendKeys("KUMAR");
      
      driver.findElement(By.id("address")).sendKeys("2/21,pillaiyar kovil st,alinjivkkam,vadagarai post,ch-52");
      
      driver.findElement(By.name("cc_num")).sendKeys("1234432156788756");
      
      WebElement credttype = driver.findElement(By.xpath("//select[@class='select_combobox']"));
      
      Select s5 =new Select(credttype);
      
      s5.selectByIndex(3);
      
      WebElement month = driver.findElement(By.xpath("(//select[@class='select_combobox2'])[1]")); 
      
      Select s6 =new Select(month);
      
      s6.selectByIndex(4);
      
      WebElement year = driver.findElement(By.xpath("(//select[@class='select_combobox2'])[2]"));
      
      Select s7 =new Select(year);
      
      s7.selectByIndex(12);
      
      driver.findElement(By.xpath("(//input[@class=\"reg_input\"])[4]")).sendKeys("4569");
      
      driver.findElement(By.id("book_now")).click();
     
      Thread.sleep(5000);
      
      driver.findElement(By.xpath("//input[@value='My Itinerary']")).click();
      
      driver.findElement(By.id("logout")).click();
      
      TakesScreenshot ts =(TakesScreenshot)driver;   //narrowing type casting
	
	  File source = ts.getScreenshotAs(OutputType.FILE); //RETURN TYPE
	   
      File destination = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Concepts\\Screenshot\\image01.png");
	   
	  FileHandler.copy(source, destination);
	    		
      driver.close();	
      
      
      
      
    }
}