package selenium_Trainig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ADMIN\\\\eclipse-workspace\\\\Selenium_Concepts\\\\Driver\\\\chromedriver.exe");
    
	     WebDriver driver =new ChromeDriver();           	
		
		 driver.get("https://www.fb.com/");
		
		 driver.manage().window().maximize();
		
	     WebElement user = driver.findElement(By.id("email"));   //findElemet will return single webElement
	     
	     user.sendKeys("abc@gmail.com");                         //webElementmethods 1) sendkeys
	     
	     WebElement pass =driver.findElement(By.id("pass"));
	     
	     pass.sendKeys("1253566");                                //webElementmethods 1) sendkeys

	     WebElement login = driver.findElement(By.name("login"));
	     
		login.click();                                        //webElementmethods 2)click
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}