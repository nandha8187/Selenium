package online;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ADMIN\\\\eclipse-workspace\\\\Selenium_Concepts\\\\Driver\\\\chromedriver.exe");
	    
		WebDriver driver= new ChromeDriver(); // Upcasting & dynamic
		    
		driver.get("http://www.leafground.com/pages/Edit.html");
		    
		driver.manage().window().maximize();
		
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("nandharaina0310@gmail.com");
		
		WebElement appendbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		appendbox.sendKeys("text");
		
		WebElement getTextBox = driver.findElement(By.name("username"));
		String value=getTextBox.getAttribute("value");
		 
		System.out.println(value);
		
		 WebElement clearBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		 clearBox.clear(); 
	
		 WebElement disableBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
         boolean enabled =disableBox.isEnabled();	
	     System.out.println(enabled);
	
	
	
  
	     
	
	}

}